package net.cobaltcore.item;

import net.cobaltcore.CobaltCore;
import net.minecraft.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.threetag.palladium.Palladium;
import net.threetag.palladium.block.PalladiumBlocks;
import net.threetag.palladium.item.PalladiumItems;
import net.threetag.palladium.tags.PalladiumItemTags;
import net.threetag.palladiumcore.registry.CreativeModeTabRegistry;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.threetag.palladiumcore.registry.RegistrySupplier;

import java.util.EnumMap;

public class CobaltCoreItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CobaltCore.MOD_ID, Registries.ITEM);

    // ---------------------------------------------------------------------------------------------------------

    public static final RegistrySupplier<Item> COMET_STONE = ITEMS.register("comet_stone", () -> new BlockItem(PalladiumBlocks.COMET_STONE.get(), new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistrySupplier<Item> COBBLED_COMET_STONE = ITEMS.register("cobbled_comet_stone", () -> new BlockItem(PalladiumBlocks.COBBLED_COMET_STONE.get(), new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistrySupplier<Item> STEEL_ORE = ITEMS.register("steel_ore", () -> new BlockItem(PalladiumBlocks.STEEL_ORE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> DEEPSLATE_STEEL_ORE = ITEMS.register("deepslate_steel_ore", () -> new BlockItem(PalladiumBlocks.DEEPSLATE_STEEL_ORE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(PalladiumBlocks.STEEL_BLOCK.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> RAW_STEEL_BLOCK = ITEMS.register("raw_steel_block", () -> new BlockItem(PalladiumBlocks.RAW_STEEL_BLOCK.get(), new Item.Properties()));

    public static final RegistrySupplier<Item> COBALT_ORE = ITEMS.register("cobalt_ore", () -> new BlockItem(PalladiumBlocks.COBALT_ORE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> DEEPSLATE_COBALT_ORE = ITEMS.register("deepslate_cobalt_ore", () -> new BlockItem(PalladiumBlocks.DEEPSLATE_COBALT_ORE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> COMET_COBALT_ORE = ITEMS.register("comet_cobalt_ore", () -> new BlockItem(PalladiumBlocks.COMET_COBALT_ORE.get(), new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistrySupplier<Item> COBALT_BLOCK = ITEMS.register("cobalt_block", () -> new BlockItem(PalladiumBlocks.COBALT_BLOCK.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> RAW_COBALT_BLOCK = ITEMS.register("raw_cobalt_block", () -> new BlockItem(PalladiumBlocks.RAW_COBALT_BLOCK.get(), new Item.Properties()));
    
    public static final RegistrySupplier<Item> COBALT_STEEL_BLOCK = ITEMS.register("cobalt_steel_block", () -> new BlockItem(PalladiumBlocks.COBALT_STEEL_BLOCK.get(), new Item.Properties()));

    public static final RegistrySupplier<Item> ROBRIENTINE_ORE = ITEMS.register("robrientine_ore", () -> new BlockItem(PalladiumBlocks.ROBRIENTINE_ORE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> DEEPSLATE_ROBRIENTINE_ORE = ITEMS.register("deepslate_robrientine_ore", () -> new BlockItem(PalladiumBlocks.DEEPSLATE_ROBRIENTINE_ORE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> COMET_ROBRIENTINE_ORE = ITEMS.register("comet_robrientine_ore", () -> new BlockItem(PalladiumBlocks.COMET_ROBRIENTINE_ORE.get(), new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistrySupplier<Item> ROBRIENTINE_BLOCK = ITEMS.register("robrientine_block", () -> new BlockItem(PalladiumBlocks.ROBRIENTINE_BLOCK.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> RAW_ROBRIENTINE_BLOCK = ITEMS.register("raw_robrientine_block", () -> new BlockItem(PalladiumBlocks.RAW_ROBRIENTINE_BLOCK.get(), new Item.Properties()));

    // ----------------------------------------------------------------------------------------------------------

    public static final RegistrySupplier<Item> RAW_STEEL = ITEMS.register("raw_steel", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> RAW_COBALT = ITEMS.register("raw_cobalt", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> COBALT_STEEL_ALLOY = ITEMS.register("cobalt_steel_alloy", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> RAW_ROBRIENTINE = ITEMS.register("raw_robrientine", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> ROBRIENTINE_INGOT = ITEMS.register("robrientine_ingot", () -> new Item(new Item.Properties()));

    public static void init() {
        CreativeModeTabRegistry.addToTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.INGREDIENTS), entries -> {
            entries.addAfter(PalladiumItems.LEAD_INGOT, RAW_STEEL.get(), STEEL_INGOT.get(), RAW_COBALT.get(), COBALT_INGOT.get(), COBALT_STEEL_ALLOY.get(), RAW_ROBRIENTINE.get(), ROBRIENTINE_INGOT.get());
        });

        CreativeModeTabRegistry.addToTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS), entries -> {
            entries.addAfter(Items.IRON_BLOCK, STEEL_BLOCK.get(), COBALT_BLOCK.get());
            entries.addAfter(Items.DIAMOND_BLOCK, ROBRIENTINE_BLOCK.get());
            entries.addAfter(Items.REINFORCED_DEEPSLATE, COMET_STONE.get(), COBBLED_COMET_STONE.get());
        });

        CreativeModeTabRegistry.addToTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.NATURAL_BLOCKS), entries -> {
            entries.addAfter(Items.DEEPSLATE_IRON_ORE, STEEL_ORE.get(), DEEPSLATE_STEEL_ORE.get(), COBALT_ORE.get(), DEEPSLATE_COBALT_ORE.get(), COMET_COBALT_ORE.get());
            entries.addAfter(Items.DEEPSLATE_DIAMOND_ORE, ROBRIENTINE_ORE.get(), DEEPSLATE_ROBRIENTINE_ORE.get(), COMET_ROBRIENTINE_ORE.get());
            entries.addAfter(PalladiumItems.RAW_LEAD_BLOCK, RAW_STEEL_BLOCK.get(), RAW_COBALT_BLOCK.get(), RAW_ROBREINTINE_BLOCK.get());
            entries.addAfter(Items.DEEPSLATE, COMET_STONE.get());
        });
    }
}