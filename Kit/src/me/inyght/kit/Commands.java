package me.inyght.kit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players can use that command.");
			return true;
		}
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("kits")) {
			SelectionScreen gui = new SelectionScreen();
			p.openInventory(gui.getInventory());
			p.sendMessage(ChatColor.AQUA + "Choose a Kit.");
		}
		
		return true;
	}

}
