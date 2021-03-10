package me.inyght.kit;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.inyght.kit.events.InventoryEvents;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("kits").setExecutor(new Commands());
		getServer().getPluginManager().registerEvents((Listener) new InventoryEvents(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	

}
