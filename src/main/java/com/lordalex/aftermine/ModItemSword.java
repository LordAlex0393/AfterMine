package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;


public class ModItemSword extends ItemSword {
    private String texture;

    public ModItemSword(ToolMaterial p_i45356_1_, String name, String texture) {
        super(p_i45356_1_);
        this.texture = texture;
        this.setTextureName(Main.MODID + ":" + texture);
        setUnlocalizedName(name);
        setTextureName(Main.MODID + ":" + texture);
        setCreativeTab(Main.lordItems);
        setMaxDamage(1000);
        GameRegistry.registerItem(this, name);
    }

    @Override
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
        p_77644_1_.damageItem(10, p_77644_3_);
        return true;
    }



//	@SideOnly(Side.CLIENT)
//	public void addInformation(List par3List) {
//		par3List.add("111111111");
//		par3List.add("111111111: "+this.getMaxDamage());
//	}
}