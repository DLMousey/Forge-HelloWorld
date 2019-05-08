package com.example.examplemod.tutorial.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemPickaxe;

public class ItemTutorialPickaxe extends ItemPickaxe {

    public ItemTutorialPickaxe(ToolMaterial material) {
        super(material);
        setCreativeTab(ExampleMod.TUTORIAL_TAB);
    }
}
