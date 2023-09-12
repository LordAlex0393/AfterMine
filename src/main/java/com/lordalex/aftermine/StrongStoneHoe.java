package com.lordalex.aftermine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class StrongStoneHoe extends ItemHoe {
    public StrongStoneHoe(Item.ToolMaterial material, String name, String texture) {
        super(ModItems.STRONG_STONE_TOOL_MATERIAL);
        setUnlocalizedName("Strong_Stone_Hoe");
        setCreativeTab(Main.lordItems);
        this.setTextureName(Main.MODID + ":" + texture);
        GameRegistry.registerItem(this, name);
    }
}
