package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import java.util.List;


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

    public void onCreated(ItemStack itemStack, World world, EntityPlayer player){
        if(world.isRemote){
            player.addChatMessage(new ChatComponentText("§7StrongSword§f was created!"));
        }
    }

	@SideOnly(Side.CLIENT)
	public void addInformation(List par3List) {
		par3List.add("NewItem");
		par3List.add("Damage: "+this.getMaxDamage());
	}
}