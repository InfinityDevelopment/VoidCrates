package me.alphagladiator.crates;

import me.alphagladiator.crates.commands.GiveKeyCommand;
import me.alphagladiator.crates.commands.SetCrateCommand;
import me.alphagladiator.crates.listeners.CrateOpen;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

public static Main instance;
	
	public static Main getInstance(){
		return instance;
	}
	
	public void consoleBroadcast(String s){
		Bukkit.getServer().getLogger().info(s);
	}
	
	public void registerCommands(){
		getCommand("setcrate").setExecutor(new SetCrateCommand());
		getCommand("givekey").setExecutor(new GiveKeyCommand());
	}
	
	public void registerClasses(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		
		//Listener Classes
		pm.registerEvents(new CrateOpen(), this);
		
		//Command Classes
		pm.registerEvents(new SetCrateCommand(), this);
		pm.registerEvents(new GiveKeyCommand(), this);
		
	}
	
	@Override
	public void onEnable(){
	    PluginDescriptionFile pdf = getDescription();
		consoleBroadcast(pdf.getName() + " v" + pdf.getVersion() + " by " + pdf.getAuthors() + " has been enabled.");
		consoleBroadcast("Description: " + pdf.getDescription());
		instance = this;
		registerClasses();
		registerCommands();
		getConfig().options().copyDefaults(true);   
		saveConfig();
	}
	
	@Override
	public void onDisable(){
		PluginDescriptionFile pdf = getDescription();
		consoleBroadcast(pdf.getName() + " v" + pdf.getVersion() + " by " + pdf.getAuthors() + " has been disabled.");
		instance = null;
	}
	
}
