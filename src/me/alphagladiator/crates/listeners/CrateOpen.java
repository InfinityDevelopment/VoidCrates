package me.alphagladiator.crates.listeners;

import java.util.List;
import java.util.Random;

import me.alphagladiator.crates.ItemBank;
import me.alphagladiator.crates.StringStorage;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CrateOpen implements Listener{
	
	@EventHandler
	public void CrateOpenEvent(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
			if(e.getClickedBlock().getType().equals(Material.CHEST)){
				Chest chest = (Chest) e.getClickedBlock().getState();
				Inventory chestInventory = chest.getBlockInventory();
				for(ItemStack item : chestInventory.getContents()){
					List<String> lore = item.getItemMeta().getLore();
					if(item.getItemMeta().hasLore() == true){
						if(lore.contains(ChatColor.GREEN + "Common Chest")){
							e.setCancelled(true);
							openCrate(p, "Common");
							return;
						}else if(lore.contains(ChatColor.BLUE + "VIP Chest")){
							e.setCancelled(true);
							openCrate(p, "VIP");
							return;
						}else if(lore.contains("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Chest")){
							e.setCancelled(true);
							openCrate(p, "VIP+");
							return;
						}else if(lore.contains(ChatColor.LIGHT_PURPLE + "Mythical Chest")){
							e.setCancelled(true);
							openCrate(p, "Mythical");
							return;
						}else{ return; }
					}else{
						return;
					}
				}
			}
		}
	}
	
	public static void openCrate(Player p, String type){
		if(p.getItemInHand().getType().equals(Material.TRIPWIRE_HOOK) && p.getItemInHand().getItemMeta().getLore().contains(ChatColor.GREEN + "A crate key!")){
			String name = p.getItemInHand().getItemMeta().getDisplayName();
			if(name.equals(ChatColor.GREEN + "Common Key") && type.equals("Common")){
				int itemNum = randomNumber(0, ItemBank.commonList().size());
				ItemStack item = ItemBank.commonList().get(itemNum);
				ItemStack handItem = p.getItemInHand();
				handItem.setAmount(handItem.getAmount() - 1);
				if(p.getInventory().getItemInHand().getAmount() < 2){
					handItem.setType(Material.AIR);
				}
				p.getWorld().playSound(p.getLocation(), Sound.ANVIL_BREAK, 10, 1);
				p.getInventory().addItem(item);
				p.sendMessage(StringStorage.act + ChatColor.GREEN + "You opened a Common Chest and recieved your item! Congratulations!");
				return;
			}else if(name.equals(ChatColor.BLUE + "VIP Key") && type.equals("VIP")){
				int itemNum = randomNumber(0, ItemBank.vipList().size());
				ItemStack item = ItemBank.vipList().get(itemNum);
				p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
				if(p.getInventory().getItemInHand().getAmount() < 2){
					p.getItemInHand().setType(Material.AIR);
				}
				p.getWorld().playSound(p.getLocation(), Sound.ANVIL_BREAK, 10, 1);
				p.getInventory().addItem(item);
				p.sendMessage(StringStorage.act + ChatColor.GREEN + "You opened a VIP Chest and recieved your item! Congratulations!");
				return;
			}else if(name.equals("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Key") && type.equals("VIP+")){
				int itemNum = randomNumber(0, ItemBank.vip2List().size());
				ItemStack item = ItemBank.vip2List().get(itemNum);
				p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
				if(p.getInventory().getItemInHand().getAmount() < 2){
					p.getItemInHand().setType(Material.AIR);
				}
				p.getWorld().playSound(p.getLocation(), Sound.ANVIL_BREAK, 10, 1);
				p.getInventory().addItem(item);
				p.sendMessage(StringStorage.act + ChatColor.GREEN + "You opened a VIP Chest and recieved your item! Congratulations!");
				return;
			}else if(name.equals(ChatColor.LIGHT_PURPLE + "Mythical Key") && type.equals("Mythical")){
				int itemNum = randomNumber(0, ItemBank.mythicalList().size());
				ItemStack item = ItemBank.mythicalList().get(itemNum);
				p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
				if(p.getInventory().getItemInHand().getAmount() < 2){
					p.getItemInHand().setType(Material.AIR);
				}
				p.getWorld().playSound(p.getLocation(), Sound.ANVIL_BREAK, 10, 1);
				p.getInventory().addItem(item);
				p.sendMessage(StringStorage.act + ChatColor.GREEN + "You opened a Mythical Chest and recieved your item! Congratulations!");
				return;
			}else{
				p.sendMessage(StringStorage.act + ChatColor.RED + "ERROR: Either you renamed your key, or you are trying to use the wrong key type!");
				return;
			}
		}else{
			p.sendMessage(StringStorage.act + ChatColor.RED + "You don't have a crate key in your hand!");
			return;
		}
	}
	
	private static int randomNumber(int min, int max){
		Random rand = new Random();
		int randomNum = rand.nextInt(max) + min;
		return randomNum;
	}

}
