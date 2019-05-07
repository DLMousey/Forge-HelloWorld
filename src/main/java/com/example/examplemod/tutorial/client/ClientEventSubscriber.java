package com.example.examplemod.tutorial.client;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.tutorial.init.ModBlocks;
import com.example.examplemod.tutorial.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = ExampleMod.MODID, value = Side.CLIENT)
public final class ClientEventSubscriber {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.FIRST_ITEM);
        registerModel(Item.getItemFromBlock(ModBlocks.FIRST_BLOCK));
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(
                item,
                0,
                new ModelResourceLocation(
                        item.getRegistryName(),
                        "inventory"
                )
        );
    }
}
