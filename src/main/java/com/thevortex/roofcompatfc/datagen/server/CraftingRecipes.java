package com.thevortex.roofcompatfc.datagen.server;

import com.thevortex.roofcompatfc.RoofCompaTFC;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class CraftingRecipes extends RecipeProvider {
    public CraftingRecipes(DataGenerator provider) {
        super(provider);
    }
    private ShapedRecipeBuilder shaped(ItemLike provider, int count) {
        return ShapedRecipeBuilder.shaped(provider,count);
    }
    private ResourceLocation recipeDir(String typeIn) {
        return new ResourceLocation(RoofCompaTFC.MODID,typeIn);
    }
    final String hasCondition = "has_item_";

    private ShapedRecipeBuilder wooden_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern("gl ")
                .pattern("ls ")
                .pattern("   ")
                .define('g', TFCItems.GLUE.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/log/" + type )))
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy(hasCondition + type + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/log/" + type))));


    }
    private ShapedRecipeBuilder stripped_wooden_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern("gl ")
                .pattern("ls ")
                .pattern("   ")
                .define('g', TFCItems.GLUE.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/stripped_log/" + type )))
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy(hasCondition + "stripped_" + type + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/stripped_log/" + type))));

    }
    private ShapedRecipeBuilder stone_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern("gl ")
                .pattern("ls ")
                .pattern("   ")
                .define('g', TFCItems.MORTAR.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:rock/bricks/" + type )))
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy(hasCondition + type + "_brick", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:rock/bricks/" + type))));
    }

    private ShapedRecipeBuilder wooden_attic_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern("gl ")
                .pattern("ls ")
                .pattern("   ")
                .define('g', TFCItems.GLUE.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/log/" + type )))
                .define('s', Tags.Items.GLASS)
                .unlockedBy(hasCondition + type + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/log/" + type))));


    }
    private ShapedRecipeBuilder stripped_wooden_attic_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern("gl ")
                .pattern("ls ")
                .pattern("   ")
                .define('g', TFCItems.GLUE.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/stripped_log/" + type )))
                .define('s', Tags.Items.GLASS)
                .unlockedBy(hasCondition + "stripped_" + type + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/stripped_log/" + type))));

    }
    private ShapedRecipeBuilder stone_attic_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern("gl ")
                .pattern("ls ")
                .pattern("   ")
                .define('g', TFCItems.MORTAR.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:rock/bricks/" + type )))
                .define('s', Tags.Items.GLASS)
                .unlockedBy(hasCondition + type + "_brick", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:rock/bricks/" + type))));
    }

    private ShapedRecipeBuilder wooden_top_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern(" g ")
                .pattern("lsl")
                .pattern("   ")
                .define('g', TFCItems.GLUE.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/log/" + type )))
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy(hasCondition + type + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/log/" + type))));


    }
    private ShapedRecipeBuilder stripped_wooden_top_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern(" g ")
                .pattern("lsl")
                .pattern("   ")
                .define('g', TFCItems.GLUE.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/stripped_log/" + type )))
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy(hasCondition + "stripped_" + type + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/stripped_log/" + type))));

    }
    private ShapedRecipeBuilder stone_top_roof(String type, ItemLike provider, int count) {
        return shaped(provider,count)
                .pattern(" g ")
                .pattern("lsl")
                .pattern("   ")
                .define('g', TFCItems.MORTAR.get())
                .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:rock/bricks/" + type )))
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy(hasCondition + type + "_brick", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:rock/bricks/" + type))));
    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {



        String[] list_vanilla = {"acacia", "birch", "oak", "spruce"};
        String[] list_tree = {"ash", "aspen", "blackwood", "chestnut", "douglas_fir", "hickory", "kapok", "maple", "palm", "pine", "rosewood", "sequoia", "sycamore", "white_cedar", "willow"};
        String[] list_stone = {"andesite", "basalt", "chalk", "chert", "claystone", "conglomerate", "dacite", "diorite", "dolomite", "gabbro", "gneiss", "granite", "limestone", "marble", "phyllite", "quartzite", "rhyolite", "schist", "shale", "slate"};


        //base
        for(String stone: list_stone) {
            stone_roof(stone,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcw_tfc_roof", stone + "_roof")),2)
                    .save(consumer,recipeDir(stone + "_roof"));
        }
        for(String log: list_tree) {
                wooden_roof(log,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcw_tfc_roof", log + "_roof")),2)
                        .save(consumer,recipeDir(log + "_roof"));
                stripped_wooden_roof("stripped_"+log,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcw_tfc_roof" , "stripped_"+log+ "_roof")),2)
                        .save(consumer,recipeDir("stripped_"+log + "_roof"));
        }
        for(String log: list_vanilla) {
            wooden_roof(log,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwroofs" , log+"_roof")),2)
                    .save(consumer,recipeDir(log + "_roof"));
            stripped_wooden_roof("stripped_"+log,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwroofs" , log+"_planks_roof")),2)
                    .save(consumer,recipeDir(log + "_planks_roof"));
        }
        //attic
        for(String stone: list_stone) {
            stone_attic_roof(stone,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcw_tfc_roof",stone + "_attic_roof")),2)
                    .save(consumer,recipeDir(stone + "_attic_roof"));
        }
        for(String log: list_tree) {
            wooden_attic_roof(log,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcw_tfc_roof" , log + "_attic_roof")),2)
                    .save(consumer,recipeDir(log + "_attic_roof"));
            stripped_wooden_attic_roof("stripped_"+log,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcw_tfc_roof" , "stripped_"+log+ "_roof")),2)
                    .save(consumer,recipeDir("stripped_"+log + "_attic_roof"));
        }
        for(String log: list_vanilla) {
            wooden_attic_roof(log,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwroofs" , log + "_attic_roof")),2)
                    .save(consumer,recipeDir(log + "_attic_roof"));
            stripped_wooden_attic_roof("stripped_"+log,ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwroofs" , log+"_planks_roof")),2)
                    .save(consumer,recipeDir("stripped_"+log + "_attic_roof"));
        }


    }

}

