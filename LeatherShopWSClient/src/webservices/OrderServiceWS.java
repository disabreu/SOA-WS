
package webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrderServiceWS", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderServiceWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservices.Orders>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrders", targetNamespace = "http://webservices/", className = "webservices.GetOrders")
    @ResponseWrapper(localName = "getOrdersResponse", targetNamespace = "http://webservices/", className = "webservices.GetOrdersResponse")
    @Action(input = "http://webservices/OrderServiceWS/getOrdersRequest", output = "http://webservices/OrderServiceWS/getOrdersResponse")
    public List<Orders> getOrders(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservices.Customers>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustInfo", targetNamespace = "http://webservices/", className = "webservices.GetCustInfo")
    @ResponseWrapper(localName = "getCustInfoResponse", targetNamespace = "http://webservices/", className = "webservices.GetCustInfoResponse")
    @Action(input = "http://webservices/OrderServiceWS/getCustInfoRequest", output = "http://webservices/OrderServiceWS/getCustInfoResponse")
    public List<Customers> getCustInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<webservices.Products>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductsWithoutOrders", targetNamespace = "http://webservices/", className = "webservices.GetProductsWithoutOrders")
    @ResponseWrapper(localName = "getProductsWithoutOrdersResponse", targetNamespace = "http://webservices/", className = "webservices.GetProductsWithoutOrdersResponse")
    @Action(input = "http://webservices/OrderServiceWS/getProductsWithoutOrdersRequest", output = "http://webservices/OrderServiceWS/getProductsWithoutOrdersResponse")
    public List<Products> getProductsWithoutOrders();

    /**
     * 
     * @return
     *     returns java.util.List<webservices.Customers>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomersWithPendingOrders", targetNamespace = "http://webservices/", className = "webservices.GetCustomersWithPendingOrders")
    @ResponseWrapper(localName = "getCustomersWithPendingOrdersResponse", targetNamespace = "http://webservices/", className = "webservices.GetCustomersWithPendingOrdersResponse")
    @Action(input = "http://webservices/OrderServiceWS/getCustomersWithPendingOrdersRequest", output = "http://webservices/OrderServiceWS/getCustomersWithPendingOrdersResponse")
    public List<Customers> getCustomersWithPendingOrders();

    /**
     * 
     * @return
     *     returns java.util.List<webservices.Products>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductsWithPendingOrders", targetNamespace = "http://webservices/", className = "webservices.GetProductsWithPendingOrders")
    @ResponseWrapper(localName = "getProductsWithPendingOrdersResponse", targetNamespace = "http://webservices/", className = "webservices.GetProductsWithPendingOrdersResponse")
    @Action(input = "http://webservices/OrderServiceWS/getProductsWithPendingOrdersRequest", output = "http://webservices/OrderServiceWS/getProductsWithPendingOrdersResponse")
    public List<Products> getProductsWithPendingOrders();

}
