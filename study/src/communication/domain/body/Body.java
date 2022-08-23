package communication.domain.body;

import communication.domain.item.Item;

public class Body {
	private String dateType;
	private Item item;
	private int pageNo;
	private int numOfRows;
	private int totalCount;
	
	public Body(String dateType, Item item, int pageNo, int numOfRows, int totalCount) {
		this.dateType = dateType;
		this.item = item;
		this.pageNo = pageNo;
		this.numOfRows = numOfRows;
		this.totalCount = totalCount;
	}

	public String getDateType() {
		return dateType;
	}

	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
	
	
	
}
