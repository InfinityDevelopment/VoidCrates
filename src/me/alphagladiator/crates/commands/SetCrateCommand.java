package me.alphagladiator.crates.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import me.alphagladiator.crates.Main;
import me.alphagladiator.crates.StringStorage;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SetCrateCommand implements CommandExecutor, Listener{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!(sender instanceof Player)){
			sender.sendMessage(StringStorage.act + ChatColor.RED + "You must be a player to set a crate location!");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("setcrate")){
			if(!p.hasPermission("ac.setcrate")){
				p.sendMessage(StringStorage.act + ChatColor.RED + "You do not have permission to set a crate!");
				return true;
			}
			if(args.length == 0){
				p.sendMessage(StringStorage.act + ChatColor.RED + "You must choose for the chest to be Common, VIP, VIP+, or Mythical!");
				return true;
			}
			if(p.getTargetBlock((Set<Material>) null, 4).getState().getType() == Material.CHEST){
				Chest chest = (Chest) p.getTargetBlock((Set<Material>) null, 4).getState();
				String type = args[0];
				if(type.equalsIgnoreCase("Common")){
					type = "Common";
					setChest(type, chest, p);
					return true;
				}else if(type.equalsIgnoreCase("VIP")){
					type = "VIP";
					setChest(type, chest, p);
					return true;
				}else if(type.equalsIgnoreCase("VIP+")){
					type = "VIP+";
					setChest(type, chest, p);
					return true;
				}else if(type.equalsIgnoreCase("Mythical")){
					type = "Mythical";
					setChest(type, chest, p);
					return true;
				}else{
					p.sendMessage(StringStorage.act + ChatColor.RED + "Unidentified chest type!");
					return true;
				}
			}else{
				p.sendMessage(StringStorage.act + ChatColor.RED + "The block you are looking at is not a chest!");
				return true;
			}
		}
		return false;
	}
	
	public static void setChest(String type, Chest block, Player p){
		Main.instance.getConfig().set("ChestAmount", Main.instance.getConfig().getInt("ChestAmount") + 1);
		Main.instance.saveConfig();
		Main.instance.getConfig().set("Chest" + Main.instance.getConfig().getInt("ChestAmount") + ".X", block.getLocation().getBlockX());
		Main.instance.getConfig().set("Chest" + Main.instance.getConfig().getInt("ChestAmount") + ".Y", block.getLocation().getBlockY());
		Main.instance.getConfig().set("Chest" + Main.instance.getConfig().getInt("ChestAmount") + ".Z", block.getLocation().getBlockZ());
		Main.instance.getConfig().set("Chest" + Main.instance.getConfig().getInt("ChestAmount") + ".Type", type);
		Main.instance.saveConfig();
		if(type.equals("Common")){
			ItemStack item = new ItemStack(Material.PAPER);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName("ID");
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.GREEN + "Common Chest");
			meta.setLore(lore);
			item.setItemMeta(meta);
			block.getBlockInventory().addItem(item);
		}else if(type.equals("VIP")){
			ItemStack item = new ItemStack(Material.PAPER);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName("ID");
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.BLUE + "VIP Chest");
			meta.setLore(lore);
			item.setItemMeta(meta);
			block.getBlockInventory().addItem(item);
		}else if(type.equals("VIP+")){
			ItemStack item = new ItemStack(Material.PAPER);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName("ID");
			List<String> lore = new ArrayList<String>();
			lore.add("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Chest");
			meta.setLore(lore);
			item.setItemMeta(meta);
			block.getBlockInventory().addItem(item);
		}else if(type.equals("Mythical")){
			ItemStack item = new ItemStack(Material.PAPER);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName("ID");
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.LIGHT_PURPLE + "Mythical Chest");
			meta.setLore(lore);
			item.setItemMeta(meta);
			block.getBlockInventory().addItem(item);
		}
		p.sendMessage(StringStorage.act + ChatColor.GREEN + "This chest is now a " + type + " chest!");
	}

}
