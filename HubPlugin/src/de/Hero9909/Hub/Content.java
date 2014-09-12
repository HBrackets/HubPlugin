package de.Hero9909.Hub;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Content {
	
	private static Inventory main;
	private static Inventory games;
	private static Inventory particles;
	
	private static ItemStack rakete;
	private static ItemStack stern;
	private static ItemStack enderParticles;
	private static ItemStack feuerParticels;

	public Content(){
		// items für main
		rakete = new ItemStack(Material.FIREWORK);
		
		stern = new ItemStack(Material.NETHER_STAR);
		
		main = Bukkit.createInventory(null, 18);
		main.setItem(1, rakete);
		main.setItem(7, stern);
		//items für games
		games = Bukkit.createInventory(null, 9);
		// items für particles
		enderParticles = new ItemStack(Material.EYE_OF_ENDER);
		
		feuerParticels = new ItemStack(Material.FIREBALL);
		
		particles = Bukkit.createInventory(null, 27);
		particles.addItem(enderParticles,feuerParticels);
		
	}
	
	public static ItemStack[] getItems () {
		
		ItemStack[] is = {rakete,stern,enderParticles,feuerParticels};
		
		return is;
	}
	public static Inventory[] getMenus(){
		
		Inventory[] inv = {main,games,particles};
		
		return inv;
	}
	
}
