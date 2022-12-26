package com.thevortex.roofcompatfc.datagen.server;

import com.thevortex.roofcompatfc.RoofCompaTFC;
import com.thevortex.roofcompatfc.block.ModRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.stream.Collectors;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, RoofCompaTFC.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for (Block knownBlock : getKnownBlocks()) {
            tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_AXE).add(knownBlock);
        }
    }

    protected Iterable<Block> getKnownBlocks() {
        return ModRegistry.BLOCKS_REGISTRY.getEntries()
                .stream().map(RegistryObject::get)
                .collect(Collectors.toList());
    }
}
