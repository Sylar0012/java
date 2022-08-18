package product.domain.orders;

public class Orders {
	private int customerid;
	private int productid;
	private int id;
	
	public Orders() {}
	
	public Orders(int customerid, int productid, int id) {

		this.customerid = customerid;
		this.productid = productid;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	


}