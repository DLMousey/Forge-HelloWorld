package com.example.examplemod.tutorial.material;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class TutorialMaterials {

    public static final Item.ToolMaterial TUTORIAL_TOOL = EnumHelper.addToolMaterial(
            ExampleMod.MODID + ":" + "tutorial_tool", 2, 625, 7.0F, 2.5F, 10
    );
}
