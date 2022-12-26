package com.thevortex.roofcompatfc.datagen.client;

import com.thevortex.roofcompatfc.RoofCompaTFC;
import com.thevortex.roofcompatfc.block.ModRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;

public class BlockModels extends BlockModelProvider {
    public BlockModels(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, RoofCompaTFC.MODID, fileHelper);
    }

    private ResourceLocation resTFCLog(String name) {
        return new ResourceLocation("tfc", "block/wood/log/".concat(name));
    }
    private ResourceLocation resTFCStone(String name) {
        return new ResourceLocation("tfc", "block/rock/bricks/".concat(name));
    }
    public static final String[] list_rooftype = {"Roof", "Attic Roof", "Top Roof", "Lower Roof", "Steep Roof", "Upper Lower Roof", "Upper Steep Roof"};

    public static final String[] list_wood = {"Ash", "Aspen", "Blackwood", "Chestnut", "Douglas Fir", "Hickory", "Kapok", "Maple", "Palm", "Pine", "Rosewood", "Sequoia", "Sycamore", "White Cedar", "Willow"};

    public static final String[] list_stone = {"Andesite", "Basalt", "Chalk", "Chert", "Claystone", "Conglomerate", "Dacite", "Diorite", "Dolomite", "Gabbro", "Gneiss", "Granite", "Limestone", "Marble", "Phyllite", "Quartzite", "Rhyolite", "Schist", "Shale", "Slate"};


    protected void registerAttic() {
        ResourceLocation parentOpen = new ResourceLocation("mcwroofs", "block/parent/attic_roof_open");
        ResourceLocation parentClosed = new ResourceLocation("mcwroofs", "block/parent/attic_roof_closed");
        for(String log: list_wood){
            for(String roof: list_rooftype){
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
                 withExistingParent(name +"_open",parentOpen)
                        .texture("2", resTFCLog(log))
                        .texture("3", "minecraft:block/glass")
                        .texture("particle", resTFCLog(log));
                withExistingParent(name +"_closed",parentClosed)
                        .texture("2", resTFCLog(log))
                        .texture("3", "minecraft:block/glass")
                        .texture("particle", resTFCLog(log));

            }
        }
        for(String stone: list_stone){
            for(String roof: list_rooftype){
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
                withExistingParent(name+"_open",parentOpen)
                        .texture("2", resTFCStone(stone))
                        .texture("3", "minecraft:block/glass")
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_closed",parentClosed)
                        .texture("2", resTFCStone(stone))
                        .texture("3", "minecraft:block/glass")
                        .texture("particle", resTFCStone(stone));

            }
        }
    }

    protected void registerLower() {
        ResourceLocation parentLower = new ResourceLocation("mcwroofs", "block/parent/xx_lower");
        ResourceLocation parentUpper = new ResourceLocation("mcwroofs", "block/parent/xx_upper_lower");
        for(String log: list_wood){
            for(String roof: list_rooftype){
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent(name,parentLower)
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name+"_inner",parentLower +"_inner")
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name+"_outer",parentLower +"_outer")
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name,parentUpper)
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name+"_inner",parentUpper +"_inner")
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name+"_outer",parentUpper +"_outer")
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
            }
        }
        for(String stone: list_stone){
            for(String roof: list_rooftype){
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent(name,parentLower)
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_inner",parentLower +"_inner")
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_outer",parentLower +"_outer")
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name,parentUpper)
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_inner",parentUpper +"_inner")
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_outer",parentUpper +"_outer")
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
            }
        }
    }

    protected void registerRoof() {
        ResourceLocation parentRoof = new ResourceLocation("mcwroofs", "block/parent/roof");
        for(String log: list_wood){
            for(String roof: list_rooftype){
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
                withExistingParent(name,parentRoof)
                        .texture("2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name+"_inner",parentRoof +"_inner")
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name+"_outer",parentRoof +"_outer")
                        .texture("4", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
            }
        }
        for(String stone: list_stone){
            for(String roof: list_rooftype){
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
                withExistingParent(name,parentRoof)
                        .texture("2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_inner",parentRoof +"_inner")
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_outer",parentRoof +"_outer")
                        .texture("4", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
            }
        }
    }


    protected void registerSteep() {
        ResourceLocation parentSteep = new ResourceLocation("mcwroofs", "block/parent/xx_steep");
        for(String log: list_wood){
            for(String roof: list_rooftype){
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent(name,parentSteep)
                        .texture("2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name+"_inner",parentSteep +"_inner")
                        .texture("2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent(name+"_outer",parentSteep +"_outer")
                        .texture("2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
            }
        }
        for(String stone: list_stone){
            for(String roof: list_rooftype){
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent(name,parentSteep)
                        .texture("2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_inner",parentSteep +"_inner")
                        .texture("2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent(name+"_outer",parentSteep +"_outer")
                        .texture("2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
            }
        }
    }


    protected void registerTop() {
        ResourceLocation parentTop = new ResourceLocation("mcwroofs", "block/parent/");
        String[] variants = { "top_inner", "top_outer", "top_pyramid", "top_roof", "top_roof_end"};
        for(String log: list_wood){
            for(String roof: variants){
                String name = log.toLowerCase().replace(" ","_") + "_" + roof;
                withExistingParent(name,parentTop + roof)
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));

            }
        }
        for(String stone: list_stone){
            for(String roof: list_rooftype){
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent(name,parentTop)
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
            }
        }
        String[] outliers = { "four_way_roof", "three_way_roof" };
        for(String log: list_wood){
            for(String roof: outliers){
                String name = log.toLowerCase().replace(" ","_") + "_" + roof;
                withExistingParent(name,parentTop + roof)
                        .texture("1_1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));

            }
        }
        for(String stone: list_stone){
            for(String roof: outliers){
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof;
                withExistingParent(name,parentTop + roof)
                        .texture("1_1_2", resTFCLog(stone))
                        .texture("particle", resTFCLog(stone));

            }
        }
    }
    @Override
    protected void registerModels() {
    registerAttic();
    registerLower();
    registerRoof();
    registerSteep();
    registerTop();

    }


}