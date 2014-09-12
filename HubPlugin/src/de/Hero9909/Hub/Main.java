package de.Hero9909.Hub;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	private static Plugin plugin;
	@SuppressWarnings("unused")
	private Content c;
	
	@Override
	public void onLoad() {
		plugin = this;
		c = new Content();
		super.onLoad();
	}
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new Handler(), this);
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		
		super.onDisable();
	}
	
	public static Plugin getPlugin(){
		return plugin;
	}

}
