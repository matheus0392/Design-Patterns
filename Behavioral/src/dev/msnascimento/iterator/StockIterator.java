package dev.msnascimento.iterator;

import java.util.Iterator;

public class StockIterator implements Iterator {

	private Inventory inventory;
	private int index;

	public StockIterator(Inventory inventory) {
		super();
		this.inventory = inventory;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {

		Item[] items = inventory.getItems();
		if (index < items.length) {
			return true;
		}

		return false;
	}

	@Override
	public Item next() {
		Item[] items = inventory.getItems();
		if (hasNext()) {
			Item item = items[index++];
			if (item.getQuantity() > 0) {
				return item;
			} else {
				return next();
			}
		}
		return null;
	}

}
