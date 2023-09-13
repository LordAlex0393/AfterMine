package com.lordalex.aftermine;

import com.google.common.collect.Sets;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class StrongStoneShovel extends ItemTool {
    public static final Set<Block> HARVEST_BLOCKS = Sets.newHashSet(
            Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer,
            Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium
    );

    public StrongStoneShovel(Item.ToolMaterial material, String name, String texture) {
        super(1F, ModItems.STRONG_STONE_TOOL_MATERIAL, HARVEST_BLOCKS);
        setUnlocalizedName(name);
        setTextureName(Main.MODID + ":" + texture);
        setCreativeTab(Main.lordItems);
        setHarvestLevel("shovel", ModItems.STRONG_STONE_TOOL_MATERIAL.getHarvestLevel());
        GameRegistry.registerItem(this, name);
    }
}