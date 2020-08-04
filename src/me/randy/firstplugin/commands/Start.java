package me.randy.firstplugin.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;

import me.randy.firstplugin.Main;

public class Start implements CommandExecutor {
	private Main plugin;
	
	public Start (Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("start")) {
			this.plugin.Start();
			return true;
		}
		return false;
	}
}
