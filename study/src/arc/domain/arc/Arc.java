package arc.domain.arc;

public class Arc {
	private int id;
	private String itemname;
	private int itemqty;
	private String itemfrom;
	

	public Arc() {

	}

	public Arc(String itemname, int itemqty, String itemfrom) {
		this.itemname = itemname;
		this.itemqty = itemqty;
		this.itemfrom = itemfrom;
	}

	public Arc(int id, String itemname, int itemqty, String itemfrom) {
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

	public int getItemqty() {
		return itemqty;
	}

	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}

	public String getItemfrom() {
		return itemfrom;
	}

	public void setItemfrom(String itemfrom) {
		this.itemfrom = itemfrom;
	}
	
	

}
