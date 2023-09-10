package com.lordalex.aftermine;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;


public class ModItems extends ItemSword {

	public ModItems(ToolMaterial p_i45356_1_, String texture) {
		super(p_i45356_1_);
        setUnlocalizedName("strong_cobblestone_sword");
        setTextureName(Main.MODID + ":" + texture);
        setCreativeTab(Main.lordItems);
        setMaxDamage(1000);
		GameRegistry.registerItem(this, "strongcobblestonesword");
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(List par3List) {
		par3List.add("111111111");
		par3List.add("111111111: "+this.getMaxDamage());
	}
}