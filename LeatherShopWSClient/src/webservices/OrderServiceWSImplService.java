
package webservices;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OrderServiceWSImplService", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/LeatherShopWS/LeatherShopWS?wsdl")
public class OrderServiceWSImplService
    extends Service
{

    private final static URL ORDERSERVICEWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORDERSERVICEWSIMPLSERVICE_EXCEPTION;
    private final static QName ORDERSERVICEWSIMPLSERVICE_QNAME = new QName("http://webservices/", "OrderServiceWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/LeatherShopWS/LeatherShopWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ORDERSERVICEWSIMPLSERVICE_WSDL_LOCATION = url;
        ORDERSERVICEWSIMPLSERVICE_EXCEPTION = e;
    }

    public OrderServiceWSImplService() {
        super(__getWsdlLocation(), ORDERSERVICEWSIMPLSERVICE_QNAME);
    }

    public OrderServiceWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ORDERSERVICEWSIMPLSERVICE_QNAME, features);
    }

    public OrderServiceWSImplService(URL wsdlLocation) {
        super(wsdlLocation, ORDERSERVICEWSIMPLSERVICE_QNAME);
    }

    public OrderServiceWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ORDERSERVICEWSIMPLSERVICE_QNAME, features);
    }

    public OrderServiceWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderServiceWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OrderServiceWS
     */
    @WebEndpoint(name = "OrderServiceWSImplPort")
    public OrderServiceWS getOrderServiceWSImplPort() {
        return super.getPort(new QName("http://webservices/", "OrderServiceWSImplPort"), OrderServiceWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderServiceWS
     */
    @WebEndpoint(name = "OrderServiceWSImplPort")
    public OrderServiceWS getOrderServiceWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "OrderServiceWSImplPort"), OrderServiceWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORDERSERVICEWSIMPLSERVICE_EXCEPTION!= null) {
            throw ORDERSERVICEWSIMPLSERVICE_EXCEPTION;
        }
        return ORDERSERVICEWSIMPLSERVICE_WSDL_LOCATION;
    }

}