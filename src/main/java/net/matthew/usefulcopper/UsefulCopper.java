package net.matthew.usefulcopper;

import net.fabricmc.api.ModInitializer;

import net.matthew.usefulcopper.item.custom.ModItemGroups;
import net.matthew.usefulcopper.item.custom.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsefulCopper implements ModInitializer {
	public static final String MOD_ID = "usefulcopper";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}