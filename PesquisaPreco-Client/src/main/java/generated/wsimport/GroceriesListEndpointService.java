
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
@WebServiceClient(name = "GroceriesListEndpointService", targetNamespace = "http://endpoint/", wsdlLocation = "http://localhost:8081/grocerieslist?wsdl")
public class GroceriesListEndpointService
    extends Service
{

    private final static URL GROCERIESLISTENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException GROCERIESLISTENDPOINTSERVICE_EXCEPTION;
    private final static QName GROCERIESLISTENDPOINTSERVICE_QNAME = new QName("http://endpoint/", "GroceriesListEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/grocerieslist?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GROCERIESLISTENDPOINTSERVICE_WSDL_LOCATION = url;
        GROCERIESLISTENDPOINTSERVICE_EXCEPTION = e;
    }

    public GroceriesListEndpointService() {
        super(__getWsdlLocation(), GROCERIESLISTENDPOINTSERVICE_QNAME);
    }

    public GroceriesListEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GROCERIESLISTENDPOINTSERVICE_QNAME, features);
    }

    public GroceriesListEndpointService(URL wsdlLocation) {
        super(wsdlLocation, GROCERIESLISTENDPOINTSERVICE_QNAME);
    }

    public GroceriesListEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GROCERIESLISTENDPOINTSERVICE_QNAME, features);
    }

    public GroceriesListEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GroceriesListEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GroceriesListEndpoint
     */
    @WebEndpoint(name = "GroceriesListEndpointPort")
    public GroceriesListEndpoint getGroceriesListEndpointPort() {
        return super.getPort(new QName("http://endpoint/", "GroceriesListEndpointPort"), GroceriesListEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GroceriesListEndpoint
     */
    @WebEndpoint(name = "GroceriesListEndpointPort")
    public GroceriesListEndpoint getGroceriesListEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint/", "GroceriesListEndpointPort"), GroceriesListEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GROCERIESLISTENDPOINTSERVICE_EXCEPTION!= null) {
            throw GROCERIESLISTENDPOINTSERVICE_EXCEPTION;
        }
        return GROCERIESLISTENDPOINTSERVICE_WSDL_LOCATION;
    }

}
