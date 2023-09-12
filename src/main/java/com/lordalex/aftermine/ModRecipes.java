package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
    public static void registerRecipes() {
        ModRecipes.regStrongCobbleStone();
        ModRecipes.regStrongStoneSword();
        ModRecipes.regStrongStonePickaxe();
        ModRecipes.regStrongStoneLabrys();
        ModRecipes.regStrongStoneBricks();
        ModRecipes.regStrongBrickStairs();

    }
    public static void regStrongCobbleStone(){
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongCobblestone),
                "CCC", "CCC", "CCC",
                'C', Blocks.cobblestone);
    }
    public static void regStrongStoneSword(){
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneSword),
                " C ", " C ", " S ",
                'C', Main.strongCobblestone,
                'S', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneSword),
                "  C", "  C", "  S",
                'C', Main.strongCobblestone,
                'S', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneSword),
                "C  ", "C  ", "S  ",
                'C', Main.strongCobblestone,
                'S', Items.stick);
    }
    public static void regStrongStonePickaxe() {
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStonePickaxe),
                "CCC", " S ", " S ",
                'C', Main.strongCobblestone,
                'S', Items.stick);
    }
    public static void regStrongStoneLabrys() {
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneLabrys),
                "CCC", "CSC", " S ",
                'C', Main.strongCobblestone,
                'S', Items.stick);
    }
    public static void regStrongStoneBricks() {
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks, 4),
                " CC", " CC", "   ",
                'C', Main.strongCobblestone);

        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks, 4),
                "   ", "CC ", "CC ",
                'C', Main.strongCobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks, 4),
                "CC ", "CC ", "   ",
                'C', Main.strongCobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks, 4),
                "   ", " CC", " CC",
                'C', Main.strongCobblestone);
    }
    public static void regStrongBrickStairs() {
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongBrickStairs, 4),
                "C  ", "CC ", "CCC",
                'C', Main.strongStoneBricks);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongBrickStairs, 4),
                "  C", " CC", "CCC",
                'C', Main.strongStoneBricks);
    }
}