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
		
		ItemStack MVPKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vkmeta = MVPKey.getItemMeta();
		vkmeta.setDisplayName(ChatColor.BLUE + "MVP Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vkmeta.setLore(lore);
		MVPKey.setItemMeta(vkmeta);
		itemList.add(MVPKey);
		
		return itemList;
	}
	
	public static List<ItemStack> MVPList(){
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		
		ItemStack MVPHelmet = new ItemStack(Material.IRON_HELMET);
		ItemMeta hmeta = MVPHelmet.getItemMeta();
		hmeta.setDisplayName(ChatColor.BLUE + "MVP Helmet");
		MVPHelmet.setItemMeta(hmeta);
		MVPHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(MVPHelmet);
		
		ItemStack MVPChest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta cMeta = MVPChest.getItemMeta();
		cMeta.setDisplayName(ChatColor.BLUE + "MVP Chestplate");
		MVPChest.setItemMeta(cMeta);
		MVPChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(MVPChest);
		
		ItemStack MVPLegs = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta lmeta = MVPLegs.getItemMeta();
		lmeta.setDisplayName(ChatColor.BLUE + "MVP Leggings");
		MVPLegs.setItemMeta(lmeta);
		MVPLegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(MVPLegs);
		
		ItemStack MVPBoots = new ItemStack(Material.IRON_BOOTS);
		ItemMeta bmeta = MVPBoots.getItemMeta();
		bmeta.setDisplayName(ChatColor.BLUE + "MVP Boots");
		MVPBoots.setItemMeta(bmeta);
		MVPBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(MVPBoots);
		
		itemList.add(new ItemStack(Material.DIAMOND, 3));
		itemList.add(new ItemStack(Material.COOKED_BEEF, 32));
		
		ItemStack MVP2Key = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vk2meta = MVP2Key.getItemMeta();
		vk2meta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "MVP+ Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vk2meta.setLore(lore);
		MVP2Key.setItemMeta(vk2meta);
		itemList.add(MVP2Key);
		
		return itemList;
	}
	
	public static List<ItemStack> MVP2List(){
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		
		ItemStack MVPHelmet = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta hMeta = MVPHelmet.getItemMeta();
		hMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "MVP+ Helmet");
		MVPHelmet.setItemMeta(hMeta);
		MVPHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(MVPHelmet);
		
		ItemStack MVPChest = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta cMeta = MVPChest.getItemMeta();
		cMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "MVP+ Chestplate");
		MVPChest.setItemMeta(cMeta);
		MVPChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(MVPChest);
		
		ItemStack MVPLegs = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta lMeta = MVPLegs.getItemMeta();
		lMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "MVP+ Leggings");
		MVPLegs.setItemMeta(lMeta);
		MVPLegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(MVPLegs);
		
		ItemStack MVPBoots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta bMeta = MVPBoots.getItemMeta();
		bMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "MVP+ Boots");
		MVPBoots.setItemMeta(bMeta);
		MVPBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(MVPBoots);
		
		itemList.add(new ItemStack(Material.IRON_INGOT, 32));
		itemList.add(new ItemStack(Material.GOLDEN_APPLE, 3));
		itemList.add(new ItemStack(Material.DIAMOND, 8));
		
		ItemStack MVP2Key = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vk2meta = MVP2Key.getItemMeta();
		vk2meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vk2meta.setLore(lore);
		MVP2Key.setItemMeta(vk2meta);
		itemList.add(MVP2Key);
		
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
		mBoots.setItemMeta(bMeta);
		itemList.add(mBoots);
		
		ItemStack mSword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta sMeta = mSword.getItemMeta();
		sMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Sword");
		mSword.setItemMeta(sMeta);
		mSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
		mSword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
		itemList.add(mSword);
		
		return itemList;
	}
	
}
