//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 08:44:39 PM BST 
//

package io.narayana.sra.client.extended.txstatusext;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jboss.jbossts.star.util.media.txstatusext package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Coordinator_QNAME = new QName("", "coordinator");
    private final static QName _TransactionManager_QNAME = new QName("", "transaction-manager");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.jbossts.star.util.media.txstatusext
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CoordinatorElement }
     * 
     */
    public CoordinatorElement createCoordinatorElement() {
        return new CoordinatorElement();
    }

    /**
     * Create an instance of {@link ParticipantElement }
     * 
     */
    public ParticipantElement createParticipantElement() {
        return new ParticipantElement();
    }

    /**
     * Create an instance of {@link TransactionManagerElement }
     * 
     */
    public TransactionManagerElement createTransactionManagerElement() {
        return new TransactionManagerElement();
    }

    /**
     * Create an instance of {@link TwoPhaseUnawareParticipantElement }
     * 
     */
    public TwoPhaseUnawareParticipantElement createTwoPhaseUnawareParticipantElement() {
        return new TwoPhaseUnawareParticipantElement();
    }

    /**
     * Create an instance of {@link TwoPhaseAwareParticipantElement }
     * 
     */
    public TwoPhaseAwareParticipantElement createTwoPhaseAwareParticipantElement() {
        return new TwoPhaseAwareParticipantElement();
    }

    /**
     * Create an instance of {@link TransactionStatisticsElement }
     * 
     */
    public TransactionStatisticsElement createTransactionStatisticsElement() {
        return new TransactionStatisticsElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinatorElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "coordinator")
    public JAXBElement<CoordinatorElement> createCoordinator(CoordinatorElement value) {
        return new JAXBElement<CoordinatorElement>(_Coordinator_QNAME, CoordinatorElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionManagerElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transaction-manager")
    public JAXBElement<TransactionManagerElement> createTransactionManager(TransactionManagerElement value) {
        return new JAXBElement<TransactionManagerElement>(_TransactionManager_QNAME, TransactionManagerElement.class, null, value);
    }

}