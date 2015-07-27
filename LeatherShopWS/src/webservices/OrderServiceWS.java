package webservices;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import service.Customers;
import service.Orders;
import service.Products;

@WebService
public interface OrderServiceWS {
	@WebMethod
	public List<Orders> getOrders(String date);

	@WebMethod
	public List<Customers> getCustomersWithPendingOrders();

	@WebMethod
	public List<Products> getProductsWithPendingOrders();

	@WebMethod
	public List<Customers> getCustInfo(Long orderId);

	@WebMethod
	public List<Products> getProductsWithoutOrders();
}
