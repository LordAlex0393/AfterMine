package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;
import java.util.Random;

public class StrongBrickSlab extends BlockSlab {
    public static final String[] field_150006_b = new String[] {"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz"};
    @SideOnly(Side.CLIENT)
    private IIcon field_150007_M;
    protected StrongBrickSlab(Material material, String name, String texture, boolean isDouble){
        super(isDouble, Main.strongStoneBricks.getMaterial());
        this.setBlockName(name);
        this.setLightLevel(0F);
        this.setLightOpacity(10);
        this.setHardness(2.0F);
        this.setCreativeTab(Main.lordItems);
        this.setResistance(10.0F);
        this.setHarvestLevel("picaxe", 2);
        this.setStepSound(soundTypeStone);
        this.setBlockTextureName(Main.MODID + ":" + texture);
        GameRegistry.registerBlock(this, name);
    }

    @Override
    //SetName for slab
    public String func_150002_b(int p_150002_1_) {
        return "StrongBrickSlab";
    }

    /**
     * Gets the block's texture. Args: side, meta
     */

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
         return Main.strongStoneBricks.getIcon(p_149691_1_, p_149691_2_ & 7);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(Main.strongBrickSlab);
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int p_149644_1_)
    {
        return new ItemStack(Item.getItemFromBlock(Main.strongBrickSlab), 2, p_149644_1_);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {}

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        if (p_149666_1_ != Item.getItemFromBlock(Main.doubleStrongBrickSlab))
        {
                p_149666_3_.add(new ItemStack(p_149666_1_, 1));

        }
    }


}
