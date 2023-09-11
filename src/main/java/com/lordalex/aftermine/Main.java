package com.lordalex.aftermine;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
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
	public static final String VERSION = "1.1.3";

	public static Block strongCobblestone;
	public static Item strongCobblestoneSword;
	public static Item strongCobblestonePickaxe;

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		strongCobblestone = new StrongStone(Material.iron, "StrongStone", "strong_stone");
		strongCobblestoneSword = new ModItemSword(ToolMaterial.IRON, "StrongStoneSword", "strong_stone_sword");
		strongCobblestonePickaxe = new StrongStonePickaxe(ModItems.STRONG_STONE_TOOL_MATERIAL, "StrongStonePickaxe", "strong_stone_pickaxe");
		ModRecipes.registerRecipes();
	}

}
