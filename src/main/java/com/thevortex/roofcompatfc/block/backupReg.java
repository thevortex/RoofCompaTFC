package com.thevortex.roofcompatfc.block;


import com.mcwroofs.kikoz.objects.roofs.Lower;
import com.mcwroofs.kikoz.objects.roofs.RoofGlass;
import com.mcwroofs.kikoz.objects.roofs.RoofTopNew;
import com.mcwroofs.kikoz.objects.roofs.Steep;
import com.thevortex.roofcompatfc.RoofCompaTFC;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class backupReg {

    public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RoofCompaTFC.MODID);
    public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RoofCompaTFC.MODID);

    public static final List<RegistryObject<Block>> roof_suite = createList();

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(RoofCompaTFC.TAB_GROUP)));
        return block;
    }

    public static final String[] list_rooftype = {"Roof", "Attic Roof", "Top Roof", "Lower Roof", "Steep Roof", "Upper Lower Roof", "Upper Steep Roof"};

    public static final String[] list_wood = {"Ash", "Aspen", "Blackwood", "Chestnut", "Douglas Fir", "Hickory", "Kapok", "Maple", "Palm", "Pine", "Rosewood", "Sequoia", "Sycamore", "White Cedar", "Willow"};

    public static final String[] list_stone = {"Andesite", "Basalt", "Chalk", "Chert", "Claystone", "Conglomerate", "Dacite", "Diorite", "Dolomite", "Gabbro", "Gneiss", "Granite", "Limestone", "Marble", "Phyllite", "Quartzite", "Rhyolite", "Schist", "Shale", "Slate"};

    public static List<RegistryObject<Block>> createList() {
        Block template_wood_roof = new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD));
        Block template_wood_attic_roof = new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD));
        Block template_wood_top_roof = new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD));
        Block template_wood_lower_roof = new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD));
        Block template_wood_steep_roof = new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD));
        Block template_wood_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD));
        Block template_wood_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD));

        Block template_stone_roof = new StairBlock(Blocks.STONE.defaultBlockState(), Block.Properties.of(Material.STONE).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.STONE));
        Block template_stone_attic_roof = new RoofGlass(Block.Properties.of(Material.STONE).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.STONE));
        Block template_stone_top_roof = new RoofTopNew(Block.Properties.of(Material.STONE).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.STONE));
        Block template_stone_lower_roof = new StairBlock(Blocks.STONE.defaultBlockState(), Block.Properties.of(Material.STONE).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.STONE));
        Block template_stone_steep_roof = new StairBlock(Blocks.STONE.defaultBlockState(), Block.Properties.of(Material.STONE).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.STONE));
        Block template_stone_upper_lower_roof = new Lower(Blocks.STONE.defaultBlockState(), Block.Properties.of(Material.STONE).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.STONE));
        Block template_stone_upper_steep_roof = new Steep(Blocks.STONE.defaultBlockState(), Block.Properties.of(Material.STONE).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.STONE));


        List<Block> templates = new ArrayList<>();
        List<Block> templatestone = new ArrayList<>();

        templates.add(template_wood_roof);
        templates.add(template_wood_attic_roof);
        templates.add(template_wood_top_roof);
        templates.add(template_wood_lower_roof);
        templates.add(template_wood_steep_roof);
        templates.add(template_wood_upper_lower_roof);
        templates.add(template_wood_upper_steep_roof);
        templatestone.add(template_stone_roof);
        templatestone.add(template_stone_attic_roof);
        templatestone.add(template_stone_top_roof);
        templatestone.add(template_stone_lower_roof);
        templatestone.add(template_stone_steep_roof);
        templatestone.add(template_stone_upper_lower_roof);
        templatestone.add(template_stone_upper_steep_roof);

        List<RegistryObject<Block>> temp = new ArrayList<>();

        for (String stone : list_stone) {
            for (String rooftype : list_rooftype) {
                for (Block template : templatestone) {
                    String reg_name = stone.toLowerCase() + "_" + rooftype.toLowerCase().replace(" ", "_");
                    RegistryObject<Block> block = BLOCKS_REGISTRY.register(reg_name, () -> template);
                    ITEMS_REGISTRY.register(reg_name, () -> new BlockItem(block.get(), new Item.Properties().tab(RoofCompaTFC.TAB_GROUP)));
                    temp.add(block);
                }
            }
        }
        for (String wood : list_wood) {
            for (String rooftype : list_rooftype) {
                for (Block template : templates) {
                    String reg_name = wood.toLowerCase() + "_" + rooftype.toLowerCase().replace(" ", "_");
                    RegistryObject<Block> block = BLOCKS_REGISTRY.register(reg_name, () -> template);
                    ITEMS_REGISTRY.register(reg_name, () -> new BlockItem(block.get(), new Item.Properties().tab(RoofCompaTFC.TAB_GROUP)));
                    temp.add(block);
                    reg_name = "stripped_" + wood.toLowerCase() + "_" + rooftype.toLowerCase().replace(" ", "_");
                    RegistryObject<Block> stripped_block = BLOCKS_REGISTRY.register(reg_name, () -> template);
                    ITEMS_REGISTRY.register("stripped_" + reg_name, () -> new BlockItem(stripped_block.get(), new Item.Properties().tab(RoofCompaTFC.TAB_GROUP)));
                    temp.add(stripped_block);
                }
            }
        }
        return temp;
    }
}
