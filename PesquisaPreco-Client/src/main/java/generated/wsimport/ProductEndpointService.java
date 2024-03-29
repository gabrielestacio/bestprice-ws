
package generated.wsimport;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductEndpointService", targetNamespace = "http://endpoint/", wsdlLocation = "http://localhost:8081/product?wsdl")
public class ProductEndpointService
    extends Service
{

    private final static URL PRODUCTENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTENDPOINTSERVICE_EXCEPTION;
    private final static QName PRODUCTENDPOINTSERVICE_QNAME = new QName("http://endpoint/", "ProductEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/product?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTENDPOINTSERVICE_WSDL_LOCATION = url;
        PRODUCTENDPOINTSERVICE_EXCEPTION = e;
    }

    public ProductEndpointService() {
        super(__getWsdlLocation(), PRODUCTENDPOINTSERVICE_QNAME);
    }

    public ProductEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTENDPOINTSERVICE_QNAME, features);
    }

    public ProductEndpointService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTENDPOINTSERVICE_QNAME);
    }

    public ProductEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTENDPOINTSERVICE_QNAME, features);
    }

    public ProductEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductEndpoint
     */
    @WebEndpoint(name = "ProductEndpointPort")
    public ProductEndpoint getProductEndpointPort() {
        return super.getPort(new QName("http://endpoint/", "ProductEndpointPort"), ProductEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductEndpoint
     */
    @WebEndpoint(name = "ProductEndpointPort")
    public ProductEndpoint getProductEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint/", "ProductEndpointPort"), ProductEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTENDPOINTSERVICE_EXCEPTION!= null) {
            throw PRODUCTENDPOINTSERVICE_EXCEPTION;
        }
        return PRODUCTENDPOINTSERVICE_WSDL_LOCATION;
    }

}
