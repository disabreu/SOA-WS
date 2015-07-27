package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl {
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
 

    //method for connecting to the database
    
	private void databaseConnection() {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection("jdbc:mysql://localhost/soa?"
					+ "user=root&password=password");
			// Statements allow to issue SQL queries to the database
			statement = (Statement) connect.createStatement();
		} catch (Exception e) {
			// print exception if thrown
			System.out.println(e.getMessage());

		}
	}

	// return list of orders for a given year.
	public List<Orders> getOrdersPerYear(String date) {

		List<Orders> result = new ArrayList<>();
		try {
			databaseConnection();
			// Result set gets the result of the SQL query
			resultSet = statement
					.executeQuery("select * from  orders o, products p where o.prod_id=p.prodId and extract(year from order_date) = '"
							+ date + "'");
			while (resultSet.next()) {
				Orders orders = new Orders();
				orders.setId(Long.valueOf(resultSet.getInt("order_id")));
				orders.setCustomer_id(Long.valueOf(resultSet
						.getInt("customer_id")));
				orders.setDateOrdered(resultSet.getDate("order_date")
						.toString());
				orders.setPrice(Long.valueOf(resultSet.getInt("total_price")));
				orders.setStatus(resultSet.getString("status"));
				Products products = new Products();
				products.setName(resultSet.getString("prod_name"));
				orders.setProducts(products);
				result.add(orders);
			}
		} catch (Exception e) {
			// print exception if thrown
			System.out.println(e.getMessage());

		}
		return result;
	}

	public List<Customers> getCustomersWithPendingOrders() {

		List<Customers> result = new ArrayList<>();
		try {
			databaseConnection();
			// Result set gets the result of the SQL query
			resultSet = statement
					.executeQuery("select * from orders o, customers c where o.customer_id=c.customerId and o.status = 'Pending'");
			while (resultSet.next()) {
				Customers customers = new Customers();
				customers.setFirstName(resultSet.getString("fname"));
				customers.setLastName(resultSet.getString("lname"));
				customers.setPhone(resultSet.getString("phone"));
				customers.setEmail(resultSet.getString("email"));
				result.add(customers);
			}
		} catch (Exception e) {
			// print exception if thrown
			System.out.println(e.getMessage());

		}
		return result;
	}

	public List<Products> getProductsWithPendingOrders() {

		List<Products> result = new ArrayList<>();
		try {
			databaseConnection();
			// Result set gets the result of the SQL query
			resultSet = statement
					.executeQuery("select * from  orders o, products p where o.prod_id=p.prodId and o.status = 'Pending'");
			while (resultSet.next()) {
				Products products = new Products();
				products.setName(resultSet.getString("prod_name"));
				products.setQuantity(Long.valueOf(resultSet.getInt("quantity")));
				products.setPrice(Long.valueOf(resultSet.getInt("price")));
				products.setColor(resultSet.getString("color"));
				products.setId(Long.valueOf(resultSet.getString("order_id")));
				result.add(products);
			}
		} catch (Exception e) {
			// print exception if thrown
			System.out.println(e.getMessage());
		}
		for (Products i : result) {
			System.out.println(i.getId());
		}
		return result;
	}

	public List<Customers> getCustInfo(Long orderId) {

		List<Customers> result = new ArrayList<>();
		try {
			databaseConnection();
			// Result set gets the result of the SQL query
			resultSet = statement
					.executeQuery("select * from orders o, customers c where o.customer_id=c.customerId and order_id = "+ orderId);
			while (resultSet.next()) {
				Customers customers = new Customers();
				customers.setCustId(Long.valueOf(resultSet.getString("customer_id")));
				customers.setFirstName(resultSet.getString("fname"));
				customers.setLastName(resultSet.getString("lname"));
				customers.setPhone(resultSet.getString("phone"));
				customers.setEmail(resultSet.getString("email"));
				result.add(customers);
			}
		} catch (Exception e) {
			// print exception if thrown
			System.out.println(e.getMessage());

		}

		return result;
	}

	public List<Products> getProductsWithoutOrders() {
		
		List<Products> result = new ArrayList<>();
		try {
			databaseConnection();
			// Result set gets the result of the SQL query
			resultSet = statement
					.executeQuery("select * from  soa.products p left join soa.orders o ON o.prod_id = p.prodId WHERE o.order_id IS NULL");
			while (resultSet.next()) {
				Products products = new Products();
				products.setName(resultSet.getString("prod_name"));
				products.setQuantity(Long.valueOf(resultSet.getInt("quantity")));
				products.setPrice(Long.valueOf(resultSet.getInt("price")));
				products.setColor(resultSet.getString("color"));
				result.add(products);
			}
		} catch (Exception e) {
			// print exception if thrown
			System.out.println(e.getMessage());
		}
		return result;
	}
}
