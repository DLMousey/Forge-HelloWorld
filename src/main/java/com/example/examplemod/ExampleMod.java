package com.example.examplemod;

import com.example.examplemod.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(ExampleMod.MODID);

    public static final String CLIENT = "com.example.examplemod.proxy.ClientProxy";
    public static final String SERVER = "com.example.examplemod.proxy.ServerProxy";

    @SidedProxy(clientSide = ExampleMod.CLIENT, serverSide = ExampleMod.SERVER)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        LOGGER.info(ExampleMod.NAME + " says hi!");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
