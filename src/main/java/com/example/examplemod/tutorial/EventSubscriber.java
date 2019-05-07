package com.example.examplemod.tutorial;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.tutorial.item.ItemFirstItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID)
public final class EventSubscriber {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {
                new ItemFirstItem().setRegistryName("first_item").setUnlocalizedName(ExampleMod.MODID + "." + "first_item"),
        };

        event.getRegistry().registerAll(items);
    }
}
