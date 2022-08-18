package pruducts.dto;

public class OrderRespDto {
	private int id;
	private String username;
	private String name;
	private int price;
	
	public OrderRespDto() {}
	
	public OrderRespDto(int id, String username, String name, int price) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
}
