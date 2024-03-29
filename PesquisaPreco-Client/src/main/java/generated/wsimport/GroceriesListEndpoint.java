
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
@WebService(name = "GroceriesListEndpoint", targetNamespace = "http://endpoint/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GroceriesListEndpoint {


    /**
     * 
     * @param arg0
     * @throws IOException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "registerItemsToGroceriesList", targetNamespace = "http://endpoint/", className = "generated.wsimport.RegisterItemsToGroceriesList")
    @ResponseWrapper(localName = "registerItemsToGroceriesListResponse", targetNamespace = "http://endpoint/", className = "generated.wsimport.RegisterItemsToGroceriesListResponse")
    @Action(input = "http://endpoint/GroceriesListEndpoint/registerItemsToGroceriesListRequest", output = "http://endpoint/GroceriesListEndpoint/registerItemsToGroceriesListResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://endpoint/GroceriesListEndpoint/registerItemsToGroceriesList/Fault/IOException")
    })
    public void registerItemsToGroceriesList(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0)
        throws IOException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws IOException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "registerNewGroceriesList", targetNamespace = "http://endpoint/", className = "generated.wsimport.RegisterNewGroceriesList")
    @ResponseWrapper(localName = "registerNewGroceriesListResponse", targetNamespace = "http://endpoint/", className = "generated.wsimport.RegisterNewGroceriesListResponse")
    @Action(input = "http://endpoint/GroceriesListEndpoint/registerNewGroceriesListRequest", output = "http://endpoint/GroceriesListEndpoint/registerNewGroceriesListResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://endpoint/GroceriesListEndpoint/registerNewGroceriesList/Fault/IOException")
    })
    public void registerNewGroceriesList(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0)
        throws IOException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchGroceriesList", targetNamespace = "http://endpoint/", className = "generated.wsimport.SearchGroceriesList")
    @ResponseWrapper(localName = "searchGroceriesListResponse", targetNamespace = "http://endpoint/", className = "generated.wsimport.SearchGroceriesListResponse")
    @Action(input = "http://endpoint/GroceriesListEndpoint/searchGroceriesListRequest", output = "http://endpoint/GroceriesListEndpoint/searchGroceriesListResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://endpoint/GroceriesListEndpoint/searchGroceriesList/Fault/IOException")
    })
    public List<String> searchGroceriesList()
        throws IOException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws IOException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteGroceriesList", targetNamespace = "http://endpoint/", className = "generated.wsimport.DeleteGroceriesList")
    @ResponseWrapper(localName = "deleteGroceriesListResponse", targetNamespace = "http://endpoint/", className = "generated.wsimport.DeleteGroceriesListResponse")
    @Action(input = "http://endpoint/GroceriesListEndpoint/deleteGroceriesListRequest", output = "http://endpoint/GroceriesListEndpoint/deleteGroceriesListResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://endpoint/GroceriesListEndpoint/deleteGroceriesList/Fault/IOException")
    })
    public void deleteGroceriesList(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0)
        throws IOException_Exception
    ;

}
