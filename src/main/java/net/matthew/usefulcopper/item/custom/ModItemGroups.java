package net.matthew.usefulcopper.item.custom;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.matthew.usefulcopper.UsefulCopper;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_MATERIALS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(UsefulCopper.MOD_ID, "usefulcopper_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.COPPER_SWORD))
                    .displayName(Text.translatable("itemgroup.usefulcopper.usefulcopper_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);

                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.COPPER_HORSE_ARMOR);
                    }).build());

    public static void registerItemGroups(){
        UsefulCopper.LOGGER.info("Registering Item Groups for "+ UsefulCopper.MOD_ID);
    }
}
