package com.example.examplemod.tutorial.tabs;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.tutorial.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TutorialTab extends CreativeTabs {

    public TutorialTab() {
        super(ExampleMod.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.FIRST_ITEM);
    }
}
