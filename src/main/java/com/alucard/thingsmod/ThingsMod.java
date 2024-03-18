package com.alucard.thingsmod;

import com.alucard.thingsmod.block.ModBlocks;
import com.alucard.thingsmod.item.ModItemGroups;
import com.alucard.thingsmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThingsMod implements ModInitializer {
	public static final String MOD_ID = "thingsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE,100);

	}
}