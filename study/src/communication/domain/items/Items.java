package communication.domain.items;

import java.util.ArrayList;

import communication.domain.item.Item;

public class Items {
	private ArrayList<Item> item;

	public Items(ArrayList<Item> item) {
		this.item = item;
	}

	public ArrayList<Item> getItem() {
		return item;
	}

	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}
	
	
	
}
