package site.infinitydev.crates.listeners;

import java.util.List;
import java.util.Random;

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

import site.infinitydev.crates.ItemBank;
import site.infinitydev.crates.StringStorage;

public class CrateOpen implements Listener{

	@EventHandler
	public void onChestOpen(PlayerInteractEvent e){
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if(e.getClickedBlock() != null){
				if(e.getClickedBlock().getType() != Material.CHEST){
					return;
				}
				Chest chest = (Chest) e.getClickedBlock().getState();
				Player p = e.getPlayer();
				Inventory chestInventory = chest.getInventory();
				if(chestInventory.getItem(0) != null){
					ItemStack item = chestInventory.getItem(0);
					if(item.getType() == Material.PAPER){
						if(!item.hasItemMeta()){
							return;
						}
						if(item.getItemMeta().hasLore()){
							List<String> lore = item.getItemMeta().getLore();
							if(lore.contains(ChatColor.GREEN + "Common Chest")){
								e.setCancelled(true);
								openCrate(p, "Common");
								return;
							}else if(lore.contains(ChatColor.BLUE + "Uncommon Chest")){
								e.setCancelled(true);
								openCrate(p, "Uncommon");
								return;
							}else if(lore.contains("" + ChatColor.BLUE + ChatColor.BOLD + "Rare Chest")){
								e.setCancelled(true);
								openCrate(p, "Rare");
								return;
							}else if(lore.contains(ChatColor.LIGHT_PURPLE + "Mythical Chest")){
								e.setCancelled(true);
								openCrate(p, "Mythical");
								return;
							}else{ return; }
						}
					}
				}
			}
		}
	}


	public static void openCrate(Player p, String type){
		if(p.getInventory().getItemInMainHand().getType().equals(Material.TRIPWIRE_HOOK) && p.getInventory().getItemInMainHand().getItemMeta().getLore().contains(ChatColor.GREEN + "A crate key!")){
			String name = p.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
			if(name.equals(ChatColor.GREEN + "Common Key") && type.equals("Common")){
				int itemNum = randomNumber(0, ItemBank.commonList().size());
				ItemStack item = ItemBank.commonList().get(itemNum);
				ItemStack handItem = p.getInventory().getItemInMainHand();
				if(p.getInventory().getItemInMainHand().getAmount() == 1){
					p.getInventory().removeItem(p.getInventory().getItemInMainHand());
				}
				handItem.setAmount(handItem.getAmount() - 1);
				p.getWorld().playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 10, 1);
				p.getInventory().addItem(item);
				p.sendMessage(StringStorage.act + ChatColor.GREEN + "You opened a Common Chest and recieved your item! Congratulations!");
				return;
			}else if(name.equals(ChatColor.BLUE + "Uncommon Key") && type.equals("Uncommon")){
				int itemNum = randomNumber(0, ItemBank.UncommonList().size());
				ItemStack item = ItemBank.UncommonList().get(itemNum);
				p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
				if(p.getInventory().getItemInMainHand().getAmount() == 1){
					p.getInventory().removeItem(p.getInventory().getItemInMainHand());
				}
				p.getWorld().playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 10, 1);
				p.getInventory().addItem(item);
				p.sendMessage(StringStorage.act + ChatColor.GREEN + "You opened a Uncommon Chest and recieved your item! Congratulations!");
				return;
			}else if(name.equals("" + ChatColor.BLUE + ChatColor.BOLD + "Rare Key") && type.equals("Rare")){
				int itemNum = randomNumber(0, ItemBank.RareList().size());
				ItemStack item = ItemBank.RareList().get(itemNum);
				p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
				if(p.getInventory().getItemInMainHand().getAmount() == 1){
					p.getInventory().removeItem(p.getInventory().getItemInMainHand());
				}
				p.getWorld().playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 10, 1);
				p.getInventory().addItem(item);
				p.sendMessage(StringStorage.act + ChatColor.GREEN + "You opened a Uncommon Chest and recieved your item! Congratulations!");
				return;
			}else if(name.equals(ChatColor.LIGHT_PURPLE + "Mythical Key") && type.equals("Mythical")){
				int itemNum = randomNumber(0, ItemBank.mythicalList().size());
				ItemStack item = ItemBank.mythicalList().get(itemNum);
				p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
				if(p.getInventory().getItemInMainHand().getAmount() == 1){
					p.getInventory().removeItem(p.getInventory().getItemInMainHand());
				}
				p.getWorld().playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 10, 1);
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

	public static int randomNumber(int min, int max){
		Random rand = new Random();
		int randomNum = rand.nextInt(max) + min;
		return randomNum;
	}

}
