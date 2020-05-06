
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
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

    private final static QName _DecimalParaHexaResponse_QNAME = new QName("http://control/", "decimalParaHexaResponse");
    private final static QName _DecimalParaHexa_QNAME = new QName("http://control/", "decimalParaHexa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecimalParaHexa }
     * 
     */
    public DecimalParaHexa createDecimalParaHexa() {
        return new DecimalParaHexa();
    }

    /**
     * Create an instance of {@link DecimalParaHexaResponse }
     * 
     */
    public DecimalParaHexaResponse createDecimalParaHexaResponse() {
        return new DecimalParaHexaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecimalParaHexaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "decimalParaHexaResponse")
    public JAXBElement<DecimalParaHexaResponse> createDecimalParaHexaResponse(DecimalParaHexaResponse value) {
        return new JAXBElement<DecimalParaHexaResponse>(_DecimalParaHexaResponse_QNAME, DecimalParaHexaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecimalParaHexa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "decimalParaHexa")
    public JAXBElement<DecimalParaHexa> createDecimalParaHexa(DecimalParaHexa value) {
        return new JAXBElement<DecimalParaHexa>(_DecimalParaHexa_QNAME, DecimalParaHexa.class, null, value);
    }

}
