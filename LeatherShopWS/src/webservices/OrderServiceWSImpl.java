package webservices;

import java.util.List;

import javax.jws.WebService;

import service.Customers;
import service.OrderServiceImpl;
import service.Orders;
import service.Products;

@WebService(endpointInterface = "webservices.OrderServiceWS")
public class OrderServiceWSImpl implements OrderServiceWS {
	OrderServiceImpl orderService = new OrderServiceImpl();

	public List<Orders> getOrders(String date) {
		return orderService.getOrdersPerYear(date);

	}

	public List<Customers> getCustomersWithPendingOrders() {
		return orderService.getCustomersWithPendingOrders();

	}

	// 3:prods with pending orders
	public List<Products> getProductsWithPendingOrders() {
		return orderService.getProductsWithPendingOrders();

	}

	// custinfo
	public List<Customers> getCustInfo(Long orderId) {
		return orderService.getCustInfo(orderId);

	}

	// products never ordered
	public List<Products> getProductsWithoutOrders() {
		return orderService.getProductsWithoutOrders();

	}

}
