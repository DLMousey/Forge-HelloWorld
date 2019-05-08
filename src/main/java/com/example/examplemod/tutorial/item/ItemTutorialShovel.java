package com.example.examplemod.tutorial.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemSpade;

public class ItemTutorialShovel extends ItemSpade {

    public ItemTutorialShovel(ToolMaterial material) {
        super(material);
        setCreativeTab(ExampleMod.TUTORIAL_TAB);
    }
}
