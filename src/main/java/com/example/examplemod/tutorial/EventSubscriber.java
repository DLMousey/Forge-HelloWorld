package com.example.examplemod.tutorial;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.tutorial.block.BlockFirstBlock;
import com.example.examplemod.tutorial.init.ModBlocks;
import com.example.examplemod.tutorial.item.*;
import com.example.examplemod.tutorial.material.TutorialMaterials;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = ExampleMod.MODID)
public final class EventSubscriber {

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockFirstBlock().setRegistryName("first_block").setUnlocalizedName(ExampleMod.MODID + "." + "first_block"),
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemFirstItem().setRegistryName("first_item").setUnlocalizedName(ExampleMod.MODID + "." + "first_item"),
                new ItemTutorialAxe(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_axe").setUnlocalizedName(ExampleMod.MODID + "." + "tutorial_axe"),
                new ItemTutorialHoe(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_hoe").setUnlocalizedName(ExampleMod.MODID + "." + "tutorial_hoe"),
                new ItemTutorialPickaxe(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_pickaxe").setUnlocalizedName(ExampleMod.MODID + "." + "tutorial_pickaxe"),
                new ItemTutorialShovel(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_shovel").setUnlocalizedName(ExampleMod.MODID + "." + "tutorial_shovel"),
                new ItemTutorialSword(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_sword").setUnlocalizedName(ExampleMod.MODID + "." + "tutorial_sword")
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName()),
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}
