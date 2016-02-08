package me.alphagladiator.crates.listeners;

import java.util.ArrayList;
import java.util.List;

import me.alphagladiator.crates.events.PlayerEquipEvent;
import me.alphagladiator.crates.events.PlayerUnequipEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BootsListener implements Listener{
    
	@EventHandler
	public void onArmorEquipEvent(PlayerEquipEvent e){
		List<String> lore = new ArrayList<String>();
		lore.add("When you put these boots on,");
		lore.add("you move faster!");
		if(e.getItem().hasItemMeta() && e.getItem().getItemMeta().getLore().equals(lore)){
			e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
		}
	}
	
	@EventHandler
	public void onArmorUnequipEvent(PlayerUnequipEvent e){
		List<String> lore = new ArrayList<String>();
		lore.add("When you put these boots on,");
		lore.add("you move faster!");
		if(e.getItem().hasItemMeta() && e.getItem().getItemMeta().getLore().equals(lore)){
			e.getPlayer().removePotionEffect(PotionEffectType.SPEED);
		}
	}
	
}
