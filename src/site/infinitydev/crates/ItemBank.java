package site.infinitydev.crates;

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
		
		ItemStack UncommonKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vkmeta = UncommonKey.getItemMeta();
		vkmeta.setDisplayName(ChatColor.BLUE + "Uncommon Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vkmeta.setLore(lore);
		UncommonKey.setItemMeta(vkmeta);
		itemList.add(UncommonKey);
		
		return itemList;
	}
	
	public static List<ItemStack> UncommonList(){
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		
		ItemStack UncommonHelmet = new ItemStack(Material.IRON_HELMET);
		ItemMeta hmeta = UncommonHelmet.getItemMeta();
		hmeta.setDisplayName(ChatColor.BLUE + "Uncommon Helmet");
		UncommonHelmet.setItemMeta(hmeta);
		UncommonHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(UncommonHelmet);
		
		ItemStack UncommonChest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta cMeta = UncommonChest.getItemMeta();
		cMeta.setDisplayName(ChatColor.BLUE + "Uncommon Chestplate");
		UncommonChest.setItemMeta(cMeta);
		UncommonChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(UncommonChest);
		
		ItemStack UncommonLegs = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta lmeta = UncommonLegs.getItemMeta();
		lmeta.setDisplayName(ChatColor.BLUE + "Uncommon Leggings");
		UncommonLegs.setItemMeta(lmeta);
		UncommonLegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(UncommonLegs);
		
		ItemStack UncommonBoots = new ItemStack(Material.IRON_BOOTS);
		ItemMeta bmeta = UncommonBoots.getItemMeta();
		bmeta.setDisplayName(ChatColor.BLUE + "Uncommon Boots");
		UncommonBoots.setItemMeta(bmeta);
		UncommonBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		itemList.add(UncommonBoots);
		
		itemList.add(new ItemStack(Material.DIAMOND, 3));
		itemList.add(new ItemStack(Material.COOKED_BEEF, 32));
		
		ItemStack RareKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vk2meta = RareKey.getItemMeta();
		vk2meta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "Rare Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vk2meta.setLore(lore);
		RareKey.setItemMeta(vk2meta);
		itemList.add(RareKey);
		
		return itemList;
	}
	
	public static List<ItemStack> RareList(){
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		
		ItemStack UncommonHelmet = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta hMeta = UncommonHelmet.getItemMeta();
		hMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "Rare Helmet");
		UncommonHelmet.setItemMeta(hMeta);
		UncommonHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(UncommonHelmet);
		
		ItemStack UncommonChest = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta cMeta = UncommonChest.getItemMeta();
		cMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "Rare Chestplate");
		UncommonChest.setItemMeta(cMeta);
		UncommonChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(UncommonChest);
		
		ItemStack UncommonLegs = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta lMeta = UncommonLegs.getItemMeta();
		lMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "Rare Leggings");
		UncommonLegs.setItemMeta(lMeta);
		UncommonLegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(UncommonLegs);
		
		ItemStack UncommonBoots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta bMeta = UncommonBoots.getItemMeta();
		bMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "Rare Boots");
		UncommonBoots.setItemMeta(bMeta);
		UncommonBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		itemList.add(UncommonBoots);
		
		itemList.add(new ItemStack(Material.IRON_INGOT, 32));
		itemList.add(new ItemStack(Material.GOLDEN_APPLE, 3));
		itemList.add(new ItemStack(Material.DIAMOND, 8));
		
		ItemStack RareKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta vk2meta = RareKey.getItemMeta();
		vk2meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythical Key");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "A crate key!");
		vk2meta.setLore(lore);
		RareKey.setItemMeta(vk2meta);
		itemList.add(RareKey);
		
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
