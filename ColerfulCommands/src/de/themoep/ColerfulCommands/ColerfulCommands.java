package de.themoep.ColerfulCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ColerfulCommands extends JavaPlugin {
	
	@Override	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(args.length < 2)
			sender.sendMessage("Usage: /" + cmd.getName() + " <command> <command arguments>");
		else {
			String cmdstr = args[0];
			for(int i = 1; i < args.length; i++) {
				cmdstr += " " + ChatColor.translateAlternateColorCodes('&', args[i]);
			}
			this.getServer().dispatchCommand(sender, cmdstr);
		}
		return true;		
	}
}
