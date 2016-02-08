package me.alphagladiator.crates.commands;

import java.util.ArrayList;
import java.util.List;

import me.alphagladiator.crates.StringStorage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GiveKeyCommand implements CommandExecutor, Listener{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("givekey")){
			if(!sender.hasPermission("ac.givekey")){
				sender.sendMessage(StringStorage.act + ChatColor.RED + "You do not have permission to give keys!");
				return true;
			}
			if(args.length == 2){
				Player target = Bukkit.getPlayer(args[0]);
				if(target == null){
					sender.sendMessage(StringStorage.act + ChatColor.AQUA + args[0] + ChatColor.RED + " is not online!");
					return true;
				}
				String type = args[1];
				if(type.equalsIgnoreCase("Common")){
					ItemStack commonKey = new ItemStack(Material.TRIPWIRE_HOOK);
					ItemMeta ckmeta = commonKey.getItemMeta();
					ckmeta.setDisplayName(ChatColor.GREEN + "Common Key");
					List<String> lore = new ArrayList<String>();
					lore.add(ChatColor.GREEN + "A crate key!");
					ckmeta.setLore(lore);
					commonKey.setItemMeta(ckmeta);
					target.getInventory().addItem(commonKey);
					target.sendMessage(StringStorage.act + ChatColor.GREEN + "You were given a Common Key by " + ChatColor.AQUA + sender.getName() + ChatColor.GREEN + "!");
					sender.sendMessage(StringStorage.act + "You gave " + ChatColor.AQUA + target.getName() + ChatColor.RESET + " a Common Key!");
					return true;
				}else if(type.equalsIgnoreCase("VIP")){
					ItemStack commonKey = new ItemStack(Material.TRIPWIRE_HOOK);
					ItemMeta ckmeta = commonKey.getItemMeta();
					ckmeta.setDisplayName(ChatColor.BLUE + "VIP Key");
					List<String> lore = new ArrayList<String>();
					lore.add(ChatColor.GREEN + "A crate key!");
					ckmeta.setLore(lore);
					commonKey.setItemMeta(ckmeta);
					target.getInventory().addItem(commonKey);
					target.sendMessage(StringStorage.act + ChatColor.GREEN + "You were given a VIP Key by " + ChatColor.AQUA + sender.getName() + ChatColor.GREEN + "!");
					sender.sendMessage(StringStorage.act + "You gave " + ChatColor.AQUA + target.getName() + ChatColor.RESET + " a VIP Key!");
					return true;
				}else if(type.equalsIgnoreCase("VIP+")){
					ItemStack commonKey = new ItemStack(Material.TRIPWIRE_HOOK);
					ItemMeta ckmeta = commonKey.getItemMeta();
					ckmeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Key");
					List<String> lore = new ArrayList<String>();
					lore.add(ChatColor.GREEN + "A crate key!");
					ckmeta.setLore(lore);
					commonKey.setItemMeta(ckmeta);
					target.getInventory().addItem(commonKey);
					target.sendMessage(StringStorage.act + ChatColor.GREEN + "You were given a VIP+ Key by " + ChatColor.AQUA + sender.getName() + ChatColor.GREEN + "!");
					sender.sendMessage(StringStorage.act + "You gave " + ChatColor.AQUA + target.getName() + ChatColor.RESET + " a VIP+ Key!");
					return true;
				}else if(type.equalsIgnoreCase("Mythical")){
					ItemStack commonKey = new ItemStack(Material.TRIPWIRE_HOOK);
					ItemMeta ckmeta = commonKey.getItemMeta();
					ckmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Key");
					List<String> lore = new ArrayList<String>();
					lore.add(ChatColor.GREEN + "A crate key!");
					ckmeta.setLore(lore);
					commonKey.setItemMeta(ckmeta);
					target.getInventory().addItem(commonKey);
					target.sendMessage(StringStorage.act + ChatColor.GREEN + "You were given a Mythical Key by " + ChatColor.AQUA + sender.getName() + ChatColor.GREEN + "!");
					sender.sendMessage(StringStorage.act + "You gave " + ChatColor.AQUA + target.getName() + ChatColor.RESET + " a Mythical Key!");
					return true;
				}else{
					sender.sendMessage(StringStorage.act + ChatColor.RED + "Invalid key type!");
					return true;
				}
			}else{
				sender.sendMessage(StringStorage.act + ChatColor.RED + "Invalid paramaters! Usage: /givekey <player> <type>");
				return true;
			}
		}

		return false;
	}

}
