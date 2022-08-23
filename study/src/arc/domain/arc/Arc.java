package arc.domain.arc;

public class Arc {
	private int id;
	private String itemname;
	private String itemqty;
	private String itemfrom;
	

	public Arc() {

	}

	public Arc(String itemname, String itemqty, String itemfrom) {
		this.itemname = itemname;
		this.itemqty = itemqty;
		this.itemfrom = itemfrom;
	}

	public Arc(int id, String itemname, String itemqty, String itemfrom) {
		this.id = id;
		this.itemname = itemname;
		this.itemqty = itemqty;
		this.itemfrom = itemfrom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemqty() {
		return itemqty;
	}

	public void setItemqty(String itemqty) {
		this.itemqty = itemqty;
	}

	public String getItemfrom() {
		return itemfrom;
	}

	public void setItemfrom(String itemfrom) {
		this.itemfrom = itemfrom;
	}
	
	

}
