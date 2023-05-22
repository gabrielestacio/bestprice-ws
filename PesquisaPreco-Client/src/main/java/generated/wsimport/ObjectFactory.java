
package generated.wsimport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.wsimport package. 
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

    private final static QName _SearchBestOffers_QNAME = new QName("http://endpoint/", "searchBestOffers");
    private final static QName _SearchBestOffersResponse_QNAME = new QName("http://endpoint/", "searchBestOffersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.wsimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchBestOffers }
     * 
     */
    public SearchBestOffers createSearchBestOffers() {
        return new SearchBestOffers();
    }

    /**
     * Create an instance of {@link SearchBestOffersResponse }
     * 
     */
    public SearchBestOffersResponse createSearchBestOffersResponse() {
        return new SearchBestOffersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBestOffers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchBestOffers }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "searchBestOffers")
    public JAXBElement<SearchBestOffers> createSearchBestOffers(SearchBestOffers value) {
        return new JAXBElement<SearchBestOffers>(_SearchBestOffers_QNAME, SearchBestOffers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBestOffersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchBestOffersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "searchBestOffersResponse")
    public JAXBElement<SearchBestOffersResponse> createSearchBestOffersResponse(SearchBestOffersResponse value) {
        return new JAXBElement<SearchBestOffersResponse>(_SearchBestOffersResponse_QNAME, SearchBestOffersResponse.class, null, value);
    }

}
