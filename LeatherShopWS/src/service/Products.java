package service;

public class Products {

	private Long id;
	private String name;
	private String description;
	private Long price;
	private Long quantity;
	private String model;
	private Long weight;
	private Long category_id;
	private Long manu_id;
	private String status;
	private String color;

	public Products() {
		
	}
	
	public Products(Long id) {
		this.id = id;
		// this.name = name;
		//
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Long getCategoryId() {
		return category_id;
	}

	public void setCategoryId(Long category_id) {
		this.category_id = category_id;
	}

	public Long getManuId() {
		return manu_id;
	}

	public void setManuId(Long manu_id) {
		this.manu_id = manu_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
