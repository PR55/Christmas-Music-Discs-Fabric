package com.pr55.xmasmd;

import com.pr55.xmasmd.item.ModItemGroups;
import com.pr55.xmasmd.item.ModItems;
import com.pr55.xmasmd.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChristmasMusicDiscsFabric implements ModInitializer {
	public static final String MOD_ID = "xmas-md";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModSounds.registerSounds();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
