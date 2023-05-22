
package generated.wsimport;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductEndpoint", targetNamespace = "http://endpoint/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductEndpoint {


    /**
     * 
     * @param arg0
     * @throws IOException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteProduct", targetNamespace = "http://endpoint/", className = "generated.wsimport.DeleteProduct")
    @ResponseWrapper(localName = "deleteProductResponse", targetNamespace = "http://endpoint/", className = "generated.wsimport.DeleteProductResponse")
    @Action(input = "http://endpoint/ProductEndpoint/deleteProductRequest", output = "http://endpoint/ProductEndpoint/deleteProductResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://endpoint/ProductEndpoint/deleteProduct/Fault/IOException")
    })
    public void deleteProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        Product arg0)
        throws IOException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws IOException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "registerProduct", targetNamespace = "http://endpoint/", className = "generated.wsimport.RegisterProduct")
    @ResponseWrapper(localName = "registerProductResponse", targetNamespace = "http://endpoint/", className = "generated.wsimport.RegisterProductResponse")
    @Action(input = "http://endpoint/ProductEndpoint/registerProductRequest", output = "http://endpoint/ProductEndpoint/registerProductResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://endpoint/ProductEndpoint/registerProduct/Fault/IOException")
    })
    public void registerProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        Product arg0)
        throws IOException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<generated.wsimport.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchProduct", targetNamespace = "http://endpoint/", className = "generated.wsimport.SearchProduct")
    @ResponseWrapper(localName = "searchProductResponse", targetNamespace = "http://endpoint/", className = "generated.wsimport.SearchProductResponse")
    @Action(input = "http://endpoint/ProductEndpoint/searchProductRequest", output = "http://endpoint/ProductEndpoint/searchProductResponse")
    public List<Product> searchProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}