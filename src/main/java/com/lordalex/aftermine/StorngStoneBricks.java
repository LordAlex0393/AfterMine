package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class StorngStoneBricks extends Block {
    protected StorngStoneBricks(Material material, String name, String texture) {
        super(material);
        this.setBlockName(name);
        this.setLightLevel(0F);
        this.setLightOpacity(10);
        this.setHardness(2.0F);
        this.setCreativeTab(Main.lordItems);
        this.setResistance(2000.0F);
        this.setHarvestLevel("picaxe", 2);
        this.setStepSound(soundTypeStone);
        this.setBlockTextureName(Main.MODID + ":" + texture);
        GameRegistry.registerBlock(this, name);
    }
}
