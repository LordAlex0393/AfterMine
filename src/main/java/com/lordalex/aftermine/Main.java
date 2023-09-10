package com.lordalex.aftermine;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main {
	
	public static final CreativeTabs lordItems = new CreativeTabs("lordItems") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Main.strongCobblestone);
		}
	};
	
	public static final String MODID = "Aftermine";
	public static final String MODNAME = "AfterMine";
	public static final String VERSION = "1.1.1";
	
	public static Block strongCobblestone;
	public static Item strongCobblestoneSword;
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		strongCobblestone = new ModBlock(Material.iron, "StrongCobblestone", "strongcobblestone");
		strongCobblestoneSword = new ModItems(ToolMaterial.STONE, "strongcobblestonesword");
		ModRecipes.registerRecipes();
	}

}
