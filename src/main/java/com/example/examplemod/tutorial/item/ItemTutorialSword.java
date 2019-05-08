package com.example.examplemod.tutorial.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemSword;

public class ItemTutorialSword extends ItemSword {

    public ItemTutorialSword(ToolMaterial material) {
        super(material);
        setCreativeTab(ExampleMod.TUTORIAL_TAB);
    }
}
