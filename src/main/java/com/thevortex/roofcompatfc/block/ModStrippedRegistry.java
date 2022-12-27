package com.thevortex.roofcompatfc.block;

import com.mcwroofs.kikoz.objects.roofs.*;
import com.thevortex.roofcompatfc.RoofCompaTFC;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModStrippedRegistry {

        public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RoofCompaTFC.MODID);
        public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RoofCompaTFC.MODID);

        public static final RegistryObject<Block> stripped_ash_roof = createBlock("stripped_ash_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_ash_attic_roof = createBlock("stripped_ash_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_ash_top_roof = createBlock("stripped_ash_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_ash_lower_roof = createBlock("stripped_ash_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_ash_steep_roof = createBlock("stripped_ash_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_ash_upper_lower_roof = createBlock("stripped_ash_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_ash_upper_steep_roof = createBlock("stripped_ash_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_aspen_roof = createBlock("stripped_aspen_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_aspen_attic_roof = createBlock("stripped_aspen_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_aspen_top_roof = createBlock("stripped_aspen_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_aspen_lower_roof = createBlock("stripped_aspen_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_aspen_steep_roof = createBlock("stripped_aspen_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_aspen_upper_lower_roof = createBlock("stripped_aspen_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_aspen_upper_steep_roof = createBlock("stripped_aspen_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_blackwood_roof = createBlock("stripped_blackwood_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_blackwood_attic_roof = createBlock("stripped_blackwood_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_blackwood_top_roof = createBlock("stripped_blackwood_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_blackwood_lower_roof = createBlock("stripped_blackwood_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_blackwood_steep_roof = createBlock("stripped_blackwood_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_blackwood_upper_lower_roof = createBlock("stripped_blackwood_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_blackwood_upper_steep_roof = createBlock("stripped_blackwood_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_chestnut_roof = createBlock("stripped_chestnut_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_chestnut_attic_roof = createBlock("stripped_chestnut_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_chestnut_top_roof = createBlock("stripped_chestnut_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_chestnut_lower_roof = createBlock("stripped_chestnut_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_chestnut_steep_roof = createBlock("stripped_chestnut_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_chestnut_upper_lower_roof = createBlock("stripped_chestnut_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_chestnut_upper_steep_roof = createBlock("stripped_chestnut_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_douglas_fir_roof = createBlock("stripped_douglas_fir_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_douglas_fir_attic_roof = createBlock("stripped_douglas_fir_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_douglas_fir_top_roof = createBlock("stripped_douglas_fir_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_douglas_fir_lower_roof = createBlock("stripped_douglas_fir_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_douglas_fir_steep_roof = createBlock("stripped_douglas_fir_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_douglas_fir_upper_lower_roof = createBlock("stripped_douglas_fir_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_douglas_fir_upper_steep_roof = createBlock("stripped_douglas_fir_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_hickory_roof = createBlock("stripped_hickory_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_hickory_attic_roof = createBlock("stripped_hickory_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_hickory_top_roof = createBlock("stripped_hickory_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_hickory_lower_roof = createBlock("stripped_hickory_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_hickory_steep_roof = createBlock("stripped_hickory_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_hickory_upper_lower_roof = createBlock("stripped_hickory_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_hickory_upper_steep_roof = createBlock("stripped_hickory_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_kapok_roof = createBlock("stripped_kapok_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_kapok_attic_roof = createBlock("stripped_kapok_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_kapok_top_roof = createBlock("stripped_kapok_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_kapok_lower_roof = createBlock("stripped_kapok_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_kapok_steep_roof = createBlock("stripped_kapok_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_kapok_upper_lower_roof = createBlock("stripped_kapok_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_kapok_upper_steep_roof = createBlock("stripped_kapok_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_maple_roof = createBlock("stripped_maple_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_maple_attic_roof = createBlock("stripped_maple_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_maple_top_roof = createBlock("stripped_maple_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_maple_lower_roof = createBlock("stripped_maple_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_maple_steep_roof = createBlock("stripped_maple_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_maple_upper_lower_roof = createBlock("stripped_maple_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_maple_upper_steep_roof = createBlock("stripped_maple_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_palm_roof = createBlock("stripped_palm_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_palm_attic_roof = createBlock("stripped_palm_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_palm_top_roof = createBlock("stripped_palm_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_palm_lower_roof = createBlock("stripped_palm_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_palm_steep_roof = createBlock("stripped_palm_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_palm_upper_lower_roof = createBlock("stripped_palm_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_palm_upper_steep_roof = createBlock("stripped_palm_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_pine_roof = createBlock("stripped_pine_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_pine_attic_roof = createBlock("stripped_pine_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_pine_top_roof = createBlock("stripped_pine_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_pine_lower_roof = createBlock("stripped_pine_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_pine_steep_roof = createBlock("stripped_pine_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_pine_upper_lower_roof = createBlock("stripped_pine_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_pine_upper_steep_roof = createBlock("stripped_pine_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_rosewood_roof = createBlock("stripped_rosewood_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_rosewood_attic_roof = createBlock("stripped_rosewood_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_rosewood_top_roof = createBlock("stripped_rosewood_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_rosewood_lower_roof = createBlock("stripped_rosewood_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_rosewood_steep_roof = createBlock("stripped_rosewood_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_rosewood_upper_lower_roof = createBlock("stripped_rosewood_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_rosewood_upper_steep_roof = createBlock("stripped_rosewood_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_sequoia_roof = createBlock("stripped_sequoia_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sequoia_attic_roof = createBlock("stripped_sequoia_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sequoia_top_roof = createBlock("stripped_sequoia_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sequoia_lower_roof = createBlock("stripped_sequoia_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sequoia_steep_roof = createBlock("stripped_sequoia_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sequoia_upper_lower_roof = createBlock("stripped_sequoia_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sequoia_upper_steep_roof = createBlock("stripped_sequoia_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_sycamore_roof = createBlock("stripped_sycamore_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sycamore_attic_roof = createBlock("stripped_sycamore_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sycamore_top_roof = createBlock("stripped_sycamore_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sycamore_lower_roof = createBlock("stripped_sycamore_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sycamore_steep_roof = createBlock("stripped_sycamore_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sycamore_upper_lower_roof = createBlock("stripped_sycamore_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_sycamore_upper_steep_roof = createBlock("stripped_sycamore_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_white_cedar_roof = createBlock("stripped_white_cedar_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_white_cedar_attic_roof = createBlock("stripped_white_cedar_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_white_cedar_top_roof = createBlock("stripped_white_cedar_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_white_cedar_lower_roof = createBlock("stripped_white_cedar_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_white_cedar_steep_roof = createBlock("stripped_white_cedar_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_white_cedar_upper_lower_roof = createBlock("stripped_white_cedar_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_white_cedar_upper_steep_roof = createBlock("stripped_white_cedar_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


        public static final RegistryObject<Block> stripped_willow_roof = createBlock("stripped_willow_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_willow_attic_roof = createBlock("stripped_willow_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_willow_top_roof = createBlock("stripped_willow_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_willow_lower_roof = createBlock("stripped_willow_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_willow_steep_roof = createBlock("stripped_willow_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_willow_upper_lower_roof = createBlock("stripped_willow_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
        public static final RegistryObject<Block> stripped_willow_upper_steep_roof = createBlock("stripped_willow_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

        public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
        {
            RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
            ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(RoofCompaTFC.TAB_GROUP)));
            return block;
        }
}
