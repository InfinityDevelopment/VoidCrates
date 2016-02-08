package me.alphagladiator.crates;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemBank {

	public static List<ItemStack> commonList(){
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		itemList.add(new ItemStack(Material.IRON_HELMET));
		itemList.add(new ItemStack(Material.IRON_CHESTPLATE));
		itemList.add(new ItemStack(Material.IRON_LEGGINGS));
		itemList.add(new ItemStack(Material.IRON_BOOTS));
		itemList.add(new ItemStack(Material.LOG, 32));
		itemList.add(new ItemStack(Material.COOKED_BEEF, 16));
		
		ItemStack vipKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vkmeta = vipKey.getItemMeta();
		vkmeta.setDisplayName(ChatColor.BLUE + "VIP Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vkmeta.setLore(lore);
		vipKey.setItemMeta(vkmeta);
		itemList.add(vipKey);
		
		return itemList;
	}
	
	public static List<ItemStack> vipList(){
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		
		ItemStack vipHelmet = new ItemStack(Material.IRON_HELMET);
		ItemMeta hmeta = vipHelmet.getItemMeta();
		hmeta.setDisplayName(ChatColor.BLUE + "VIP Helmet");
		vipHelmet.setItemMeta(hmeta);
		vipHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(vipHelmet);
		
		ItemStack vipChest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta cMeta = vipChest.getItemMeta();
		cMeta.setDisplayName(ChatColor.BLUE + "VIP Chestplate");
		vipChest.setItemMeta(cMeta);
		vipChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(vipChest);
		
		ItemStack vipLegs = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta lmeta = vipLegs.getItemMeta();
		lmeta.setDisplayName(ChatColor.BLUE + "VIP Leggings");
		vipLegs.setItemMeta(lmeta);
		vipLegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(vipLegs);
		
		ItemStack vipBoots = new ItemStack(Material.IRON_BOOTS);
		ItemMeta bmeta = vipBoots.getItemMeta();
		bmeta.setDisplayName(ChatColor.BLUE + "VIP Boots");
		vipBoots.setItemMeta(bmeta);
		vipBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(vipBoots);
		
		itemList.add(new ItemStack(Material.IRON_INGOT, 9));
		itemList.add(new ItemStack(Material.COOKED_BEEF, 32));
		
		ItemStack vip2Key = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vk2meta = vip2Key.getItemMeta();
		vk2meta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vk2meta.setLore(lore);
		vip2Key.setItemMeta(vk2meta);
		itemList.add(vip2Key);
		
		return itemList;
	}
	
	public static List<ItemStack> vip2List(){
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		
		ItemStack vipHelmet = new ItemStack(Material.IRON_HELMET);
		ItemMeta hMeta = vipHelmet.getItemMeta();
		hMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Helmet");
		vipHelmet.setItemMeta(hMeta);
		vipHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(vipHelmet);
		
		ItemStack vipChest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta cMeta = vipChest.getItemMeta();
		cMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Chestplate");
		vipChest.setItemMeta(cMeta);
		vipChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(vipChest);
		
		ItemStack vipLegs = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta lMeta = vipLegs.getItemMeta();
		lMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Leggings");
		vipLegs.setItemMeta(lMeta);
		vipLegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(vipLegs);
		
		ItemStack vipBoots = new ItemStack(Material.IRON_BOOTS);
		ItemMeta bMeta = vipBoots.getItemMeta();
		bMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "VIP+ Boots");
		vipBoots.setItemMeta(bMeta);
		vipBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(vipBoots);
		
		itemList.add(new ItemStack(Material.IRON_INGOT, 20));
		itemList.add(new ItemStack(Material.GOLDEN_APPLE, 3));
		itemList.add(new ItemStack(Material.DIAMOND));
		
		ItemStack vip2Key = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vk2meta = vip2Key.getItemMeta();
		vk2meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vk2meta.setLore(lore);
		vip2Key.setItemMeta(vk2meta);
		itemList.add(vip2Key);
		
		return itemList;
	}
	
	public static List<ItemStack> mythicalList(){
        List<ItemStack> itemList = new ArrayList<ItemStack>();
		
		ItemStack mHelmet = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta hMeta = mHelmet.getItemMeta();
		hMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Helmet");
		mHelmet.setItemMeta(hMeta);
		mHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		mHelmet.addUnsafeEnchantment(Enchantment.OXYGEN, 1);
		itemList.add(mHelmet);
		
		ItemStack mChest = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta cMeta = mChest.getItemMeta();
		cMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Chestplate");
		mChest.setItemMeta(cMeta);
		mChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		mChest.addUnsafeEnchantment(Enchantment.THORNS, 3);
		itemList.add(mChest);
		
		ItemStack mLegs = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta lMeta = mLegs.getItemMeta();
		lMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Leggings");
		mLegs.setItemMeta(lMeta);
		mLegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		mLegs.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		itemList.add(mLegs);
		
		ItemStack mBoots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta bMeta = mBoots.getItemMeta();
		bMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Boots");
		mBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		List<String> lore = new ArrayList<String>();
		lore.add("When you put these boots on,");
		lore.add("you move faster!");
		bMeta.setLore(lore);
		mBoots.setItemMeta(bMeta);
		itemList.add(mBoots);
		
		ItemStack mSword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta sMeta = mSword.getItemMeta();
		sMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Sword");
		mSword.setItemMeta(sMeta);
		mSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
		mSword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
		itemList.add(mSword);
		
		itemList.add(new ItemStack(Material.GOLD_INGOT, 72));
		itemList.add(new ItemStack(Material.DIAMOND, 5));
		
		return itemList;
	}
	
}
