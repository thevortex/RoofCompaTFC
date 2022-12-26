package com.thevortex.roofcompatfc.datagen.client;

import com.thevortex.roofcompatfc.RoofCompaTFC;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangEntries extends LanguageProvider {

    public LangEntries(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }
    public static final String[] list_rooftype = { "Roof", "Attic Roof", "Top Roof", "Lower Roof", "Steep Roof", "Upper Lower Roof", "Upper Steep Roof" };

    public static final String[] list_wood = { "Ash", "Aspen", "Blackwood", "Chestnut", "Douglas Fir", "Hickory", "Kapok", "Maple", "Palm", "Pine", "Rosewood", "Sequoia", "Sycamore", "White Cedar", "Willow" };

    public static final String[] list_stone = { "Andesite", "Basalt", "Chalk", "Chert", "Claystone", "Conglomerate", "Dacite", "Diorite", "Dolomite", "Gabbro", "Gneiss", "Granite", "Limestone", "Marble", "Phyllite", "Quartzite", "Rhyolite", "Schist", "Shale", "Slate" };

    @Override
    protected void addTranslations() {

        for (String log: list_wood) {
            for (String rooftype : list_rooftype) {
                add("block." + RoofCompaTFC.MODID + "." + log.toLowerCase().replace(" ","_")+ "_" + rooftype.toLowerCase().replace(" ","_") , log + " " + rooftype);
                add("block." + RoofCompaTFC.MODID + ".stripped_" + log.toLowerCase().replace(" ","_") + "_" + rooftype.toLowerCase().replace(" ","_") , "Stripped " + log + " " + rooftype);
                add("item." + RoofCompaTFC.MODID + "." + log.toLowerCase().replace(" ","_") + "_" + rooftype.toLowerCase().replace(" ","_") , log + " " + rooftype);
                add("item." + RoofCompaTFC.MODID + ".stripped_" + log.toLowerCase().replace(" ","_") + "_" + rooftype.toLowerCase().replace(" ","_") , "Stripped " + log + " " + rooftype);
            }
        }
        for (String stone: list_stone) {
            for (String rooftype : list_rooftype) {
                add("block." + RoofCompaTFC.MODID + "." + stone.toLowerCase().replace(" ","_")+ "_" + rooftype.toLowerCase().replace(" ","_") , stone + " " + rooftype);
                add("item." + RoofCompaTFC.MODID + "." + stone.toLowerCase().replace(" ","_") + "_" + rooftype.toLowerCase().replace(" ","_") , stone + " " + rooftype);
            }
        }
    }
}
