package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class StrongBrickStairs extends BlockStairs {
    protected StrongBrickStairs(Material material, String name, String texture) {
        super(Main.strongStoneBricks, 0);
        this.setBlockName(name);
        this.setLightLevel(0F);
        this.setLightOpacity(10);
        this.setHardness(5.0F);
        this.setCreativeTab(Main.lordItems);
        this.setResistance(10.0F);
        this.setHarvestLevel("picaxe", 2);
        this.setStepSound(soundTypeStone);
        this.setBlockTextureName(Main.MODID + ":" + "strong_stone_bricks");
        GameRegistry.registerBlock(this, name);
    }
}
