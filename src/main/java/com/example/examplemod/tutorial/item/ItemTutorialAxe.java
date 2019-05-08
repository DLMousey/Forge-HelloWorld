package com.example.examplemod.tutorial.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemAxe;

public class ItemTutorialAxe extends ItemAxe {

    public ItemTutorialAxe(ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setCreativeTab(ExampleMod.TUTORIAL_TAB);
    }

    public ItemTutorialAxe(ToolMaterial material) {
        this(material, 8.0F, -3.1F);
    }
}
