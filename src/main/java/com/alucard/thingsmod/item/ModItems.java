package com.alucard.thingsmod.item;

import com.alucard.thingsmod.ThingsMod;
import com.alucard.thingsmod.item.costum.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby",new Item(new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato",new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette",new Item(new FabricItemSettings()));
    public static final Item BRISADO = registerItem("brisado",new Item(new FabricItemSettings().food(ModFoodComponents.BRISADO)));
    public static final Item DETECTOR_DE_METAIS = registerItem("detector_de_metais",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(50)));

    public static final Item HIDROMEL = registerItem("hidromel",new Item(new FabricItemSettings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ThingsMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        ThingsMod.LOGGER.info("Registrando itens do Mod para " + ThingsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
