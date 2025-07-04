package net.matthew.usefulcopper;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.matthew.usefulcopper.datagen.ModItemTagProvider;
import net.matthew.usefulcopper.datagen.ModModelProvider;
import net.matthew.usefulcopper.datagen.ModRecipeProvider;

public class UsefulCopperDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack  = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
