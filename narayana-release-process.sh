#!/bin/bash
read -p "You will need: VPN, credentials for jbosstm@filemgmt, jira admin, github permissions on all jbosstm/ repo. Do you have these?" ENVOK
if [[ $ENVOK == n* ]]
then
  exit
fi
if [ $# -lt 2 ]; then
  echo 1>&2 "$0: not enough arguments: CURRENT NEXT (versions should end in .Final or similar)"
  exit 2
elif [ $# -gt 2 ]; then
  echo 1>&2 "$0: too many arguments: CURRENT NEXT (versions should end in .Final or similar)"
  exit 2
else
  WFLYISSUE=$4
fi

export CURRENT=$1
export NEXT=$2
set +e
git fetch upstream --tags
git tag | grep $CURRENT
if [[ $? != 0 ]]
then
  set -e
  git checkout 4.17
  git log -n 10
  echo Mark version as released in Jira and create next version: https://issues.jboss.org/plugins/servlet/project-config/JBTM/versions
  echo Make sure you have the credentials in your .m2/settings.xml and ignore an error in the final module about missing javadocs
  echo Watch out for sed -i "" in the pre-release.sh as it is does not work on Cygwin
  read -p "Did the log before look OK?" ok
  (cd ./scripts/ ; ./pre-release.sh $CURRENT $NEXT)
else
  set -e
  ok=y
fi

if [[ $ok == y* ]]
then
  git fetch upstream
  git checkout $CURRENT
  git clean -f -d
  # Add -x (this will delete all files (e.g. IDE, new features) not under source control)
  mvn clean deploy -Prelease,all -Dmaven.javadoc.skip=true -DskipTests
fi