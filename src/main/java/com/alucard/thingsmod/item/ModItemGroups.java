package com.alucard.thingsmod.item;

import com.alucard.thingsmod.ThingsMod;
import com.alucard.thingsmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ThingsMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(()->new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.BRISADO);
                        entries.add(ModItems.HIDROMEL);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.COAL_BRIQUETTE);
                        entries.add(ModItems.DETECTOR_DE_METAIS);
                        entries.add(ModBlocks.SOUND_BLOCK);
                    }).build());
    public static void registerItemGroups(){
        ThingsMod.LOGGER.info("Registrando grupos de intens para " + ThingsMod.MOD_ID);
    }
}
