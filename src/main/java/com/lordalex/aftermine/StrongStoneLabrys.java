package com.lordalex.aftermine;

import com.google.common.collect.Sets;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class StrongStoneLabrys extends ItemTool {
    public static final Set<Block> HARVEST_BLOCKS = Sets.newHashSet(
            Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin
    );

    public StrongStoneLabrys(Item.ToolMaterial material, String name, String texture) {
        super(3F, material, HARVEST_BLOCKS);
        setUnlocalizedName(name);
        setTextureName(Main.MODID + ":" + texture);
        setCreativeTab(Main.lordItems);
        setHarvestLevel("axe", material.getHarvestLevel());
        GameRegistry.registerItem(this, name);
    }

    @Override
    public float func_150893_a(ItemStack toolStack, Block block) {
        if (block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine)
            return super.func_150893_a(toolStack, block);
        return efficiencyOnProperMaterial;
    }
}
