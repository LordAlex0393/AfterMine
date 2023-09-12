package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
    public static void registerRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongCobblestone),
                "CCC", "CCC", "CCC",
                'C', Blocks.cobblestone);

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

        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStonePickaxe),
                "CCC", " S ", " S ",
                'C', Main.strongCobblestone,
                'S', Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneLabrys),
                "CCC", "CSC", " S ",
                'C', Main.strongCobblestone,
                'S', Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks),
                " CC", " CC", "   ",
                'C', Main.strongCobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks),
                "   ", "CC ", "CC ",
                'C', Main.strongCobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks),
                "CC ", "CC ", "   ",
                'C', Main.strongCobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks),
                "   ", " CC", " CC",
                'C', Main.strongCobblestone);

        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks),
                "C  ", "CC ", "CCC",
                'C', Main.strongCobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(Main.strongStoneBricks),
                "  C", " CC", "CCC",
                'C', Main.strongCobblestone);
    }
}