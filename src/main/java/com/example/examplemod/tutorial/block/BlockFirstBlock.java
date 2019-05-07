package com.example.examplemod.tutorial.block;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFirstBlock extends Block {

    public BlockFirstBlock() {
        super(Material.ROCK);
        setCreativeTab(ExampleMod.TUTORIAL_TAB);
        setSoundType(SoundType.STONE);
    }
}
