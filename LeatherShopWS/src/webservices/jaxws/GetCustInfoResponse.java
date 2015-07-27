
package webservices.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCustInfoResponse", namespace = "http://webservices/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustInfoResponse", namespace = "http://webservices/")
public class GetCustInfoResponse {

    @XmlElement(name = "return", namespace = "")
    private List<service.Customers> _return;

    /**
     * 
     * @return
     *     returns List<Customers>
     */
    public List<service.Customers> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<service.Customers> _return) {
        this._return = _return;
    }

}
