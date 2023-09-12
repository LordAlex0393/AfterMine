package com.lordalex.aftermine;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
    public static final Item.ToolMaterial STRONG_STONE_TOOL_MATERIAL =
            EnumHelper.addToolMaterial("aftermine:strongstone", 3, 256, 5F, 3F, 30);
    public static final Item.ToolMaterial STRONG_STONE_LABRYS_MATERIAL =
            EnumHelper.addToolMaterial("aftermine:strongstonelabrys", 3, 300, 5F, 5F, 30);
}
