package com.thevortex.roofcompatfc;

import com.mojang.logging.LogUtils;
import com.thevortex.roofcompatfc.block.ModRegistry;
import com.thevortex.roofcompatfc.block.ModStoneRegistry;
import com.thevortex.roofcompatfc.block.ModStrippedRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RoofCompaTFC.MODID)
public class RoofCompaTFC
{
    public static final String MODID = "mcw_tfc_roof";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final TabRTFC TAB_GROUP = new TabRTFC("tab_rctfc");
    public RoofCompaTFC()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        ModRegistry.BLOCKS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModRegistry.ITEMS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModStoneRegistry.BLOCKS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModStoneRegistry.ITEMS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModStrippedRegistry.BLOCKS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModStrippedRegistry.ITEMS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event)
    {


    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

    }

    private void processIMC(final InterModProcessEvent event)
    {
     }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }


    public static class TabRTFC extends CreativeModeTab
    {
        public TabRTFC(String name)
        {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModStrippedRegistry.stripped_kapok_steep_roof.get());
        }

        @Override
        public boolean hasSearchBar()
        {
            return false;
        }
    }
}
