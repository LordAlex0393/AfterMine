package com.lordalex.aftermine;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
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
	public static Block strongStoneBricks;
	public static Block strongBrickStairs;
	public static Item strongStoneSword;
	public static Item strongStonePickaxe;
	public static Item strongStoneLabrys;

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		strongCobblestone = new StrongStone(Material.iron, "StrongStone", "strong_stone");
		strongStoneBricks = new StorngStoneBricks(Material.iron, "StrongStoneBricks", "strong_stone_bricks");
		strongBrickStairs = new StrongBrickStairs(Material.iron,"StrongBrickStairs", "strong_brick_stairs");

		strongStoneSword = new ModItemSword(ToolMaterial.IRON, "StrongStoneSword", "strong_stone_sword");
		strongStonePickaxe = new StrongStonePickaxe(ModItems.STRONG_STONE_TOOL_MATERIAL, "StrongStonePickaxe", "strong_stone_pickaxe");
		strongStoneLabrys = new StrongStoneLabrys(ModItems.STRONG_STONE_LABRYS_MATERIAL, "StrongStoneLabrys", "strong_stone_labrys");
		ModRecipes.registerRecipes();
	}

}
