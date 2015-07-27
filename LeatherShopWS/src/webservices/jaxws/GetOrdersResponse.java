
package webservices.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getOrdersResponse", namespace = "http://webservices/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrdersResponse", namespace = "http://webservices/")
public class GetOrdersResponse {

    @XmlElement(name = "return", namespace = "")
    private List<service.Orders> _return;

    /**
     * 
     * @return
     *     returns List<Orders>
     */
    public List<service.Orders> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<service.Orders> _return) {
        this._return = _return;
    }

}
