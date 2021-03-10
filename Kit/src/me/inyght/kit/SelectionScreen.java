package me.inyght.kit;

import java.util.Collections;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SelectionScreen implements InventoryHolder {

private Inventory inv;
	
	public SelectionScreen() {
		inv = Bukkit.createInventory(this, 9, "Kits");
		init();
	}
	
	private void init() {
		ItemStack item;
			
		item = createItem("&6&lFood", Material.BREAD, Collections.singletonList("&fEveryone needs to eat."));
			inv.setItem(inv.firstEmpty(), item);
			
		item = createItem("&2&lTools", Material.IRON_PICKAXE, Collections.singletonList("&fGet to work."));
			inv.setItem(inv.firstEmpty(), item);
			
		item = createItem("&4&lWeapons", Material.IRON_SWORD, Collections.singletonList("&fGear up and defend yourself."));
			inv.setItem(inv.firstEmpty(), item);
		
		}
	
	private ItemStack createItem(String name, Material mat, List<String> lore) {
		ItemStack item = new ItemStack(mat, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	
	 @Override
	 public Inventory getInventory() {
		 return inv;
	 }

	}

