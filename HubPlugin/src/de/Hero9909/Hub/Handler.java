package de.Hero9909.Hub;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Handler implements Listener {

	ItemStack[] menuItems;
	Inventory[] menus;
	
	public Handler() {
		menuItems = Content.getItems();
		menus = Content.getMenus();
	}

	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent e){
		for (Inventory inv : menus){
			if (e.getInventory().equals(inv)){
				testItems(e);
				return;
			}
		}
	}

	private void testItems(InventoryClickEvent e) {
		
		for (ItemStack is : menuItems){
			if (e.getCurrentItem().equals(is)){
				setAction(is);
			}
		}
		
	}

	private void setAction(ItemStack is) {
		ItemMeta im = is.getItemMeta();
		switch (im.getDisplayName()){
		case "Games":
			break;
		case "Partikel":
			break;
		case "Haubtmenü":
			break;
		
		}
		
	}
}
