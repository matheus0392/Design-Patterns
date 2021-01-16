package dev.msnascimento.proxy.challenge;

import java.util.ArrayList;

public class InventoryProxy implements Inventory {

	Inventory inv;

	public InventoryProxy() {
		super();
	}

	@Override
	public ArrayList<Item> getInventory() {
		if (inv == null) {
			inv = new SuperstoreInventory();
		}
		return inv.getInventory();
	}

}
