package com.lordalex.aftermine;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon;


public class ModItems extends ItemSword {
    private String texture;

    public ModItems(ToolMaterial p_i45356_1_, String name, String texture) {
		super(p_i45356_1_);
        this.texture = texture;
        this.setTextureName(Main.MODID + ":" + texture);
        setUnlocalizedName(name);
        setTextureName(Main.MODID + ":" + texture);
        setCreativeTab(Main.lordItems);
        setMaxDamage(1000);
		GameRegistry.registerItem(this, name);
	}
//	@SideOnly(Side.CLIENT)
//	public void addInformation(List par3List) {
//		par3List.add("111111111");
//		par3List.add("111111111: "+this.getMaxDamage());
//	}
}