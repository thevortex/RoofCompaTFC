package com.thevortex.roofcompatfc.datagen.server;

import com.thevortex.roofcompatfc.RoofCompaTFC;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, RoofCompaTFC.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {

    }

}
