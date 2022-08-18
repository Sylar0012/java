package product.domain.product;

public class Product {
	private String name;
	private int price;
	private int qty;
	private int id;
	
	public Product() {}
	
	public Product(String name, int price, int qty, int id) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
}
