package service;

public class Orders {

	private Long id;
	private Long customer_id;
	private String dateOrdered;
	private Long totalPrice;
	private String status;
	private Long shipping_address_id;
	private Long billing_address_id;
	private Long product_id;
	private Customers customer;
	private Products products;

	// constructors

	public Orders() {

	}

	public Orders(Long id, Long customer_id, String dateOrdered, String status,
			Long product_id) {
		this.id = id;
		this.dateOrdered = dateOrdered;
		this.customer_id = customer_id;
		this.status = status;
		this.product_id = product_id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setProduct(Long id) {
		this.product_id = id;

	}

	public Long getProduct() {
		return product_id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long id) {
		customer_id = id;
	}

	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public Long getPrice() {

		return totalPrice;
	}

	public void setPrice(Long price) {
		this.totalPrice = price;
	}

	public void setShippingAddress(Long id) {
		this.shipping_address_id = id;
	}

	public Long getShippingAddress() {
		return shipping_address_id;
	}

	public void setBillingAddress(Long id) {
		this.billing_address_id = id;
	}

	public Long getBillingAddress() {
		return billing_address_id;
	}

	public String getStatus() {

		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the customer
	 */
	public Customers getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	/**
	 * @return the products
	 */
	public Products getProducts() {
		return products;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public void setProducts(Products products) {
		this.products = products;
	}
}
