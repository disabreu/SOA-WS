package service;

public class Customers {

	private Long custId;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Long custAddId;

	public Customers() {
		
	}
	
	public Customers(Long custId, String firstName, String lastName,
			String phone, String email, Long custAddId) {

		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.custAddId = custAddId;

	}

	public Long getCustId() {
		return custId;
	}

	/**
	 * @param custId
	 *            the custId to set
	 */
	public void setCustId(Long custId) {
		this.custId = custId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the custAddId
	 */
	public Long getCustAddId() {
		return custAddId;
	}

	/**
	 * @param custAddId
	 *            the custAddId to set
	 */
	public void setCustAddId(Long custAddId) {
		this.custAddId = custAddId;
	}
}
