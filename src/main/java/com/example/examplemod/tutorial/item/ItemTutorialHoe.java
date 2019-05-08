package com.example.examplemod.tutorial.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemHoe;

public class ItemTutorialHoe extends ItemHoe {

    public ItemTutorialHoe(ToolMaterial material) {
        super(material);
        setCreativeTab(ExampleMod.TUTORIAL_TAB);
    }
}
