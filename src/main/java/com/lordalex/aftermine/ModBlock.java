package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlock extends Block {

	protected ModBlock(Material p_i45394_1_, String name, String texture) {
		super(p_i45394_1_);
		setBlockTextureName("aftermine:strongcobblestone");
		this.setBlockName(name);
		this.setLightLevel(0F);
		this.setLightOpacity(10);
		this.setHardness(10.0F);
		this.setCreativeTab(Main.lordItems);
		this.setResistance(10.0F);
		this.setHarvestLevel("picaxe", 3);
		this.setStepSound(soundTypeStone);
		GameRegistry.registerBlock(this, name);
	}
}
