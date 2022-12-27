package com.thevortex.roofcompatfc.datagen.client;

import com.thevortex.roofcompatfc.RoofCompaTFC;
import com.thevortex.roofcompatfc.block.ModRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;

public class BlockModels extends BlockModelProvider {
    private final ExistingFileHelper fileHelper;
    public BlockModels(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, RoofCompaTFC.MODID, fileHelper);
        this.fileHelper = fileHelper;
    }

    private ResourceLocation resTFCLog(String name) {
        existingFileHelper.trackGenerated(new ResourceLocation("tfc", "block/wood/log/".concat(name.toLowerCase().replace(" ","_"))), TEXTURE);
        return new ResourceLocation("tfc", "block/wood/log/".concat(name.toLowerCase().replace(" ","_")));
    }
    private ResourceLocation resTFCStrLog(String name) {
        existingFileHelper.trackGenerated(new ResourceLocation("tfc", "block/wood/stripped_log/".concat(name.toLowerCase().replace(" ","_"))), TEXTURE);
        return new ResourceLocation("tfc", "block/wood/stripped_log/".concat(name.toLowerCase().replace(" ","_")));
    }
    private ResourceLocation resTFCStone(String name) {
        existingFileHelper.trackGenerated(new ResourceLocation("tfc", "block/rock/bricks/".concat(name.toLowerCase().replace(" ","_"))), TEXTURE);
        return new ResourceLocation("tfc", "block/rock/bricks/".concat(name.toLowerCase().replace(" ","_")));
    }
    public static final String[] list_rooftype = {"Roof", "Attic Roof", "Top Roof", "Lower Roof", "Steep Roof", "Upper Lower Roof", "Upper Steep Roof"};

    public static final String[] list_wood = {"Ash", "Aspen", "Blackwood", "Chestnut", "Douglas Fir", "Hickory", "Kapok", "Maple", "Palm", "Pine", "Rosewood", "Sequoia", "Sycamore", "White Cedar", "Willow"};

    public static final String[] list_stone = {"Andesite", "Basalt", "Chalk", "Chert", "Claystone", "Conglomerate", "Dacite", "Diorite", "Dolomite", "Gabbro", "Gneiss", "Granite", "Limestone", "Marble", "Phyllite", "Quartzite", "Rhyolite", "Schist", "Shale", "Slate"};








    protected void registerAttic() {
        ResourceLocation parentOpen = new ResourceLocation("mcwroofs", "block/parent/attic_roof_open");
        ResourceLocation parentClosed = new ResourceLocation("mcwroofs", "block/parent/attic_roof_closed");
        existingFileHelper.trackGenerated(parentClosed, MODEL);
        existingFileHelper.trackGenerated(parentOpen, MODEL);

        for(String log: list_wood){
            String roof = "attic_roof";
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
                 withExistingParent("block/attic/" +name +"_open",parentOpen)
                        .texture("2", resTFCLog(log))
                        .texture("3", "minecraft:block/glass")
                        .texture("particle", resTFCLog(log));
                withExistingParent("block/attic/" +name +"_closed",parentClosed)
                        .texture("2", resTFCLog(log))
                        .texture("3", "minecraft:block/glass")
                        .texture("particle", resTFCLog(log));


        }
        for(String log: list_wood){
            String roof = "attic_roof";
            String name = "stripped_" + log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
            withExistingParent("block/attic/" +name +"_open",parentOpen)
                    .texture("2", resTFCStrLog(log))
                    .texture("3", "minecraft:block/glass")
                    .texture("particle", resTFCStrLog(log));
            withExistingParent("block/attic/" +name +"_closed",parentClosed)
                    .texture("2", resTFCStrLog(log))
                    .texture("3", "minecraft:block/glass")
                    .texture("particle", resTFCStrLog(log));


        }
        for(String stone: list_stone){
            String roof = "attic_roof";
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
                withExistingParent("block/attic/" +name+"_open",parentOpen)
                        .texture("2", resTFCStone(stone))
                        .texture("3", "minecraft:block/glass")
                        .texture("particle", resTFCStone(stone));
                withExistingParent("block/attic/" +name+"_closed",parentClosed)
                        .texture("2", resTFCStone(stone))
                        .texture("3", "minecraft:block/glass")
                        .texture("particle", resTFCStone(stone));

            }

    }

    protected void registerLower() {
        ResourceLocation parentLower = new ResourceLocation("mcwroofs", "block/parent/xx_lower");
        ResourceLocation parentLowerInner = new ResourceLocation("mcwroofs", "block/parent/xx_lower_inner");
        ResourceLocation parentLowerOuter = new ResourceLocation("mcwroofs", "block/parent/xx_lower_outer");
        existingFileHelper.trackGenerated(parentLower, MODEL);
        existingFileHelper.trackGenerated(parentLowerInner, MODEL);
        existingFileHelper.trackGenerated(parentLowerOuter, MODEL);
        for(String log: list_wood){
            String roof = "lower_roof";
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent("block/lower/"+name,parentLower)
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent("block/lower/"+name+"_inner",parentLowerInner)
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent("block/lower/"+name+"_outer",parentLowerOuter)
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));


        }
        for(String log: list_wood){
            String roof = "lower_roof";
            String name = "stripped_" + log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
            withExistingParent("block/lower/"+name,parentLower)
                    .texture("1_2", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));
            withExistingParent("block/lower/"+name+"_inner",parentLowerInner)
                    .texture("1_2", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));
            withExistingParent("block/lower/"+name+"_outer",parentLowerOuter)
                    .texture("1_2", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));


        }
        for(String stone: list_stone){
        String roof = "lower_roof";
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent("block/lower/"+name,parentLower)
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent("block/lower/"+name+"_inner",parentLower +"_inner")
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent("block/lower/"+name+"_outer",parentLower +"_outer")
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));

            }

    }
    protected void registerUpperLower() {
        ResourceLocation parentLower = new ResourceLocation("mcwroofs", "block/parent/xx_upper_lower");
        ResourceLocation parentLowerInner = new ResourceLocation("mcwroofs", "block/parent/xx_upper_lower_inner");
        ResourceLocation parentLowerOuter = new ResourceLocation("mcwroofs", "block/parent/xx_upper_lower_outer");
        existingFileHelper.trackGenerated(parentLower, MODEL);
        existingFileHelper.trackGenerated(parentLowerInner, MODEL);
        existingFileHelper.trackGenerated(parentLowerOuter, MODEL);
        for(String log: list_wood){
            String roof = "upper_lower_roof";
            String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
            withExistingParent("block/lower/"+name,parentLower)
                    .texture("1_2", resTFCLog(log))
                    .texture("particle", resTFCLog(log));
            withExistingParent("block/lower/"+name+"_inner",parentLower +"_inner")
                    .texture("1_2", resTFCLog(log))
                    .texture("particle", resTFCLog(log));
            withExistingParent("block/lower/"+name+"_outer",parentLower +"_outer")
                    .texture("1_2", resTFCLog(log))
                    .texture("particle", resTFCLog(log));

        }
        for(String log: list_wood){
            String roof = "upper_lower_roof";
            String name = "stripped_" + log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
            withExistingParent("block/lower/"+name,parentLower)
                    .texture("1_2", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));
            withExistingParent("block/lower/"+name+"_inner",parentLower +"_inner")
                    .texture("1_2", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));
            withExistingParent("block/lower/"+name+"_outer",parentLower +"_outer")
                    .texture("1_2", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));

        }
        for(String stone: list_stone){
            String roof = "upper_lower_roof";
            String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
            withExistingParent("block/lower/"+name,parentLower)
                    .texture("1_2", resTFCStone(stone))
                    .texture("particle", resTFCStone(stone));
            withExistingParent("block/lower/"+name+"_inner",parentLower +"_inner")
                    .texture("1_2", resTFCStone(stone))
                    .texture("particle", resTFCStone(stone));
            withExistingParent("block/lower/"+name+"_outer",parentLower +"_outer")
                    .texture("1_2", resTFCStone(stone))
                    .texture("particle", resTFCStone(stone));

        }

    }
    protected void registerRoof() {
        ResourceLocation parentRoof = new ResourceLocation("mcwroofs", "block/parent/roof");
        ResourceLocation parentRoofInner = new ResourceLocation("mcwroofs", "block/parent/roof_inner");
        ResourceLocation parentRoofOuter = new ResourceLocation("mcwroofs", "block/parent/roof_outer");
        existingFileHelper.trackGenerated(parentRoof, MODEL);
        existingFileHelper.trackGenerated(parentRoofInner, MODEL);
        existingFileHelper.trackGenerated(parentRoofOuter, MODEL);
        for(String log: list_wood){
            String roof = "roof";
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
                withExistingParent("block/roof/"+name,parentRoof)
                        .texture("2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent("block/roof/"+name+"_inner",parentRoofInner)
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));
                withExistingParent("block/roof/"+name+"_outer",parentRoofOuter)
                        .texture("4", resTFCLog(log))
                        .texture("particle", resTFCLog(log));

        }
        for(String log: list_wood){
            String roof = "roof";
            String name = "stripped_" + log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
            withExistingParent("block/roof/"+name,parentRoof)
                    .texture("2", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));
            withExistingParent("block/roof/"+name+"_inner",parentRoofInner)
                    .texture("1_2", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));
            withExistingParent("block/roof/"+name+"_outer",parentRoofOuter)
                    .texture("4", resTFCStrLog(log))
                    .texture("particle", resTFCStrLog(log));

        }
        for(String stone: list_stone){
            String roof = "roof";
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_");
                withExistingParent("block/roof/"+name,parentRoof)
                        .texture("2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent("block/roof/"+name+"_inner",parentRoof +"_inner")
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
                withExistingParent("block/roof/"+name+"_outer",parentRoof +"_outer")
                        .texture("4", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
            }

    }


    protected void registerSteep() {
        ResourceLocation parentSteep = new ResourceLocation("mcwroofs", "block/parent/xx_steep");
        ResourceLocation parentSteepInner = new ResourceLocation("mcwroofs", "block/parent/xx_steep_inner");
        ResourceLocation parentSteepOuter = new ResourceLocation("mcwroofs", "block/parent/xx_steep_outer");

        existingFileHelper.trackGenerated(parentSteep, MODEL);
        existingFileHelper.trackGenerated(parentSteepInner, MODEL);
        existingFileHelper.trackGenerated(parentSteepOuter, MODEL);
        for(String log: list_wood){
            String roof = "steep_roof";
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent("block/steep/"+name,parentSteep)
                        .texture("2", resTFCLog(log.toLowerCase()))
                        .texture("particle", resTFCLog(log.toLowerCase()));
                withExistingParent("block/steep/"+name+"_inner",parentSteepInner)
                        .texture("2", resTFCLog(log.toLowerCase()))
                        .texture("particle", resTFCLog(log.toLowerCase()));
                withExistingParent("block/steep/"+name+"_outer",parentSteepOuter)
                        .texture("2", resTFCLog(log.toLowerCase()))
                        .texture("particle", resTFCLog(log.toLowerCase()));

        }
        for(String log: list_wood){
            String roof = "steep_roof";
            String name = "stripped_" + log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
            withExistingParent("block/steep/"+name,parentSteep)
                    .texture("2", resTFCStrLog(log.toLowerCase()))
                    .texture("particle", resTFCStrLog(log.toLowerCase()));
            withExistingParent("block/steep/"+name+"_inner",parentSteepInner)
                    .texture("2", resTFCStrLog(log.toLowerCase()))
                    .texture("particle", resTFCStrLog(log.toLowerCase()));
            withExistingParent("block/steep/"+name+"_outer",parentSteepOuter)
                    .texture("2", resTFCStrLog(log.toLowerCase()))
                    .texture("particle", resTFCStrLog(log.toLowerCase()));

        }
        for(String stone: list_stone){
            String roof = "steep_roof";
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
                withExistingParent("block/steep/"+name,parentSteep)
                        .texture("2", resTFCStone(stone.toLowerCase()))
                        .texture("particle", resTFCStone(stone.toLowerCase()));
                withExistingParent("block/steep/"+name+"_inner",parentSteepInner)
                        .texture("2", resTFCStone(stone.toLowerCase()))
                        .texture("particle", resTFCStone(stone.toLowerCase()));
                withExistingParent("block/steep/"+name+"_outer",parentSteepOuter)
                        .texture("2", resTFCStone(stone.toLowerCase()))
                        .texture("particle", resTFCStone(stone.toLowerCase()));
            }

    }


    protected void registerUpperSteep() {
        ResourceLocation parentSteep = new ResourceLocation("mcwroofs", "block/parent/xx_upper_steep");
        ResourceLocation parentSteepInner = new ResourceLocation("mcwroofs", "block/parent/xx_upper_steep_inner");
        ResourceLocation parentSteepOuter = new ResourceLocation("mcwroofs", "block/parent/xx_upper_steep_outer");

        existingFileHelper.trackGenerated(parentSteep, MODEL);
        existingFileHelper.trackGenerated(parentSteepInner, MODEL);
        existingFileHelper.trackGenerated(parentSteepOuter, MODEL);
        for(String log: list_wood){
            String roof = "steep_roof";
            String name = log.toLowerCase().replace(" ","_") + "_" + "upper_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
            withExistingParent("block/steep/"+name,parentSteep)
                    .texture("2", resTFCLog(log.toLowerCase()))
                    .texture("particle", resTFCLog(log.toLowerCase()));
            withExistingParent("block/steep/"+name+"_inner",parentSteepInner)
                    .texture("2", resTFCLog(log.toLowerCase()))
                    .texture("particle", resTFCLog(log.toLowerCase()));
            withExistingParent("block/steep/"+name+"_outer",parentSteepOuter)
                    .texture("2", resTFCLog(log.toLowerCase()))
                    .texture("particle", resTFCLog(log.toLowerCase()));

        }
        for(String log: list_wood){
            String roof = "steep_roof";
            String name = "stripped_" + log.toLowerCase().replace(" ","_") + "_" + "upper_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
            withExistingParent("block/steep/"+name,parentSteep)
                    .texture("2", resTFCStrLog(log.toLowerCase()))
                    .texture("particle", resTFCStrLog(log.toLowerCase()));
            withExistingParent("block/steep/"+name+"_inner",parentSteepInner)
                    .texture("2", resTFCStrLog(log.toLowerCase()))
                    .texture("particle", resTFCStrLog(log.toLowerCase()));
            withExistingParent("block/steep/"+name+"_outer",parentSteepOuter)
                    .texture("2", resTFCStrLog(log.toLowerCase()))
                    .texture("particle", resTFCStrLog(log.toLowerCase()));

        }
        for(String stone: list_stone){
            String roof = "steep_roof";
            String name =  stone.toLowerCase().replace(" ","_") + "_" + "upper_" + roof.toLowerCase().replace(" ","_").replace("_roof","");
            withExistingParent("block/steep/"+name,parentSteep)
                    .texture("2", resTFCStone(stone.toLowerCase()))
                    .texture("particle", resTFCStone(stone.toLowerCase()));
            withExistingParent("block/steep/"+name+"_inner",parentSteepInner)
                    .texture("2", resTFCStone(stone.toLowerCase()))
                    .texture("particle", resTFCStone(stone.toLowerCase()));
            withExistingParent("block/steep/"+name+"_outer",parentSteepOuter)
                    .texture("2", resTFCStone(stone.toLowerCase()))
                    .texture("particle", resTFCStone(stone.toLowerCase()));
        }

    }

    protected void registerTop() {


        String[] variants = { "top_inner", "top_outer", "top_pyramid", "top_roof", "top_roof_end"};
        ResourceLocation parentTop = new ResourceLocation("mcwroofs", "block/parent/");
        for(String log: list_wood){
            for(String roof: variants){
                ResourceLocation loc = new ResourceLocation(parentTop.toString() + roof.toLowerCase());
                existingFileHelper.trackGenerated(loc, MODEL);
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase();
                withExistingParent("block/top/"+name ,parentTop + roof)
                        .texture("1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));

            }
        }
        for(String log: list_wood){
            for(String roof: variants){
                ResourceLocation loc = new ResourceLocation(parentTop.toString() + roof.toLowerCase());
                existingFileHelper.trackGenerated(loc, MODEL);
                String name = "stripped_" + log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase();
                withExistingParent("block/top/"+name ,parentTop + roof)
                        .texture("1_2", resTFCStrLog(log))
                        .texture("particle", resTFCStrLog(log));

            }
        }
        for(String stone: list_stone){
            for(String roof: variants){
                ResourceLocation loc = new ResourceLocation(parentTop.toString() + roof.toLowerCase());
                existingFileHelper.trackGenerated(loc, MODEL);
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase();
                withExistingParent("block/top/"+name,loc)
                        .texture("1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));
            }
        }
        String[] outliers = { "four_way_roof", "three_way_roof" };
        for(String log: list_wood){
            for(String roof: outliers){
                ResourceLocation loc = new ResourceLocation(parentTop.toString() + roof.toLowerCase());
                existingFileHelper.trackGenerated(loc, MODEL);
                String name = log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase();
                withExistingParent("block/top/"+name,loc)
                        .texture("1_1_2", resTFCLog(log))
                        .texture("particle", resTFCLog(log));

            }
        }
        for(String log: list_wood){
            for(String roof: outliers){
                ResourceLocation loc = new ResourceLocation(parentTop.toString() + roof.toLowerCase());
                existingFileHelper.trackGenerated(loc, MODEL);
                String name = "stripped_" + log.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase();
                withExistingParent("block/top/"+name,loc)
                        .texture("1_1_2", resTFCStrLog(log))
                        .texture("particle", resTFCStrLog(log));

            }
        }
        for(String stone: list_stone){
            for(String roof: outliers){
                String name = stone.toLowerCase().replace(" ","_") + "_" + roof.toLowerCase();
                withExistingParent("block/top/"+name,parentTop + roof.toLowerCase())
                        .texture("1_1_2", resTFCStone(stone))
                        .texture("particle", resTFCStone(stone));

            }
        }
    }
    @Override
    protected void registerModels() {
    registerAttic();
    registerLower();
    registerUpperLower();
    registerRoof();
    registerSteep();
    registerTop();
    registerUpperSteep();
    }


}