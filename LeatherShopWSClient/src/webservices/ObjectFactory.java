
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
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

    private final static QName _GetCustInfoResponse_QNAME = new QName("http://webservices/", "getCustInfoResponse");
    private final static QName _GetCustInfo_QNAME = new QName("http://webservices/", "getCustInfo");
    private final static QName _GetCustomersWithPendingOrdersResponse_QNAME = new QName("http://webservices/", "getCustomersWithPendingOrdersResponse");
    private final static QName _GetOrders_QNAME = new QName("http://webservices/", "getOrders");
    private final static QName _GetProductsWithoutOrdersResponse_QNAME = new QName("http://webservices/", "getProductsWithoutOrdersResponse");
    private final static QName _GetCustomersWithPendingOrders_QNAME = new QName("http://webservices/", "getCustomersWithPendingOrders");
    private final static QName _GetProductsWithPendingOrdersResponse_QNAME = new QName("http://webservices/", "getProductsWithPendingOrdersResponse");
    private final static QName _GetProductsWithoutOrders_QNAME = new QName("http://webservices/", "getProductsWithoutOrders");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://webservices/", "getOrdersResponse");
    private final static QName _GetProductsWithPendingOrders_QNAME = new QName("http://webservices/", "getProductsWithPendingOrders");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductsWithPendingOrders }
     * 
     */
    public GetProductsWithPendingOrders createGetProductsWithPendingOrders() {
        return new GetProductsWithPendingOrders();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link GetProductsWithPendingOrdersResponse }
     * 
     */
    public GetProductsWithPendingOrdersResponse createGetProductsWithPendingOrdersResponse() {
        return new GetProductsWithPendingOrdersResponse();
    }

    /**
     * Create an instance of {@link GetProductsWithoutOrders }
     * 
     */
    public GetProductsWithoutOrders createGetProductsWithoutOrders() {
        return new GetProductsWithoutOrders();
    }

    /**
     * Create an instance of {@link GetCustomersWithPendingOrders }
     * 
     */
    public GetCustomersWithPendingOrders createGetCustomersWithPendingOrders() {
        return new GetCustomersWithPendingOrders();
    }

    /**
     * Create an instance of {@link GetProductsWithoutOrdersResponse }
     * 
     */
    public GetProductsWithoutOrdersResponse createGetProductsWithoutOrdersResponse() {
        return new GetProductsWithoutOrdersResponse();
    }

    /**
     * Create an instance of {@link GetCustInfo }
     * 
     */
    public GetCustInfo createGetCustInfo() {
        return new GetCustInfo();
    }

    /**
     * Create an instance of {@link GetCustomersWithPendingOrdersResponse }
     * 
     */
    public GetCustomersWithPendingOrdersResponse createGetCustomersWithPendingOrdersResponse() {
        return new GetCustomersWithPendingOrdersResponse();
    }

    /**
     * Create an instance of {@link GetOrders }
     * 
     */
    public GetOrders createGetOrders() {
        return new GetOrders();
    }

    /**
     * Create an instance of {@link GetCustInfoResponse }
     * 
     */
    public GetCustInfoResponse createGetCustInfoResponse() {
        return new GetCustInfoResponse();
    }

    /**
     * Create an instance of {@link Products }
     * 
     */
    public Products createProducts() {
        return new Products();
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link Customers }
     * 
     */
    public Customers createCustomers() {
        return new Customers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getCustInfoResponse")
    public JAXBElement<GetCustInfoResponse> createGetCustInfoResponse(GetCustInfoResponse value) {
        return new JAXBElement<GetCustInfoResponse>(_GetCustInfoResponse_QNAME, GetCustInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getCustInfo")
    public JAXBElement<GetCustInfo> createGetCustInfo(GetCustInfo value) {
        return new JAXBElement<GetCustInfo>(_GetCustInfo_QNAME, GetCustInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersWithPendingOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getCustomersWithPendingOrdersResponse")
    public JAXBElement<GetCustomersWithPendingOrdersResponse> createGetCustomersWithPendingOrdersResponse(GetCustomersWithPendingOrdersResponse value) {
        return new JAXBElement<GetCustomersWithPendingOrdersResponse>(_GetCustomersWithPendingOrdersResponse_QNAME, GetCustomersWithPendingOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getOrders")
    public JAXBElement<GetOrders> createGetOrders(GetOrders value) {
        return new JAXBElement<GetOrders>(_GetOrders_QNAME, GetOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsWithoutOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getProductsWithoutOrdersResponse")
    public JAXBElement<GetProductsWithoutOrdersResponse> createGetProductsWithoutOrdersResponse(GetProductsWithoutOrdersResponse value) {
        return new JAXBElement<GetProductsWithoutOrdersResponse>(_GetProductsWithoutOrdersResponse_QNAME, GetProductsWithoutOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersWithPendingOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getCustomersWithPendingOrders")
    public JAXBElement<GetCustomersWithPendingOrders> createGetCustomersWithPendingOrders(GetCustomersWithPendingOrders value) {
        return new JAXBElement<GetCustomersWithPendingOrders>(_GetCustomersWithPendingOrders_QNAME, GetCustomersWithPendingOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsWithPendingOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getProductsWithPendingOrdersResponse")
    public JAXBElement<GetProductsWithPendingOrdersResponse> createGetProductsWithPendingOrdersResponse(GetProductsWithPendingOrdersResponse value) {
        return new JAXBElement<GetProductsWithPendingOrdersResponse>(_GetProductsWithPendingOrdersResponse_QNAME, GetProductsWithPendingOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsWithoutOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getProductsWithoutOrders")
    public JAXBElement<GetProductsWithoutOrders> createGetProductsWithoutOrders(GetProductsWithoutOrders value) {
        return new JAXBElement<GetProductsWithoutOrders>(_GetProductsWithoutOrders_QNAME, GetProductsWithoutOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsWithPendingOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getProductsWithPendingOrders")
    public JAXBElement<GetProductsWithPendingOrders> createGetProductsWithPendingOrders(GetProductsWithPendingOrders value) {
        return new JAXBElement<GetProductsWithPendingOrders>(_GetProductsWithPendingOrders_QNAME, GetProductsWithPendingOrders.class, null, value);
    }

}
