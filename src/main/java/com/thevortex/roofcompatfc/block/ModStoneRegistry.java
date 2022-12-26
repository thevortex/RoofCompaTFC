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

import java.util.function.Supplier;

public class ModStoneRegistry {

    public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RoofCompaTFC.MODID);
    public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RoofCompaTFC.MODID);

    
    public static final RegistryObject<Block> andesite_roof = createBlock("andesite_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> andesite_attic_roof = createBlock("andesite_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> andesite_top_roof = createBlock("andesite_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> andesite_lower_roof = createBlock("andesite_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> andesite_steep_roof = createBlock("andesite_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> andesite_upper_lower_roof = createBlock("andesite_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> andesite_upper_steep_roof = createBlock("andesite_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> basalt_roof = createBlock("basalt_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> basalt_attic_roof = createBlock("basalt_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> basalt_top_roof = createBlock("basalt_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> basalt_lower_roof = createBlock("basalt_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> basalt_steep_roof = createBlock("basalt_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> basalt_upper_lower_roof = createBlock("basalt_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> basalt_upper_steep_roof = createBlock("basalt_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> chalk_roof = createBlock("chalk_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chalk_attic_roof = createBlock("chalk_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chalk_top_roof = createBlock("chalk_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chalk_lower_roof = createBlock("chalk_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chalk_steep_roof = createBlock("chalk_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chalk_upper_lower_roof = createBlock("chalk_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chalk_upper_steep_roof = createBlock("chalk_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> chert_roof = createBlock("chert_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chert_attic_roof = createBlock("chert_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chert_top_roof = createBlock("chert_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chert_lower_roof = createBlock("chert_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chert_steep_roof = createBlock("chert_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chert_upper_lower_roof = createBlock("chert_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chert_upper_steep_roof = createBlock("chert_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> claystone_roof = createBlock("claystone_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> claystone_attic_roof = createBlock("claystone_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> claystone_top_roof = createBlock("claystone_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> claystone_lower_roof = createBlock("claystone_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> claystone_steep_roof = createBlock("claystone_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> claystone_upper_lower_roof = createBlock("claystone_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> claystone_upper_steep_roof = createBlock("claystone_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> conglomerate_roof = createBlock("conglomerate_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> conglomerate_attic_roof = createBlock("conglomerate_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> conglomerate_top_roof = createBlock("conglomerate_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> conglomerate_lower_roof = createBlock("conglomerate_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> conglomerate_steep_roof = createBlock("conglomerate_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> conglomerate_upper_lower_roof = createBlock("conglomerate_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> conglomerate_upper_steep_roof = createBlock("conglomerate_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> dacite_roof = createBlock("dacite_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dacite_attic_roof = createBlock("dacite_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dacite_top_roof = createBlock("dacite_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dacite_lower_roof = createBlock("dacite_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dacite_steep_roof = createBlock("dacite_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dacite_upper_lower_roof = createBlock("dacite_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dacite_upper_steep_roof = createBlock("dacite_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> diorite_roof = createBlock("diorite_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> diorite_attic_roof = createBlock("diorite_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> diorite_top_roof = createBlock("diorite_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> diorite_lower_roof = createBlock("diorite_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> diorite_steep_roof = createBlock("diorite_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> diorite_upper_lower_roof = createBlock("diorite_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> diorite_upper_steep_roof = createBlock("diorite_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> dolomite_roof = createBlock("dolomite_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dolomite_attic_roof = createBlock("dolomite_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dolomite_top_roof = createBlock("dolomite_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dolomite_lower_roof = createBlock("dolomite_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dolomite_steep_roof = createBlock("dolomite_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dolomite_upper_lower_roof = createBlock("dolomite_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dolomite_upper_steep_roof = createBlock("dolomite_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> gabbro_roof = createBlock("gabbro_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gabbro_attic_roof = createBlock("gabbro_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gabbro_top_roof = createBlock("gabbro_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gabbro_lower_roof = createBlock("gabbro_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gabbro_steep_roof = createBlock("gabbro_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gabbro_upper_lower_roof = createBlock("gabbro_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gabbro_upper_steep_roof = createBlock("gabbro_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> gneiss_roof = createBlock("gneiss_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gneiss_attic_roof = createBlock("gneiss_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gneiss_top_roof = createBlock("gneiss_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gneiss_lower_roof = createBlock("gneiss_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gneiss_steep_roof = createBlock("gneiss_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gneiss_upper_lower_roof = createBlock("gneiss_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> gneiss_upper_steep_roof = createBlock("gneiss_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> granite_roof = createBlock("granite_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> granite_attic_roof = createBlock("granite_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> granite_top_roof = createBlock("granite_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> granite_lower_roof = createBlock("granite_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> granite_steep_roof = createBlock("granite_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> granite_upper_lower_roof = createBlock("granite_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> granite_upper_steep_roof = createBlock("granite_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> limestone_roof = createBlock("limestone_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> limestone_attic_roof = createBlock("limestone_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> limestone_top_roof = createBlock("limestone_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> limestone_lower_roof = createBlock("limestone_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> limestone_steep_roof = createBlock("limestone_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> limestone_upper_lower_roof = createBlock("limestone_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> limestone_upper_steep_roof = createBlock("limestone_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> marble_roof = createBlock("marble_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> marble_attic_roof = createBlock("marble_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> marble_top_roof = createBlock("marble_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> marble_lower_roof = createBlock("marble_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> marble_steep_roof = createBlock("marble_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> marble_upper_lower_roof = createBlock("marble_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> marble_upper_steep_roof = createBlock("marble_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> phyllite_roof = createBlock("phyllite_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> phyllite_attic_roof = createBlock("phyllite_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> phyllite_top_roof = createBlock("phyllite_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> phyllite_lower_roof = createBlock("phyllite_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> phyllite_steep_roof = createBlock("phyllite_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> phyllite_upper_lower_roof = createBlock("phyllite_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> phyllite_upper_steep_roof = createBlock("phyllite_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> quartzite_roof = createBlock("quartzite_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> quartzite_attic_roof = createBlock("quartzite_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> quartzite_top_roof = createBlock("quartzite_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> quartzite_lower_roof = createBlock("quartzite_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> quartzite_steep_roof = createBlock("quartzite_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> quartzite_upper_lower_roof = createBlock("quartzite_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> quartzite_upper_steep_roof = createBlock("quartzite_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> rhyolite_roof = createBlock("rhyolite_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rhyolite_attic_roof = createBlock("rhyolite_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rhyolite_top_roof = createBlock("rhyolite_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rhyolite_lower_roof = createBlock("rhyolite_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rhyolite_steep_roof = createBlock("rhyolite_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rhyolite_upper_lower_roof = createBlock("rhyolite_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rhyolite_upper_steep_roof = createBlock("rhyolite_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> schist_roof = createBlock("schist_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> schist_attic_roof = createBlock("schist_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> schist_top_roof = createBlock("schist_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> schist_lower_roof = createBlock("schist_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> schist_steep_roof = createBlock("schist_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> schist_upper_lower_roof = createBlock("schist_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> schist_upper_steep_roof = createBlock("schist_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> shale_roof = createBlock("shale_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> shale_attic_roof = createBlock("shale_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> shale_top_roof = createBlock("shale_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> shale_lower_roof = createBlock("shale_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> shale_steep_roof = createBlock("shale_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> shale_upper_lower_roof = createBlock("shale_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> shale_upper_steep_roof = createBlock("shale_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> slate_roof = createBlock("slate_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> slate_attic_roof = createBlock("slate_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> slate_top_roof = createBlock("slate_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> slate_lower_roof = createBlock("slate_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> slate_steep_roof = createBlock("slate_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> slate_upper_lower_roof = createBlock("slate_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> slate_upper_steep_roof = createBlock("slate_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(RoofCompaTFC.TAB_GROUP)));
        return block;
    }
}
