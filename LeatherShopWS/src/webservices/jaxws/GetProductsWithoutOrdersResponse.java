
package webservices.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProductsWithoutOrdersResponse", namespace = "http://webservices/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductsWithoutOrdersResponse", namespace = "http://webservices/")
public class GetProductsWithoutOrdersResponse {

    @XmlElement(name = "return", namespace = "")
    private List<service.Products> _return;

    /**
     * 
     * @return
     *     returns List<Products>
     */
    public List<service.Products> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<service.Products> _return) {
        this._return = _return;
    }

}
