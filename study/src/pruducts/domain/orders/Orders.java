package pruducts.domain.orders;

public class Orders {
	private int id;
	private int customerid;
	private int productid;
	
	public Orders() {

	}
	
	public Orders(int id, int customerid, int productid) {
		this.id = id;
		this.customerid = customerid;
		this.productid = productid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	
	
	
}
