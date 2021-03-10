package me.inyght.kit.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import me.inyght.kit.SelectionScreen;

public class InventoryEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (e.getClickedInventory() == null) { return; }
		if (e.getClickedInventory().getHolder() instanceof SelectionScreen) {
			e.setCancelled(true);
			if (e.isLeftClick()) {
				
			Player p = (Player) e.getWhoClicked();
			if (e.getCurrentItem() == null) { return; }
			if (e.getSlot() == 0) {
				p.getInventory().addItem(new ItemStack(Material.BREAD, 32));
				p.closeInventory();
			}
			else if (e.getSlot() == 1) {
				p.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE, 1));
				p.closeInventory();
			}
			else if (e.getSlot() == 2) {
				p.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 1));
				p.closeInventory();
			}
		}
		}
	}
}
