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

public class ModRegistry {

    public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RoofCompaTFC.MODID);
    public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RoofCompaTFC.MODID);


    public static final RegistryObject<Block> ash_roof = createBlock("ash_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ash_attic_roof = createBlock("ash_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ash_top_roof = createBlock("ash_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ash_lower_roof = createBlock("ash_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ash_steep_roof = createBlock("ash_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ash_upper_lower_roof = createBlock("ash_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ash_upper_steep_roof = createBlock("ash_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> aspen_roof = createBlock("aspen_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> aspen_attic_roof = createBlock("aspen_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> aspen_top_roof = createBlock("aspen_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> aspen_lower_roof = createBlock("aspen_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> aspen_steep_roof = createBlock("aspen_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> aspen_upper_lower_roof = createBlock("aspen_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> aspen_upper_steep_roof = createBlock("aspen_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> blackwood_roof = createBlock("blackwood_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blackwood_attic_roof = createBlock("blackwood_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blackwood_top_roof = createBlock("blackwood_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blackwood_lower_roof = createBlock("blackwood_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blackwood_steep_roof = createBlock("blackwood_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blackwood_upper_lower_roof = createBlock("blackwood_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blackwood_upper_steep_roof = createBlock("blackwood_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> chestnut_roof = createBlock("chestnut_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chestnut_attic_roof = createBlock("chestnut_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chestnut_top_roof = createBlock("chestnut_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chestnut_lower_roof = createBlock("chestnut_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chestnut_steep_roof = createBlock("chestnut_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chestnut_upper_lower_roof = createBlock("chestnut_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> chestnut_upper_steep_roof = createBlock("chestnut_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> douglas_fir_roof = createBlock("douglas_fir_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> douglas_fir_attic_roof = createBlock("douglas_fir_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> douglas_fir_top_roof = createBlock("douglas_fir_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> douglas_fir_lower_roof = createBlock("douglas_fir_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> douglas_fir_steep_roof = createBlock("douglas_fir_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> douglas_fir_upper_lower_roof = createBlock("douglas_fir_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> douglas_fir_upper_steep_roof = createBlock("douglas_fir_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> hickory_roof = createBlock("hickory_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hickory_attic_roof = createBlock("hickory_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hickory_top_roof = createBlock("hickory_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hickory_lower_roof = createBlock("hickory_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hickory_steep_roof = createBlock("hickory_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hickory_upper_lower_roof = createBlock("hickory_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hickory_upper_steep_roof = createBlock("hickory_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> kapok_roof = createBlock("kapok_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> kapok_attic_roof = createBlock("kapok_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> kapok_top_roof = createBlock("kapok_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> kapok_lower_roof = createBlock("kapok_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> kapok_steep_roof = createBlock("kapok_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> kapok_upper_lower_roof = createBlock("kapok_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> kapok_upper_steep_roof = createBlock("kapok_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> maple_roof = createBlock("maple_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_attic_roof = createBlock("maple_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_top_roof = createBlock("maple_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_lower_roof = createBlock("maple_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_steep_roof = createBlock("maple_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_upper_lower_roof = createBlock("maple_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_upper_steep_roof = createBlock("maple_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> palm_roof = createBlock("palm_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_attic_roof = createBlock("palm_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_top_roof = createBlock("palm_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_lower_roof = createBlock("palm_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_steep_roof = createBlock("palm_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_upper_lower_roof = createBlock("palm_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_upper_steep_roof = createBlock("palm_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> pine_roof = createBlock("pine_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_attic_roof = createBlock("pine_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_top_roof = createBlock("pine_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_lower_roof = createBlock("pine_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_steep_roof = createBlock("pine_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_upper_lower_roof = createBlock("pine_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_upper_steep_roof = createBlock("pine_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> rosewood_roof = createBlock("rosewood_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rosewood_attic_roof = createBlock("rosewood_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rosewood_top_roof = createBlock("rosewood_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rosewood_lower_roof = createBlock("rosewood_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rosewood_steep_roof = createBlock("rosewood_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rosewood_upper_lower_roof = createBlock("rosewood_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rosewood_upper_steep_roof = createBlock("rosewood_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> sequoia_roof = createBlock("sequoia_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sequoia_attic_roof = createBlock("sequoia_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sequoia_top_roof = createBlock("sequoia_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sequoia_lower_roof = createBlock("sequoia_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sequoia_steep_roof = createBlock("sequoia_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sequoia_upper_lower_roof = createBlock("sequoia_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sequoia_upper_steep_roof = createBlock("sequoia_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> sycamore_roof = createBlock("sycamore_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sycamore_attic_roof = createBlock("sycamore_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sycamore_top_roof = createBlock("sycamore_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sycamore_lower_roof = createBlock("sycamore_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sycamore_steep_roof = createBlock("sycamore_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sycamore_upper_lower_roof = createBlock("sycamore_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sycamore_upper_steep_roof = createBlock("sycamore_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> white_cedar_roof = createBlock("white_cedar_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> white_cedar_attic_roof = createBlock("white_cedar_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> white_cedar_top_roof = createBlock("white_cedar_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> white_cedar_lower_roof = createBlock("white_cedar_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> white_cedar_steep_roof = createBlock("white_cedar_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> white_cedar_upper_lower_roof = createBlock("white_cedar_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> white_cedar_upper_steep_roof = createBlock("white_cedar_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));


    public static final RegistryObject<Block> willow_roof = createBlock("willow_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_attic_roof = createBlock("willow_attic_roof", () -> new RoofGlass(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_top_roof = createBlock("willow_top_roof", () -> new RoofTopNew(Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_lower_roof = createBlock("willow_lower_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_steep_roof = createBlock("willow_steep_roof", () -> new BaseRoof(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_upper_lower_roof = createBlock("willow_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_upper_steep_roof = createBlock("willow_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(RoofCompaTFC.TAB_GROUP)));
        return block;
    }
}
