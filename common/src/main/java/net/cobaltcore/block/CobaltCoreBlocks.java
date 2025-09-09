package net.cobaltcore.block;

import net.cobaltcore.CobaltCore;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.threetag.palladium.Palladium;
import net.threetag.palladium.util.PalladiumBlockUtil;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.threetag.palladiumcore.registry.RegistrySupplier;

public class CobaltCoreBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(CobaltCore.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> COMET_STONE = BLOCKS.register("comet_stone", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).requiresCorrectToolForDrops().strength(5.0F, 16.0F.sound(SoundType.DEEPSLATE))));
    public static final RegistrySupplier<Block> COBBLED_COMET_STONE = BLOCKS.register("cobbled_comet_stone", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).requiresCorrectToolForDrops().strength(5.0F, 16.0F.sound(SoundType.DEEPSLATE))));

    public static final RegistrySupplier<Block> STEEL_ORE = BLOCKS.register("steel_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistrySupplier<Block> DEEPSLATE_STEEL_ORE = BLOCKS.register("deepslate_steel_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(STEEL_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistrySupplier<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().sound(SoundType.METAL).strength(4.0F, 24.0F)));
    public static final RegistrySupplier<Block> RAW_STEEL_BLOCK = BLOCKS.register("raw_steel_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().sound(SoundType.METAL).strength(3.5F, 12.0F)));

    public static final RegistrySupplier<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(5.0F, 3.0F)));
    public static final RegistrySupplier<Block> DEEPSLATE_COBALT_ORE = BLOCKS.register("deepslate_cobalt_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(COBALT_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(6.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistrySupplier<Block> COMET_COBALT_ORE = BLOCKS.register("comet_cobalt_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(COBALT_ORE.get()).mapColor(MapColor.COLOR_PURPLE).strength(8.0F, 16.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistrySupplier<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).requiresCorrectToolForDrops().sound(SoundType.METAL).strength(6.0F, 12.0F)));
    public static final RegistrySupplier<Block> RAW_COBALT_BLOCK = BLOCKS.register("raw_cobalt_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).requiresCorrectToolForDrops().sound(SoundType.METAL).strength(5.5F, 6.0F)));
    
    public static final RegistrySupplier<Block> COBALT_STEEL_BLOCK = BLOCKS.register("cobalt_steel_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).requiresCorrectToolForDrops().sound(SoundType.METAL).strength(7.0F, 12.0F)));

    public static final RegistrySupplier<Block> ROBRIENTINE_ORE = BLOCKS.register("robrientine_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(6.0F, 3.5F)));
    public static final RegistrySupplier<Block> DEEPSLATE_ROBRIENTINE_ORE = BLOCKS.register("deepslate_robrientine_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(ROBRIENTINE_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(7.5F, 3.5F).sound(SoundType.DEEPSLATE)));
    public static final RegistrySupplier<Block> COMET_ROBRIENTINE_ORE = BLOCKS.register("comet_robrientine_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(ROBRIENTINE_BLOCK.get()).mapColor(MapColor.COLOR_PURPLE).strength(9.5F, 16.5F).sound(SoundType.DEEPSLATE)));
    public static final RegistrySupplier<Block> ROBRIENTINE_BLOCK = BLOCKS.register("robrientine_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().sound(SoundType.METAL).strength(7.0F, 14.0F)));
    public static final RegistrySupplier<Block> RAW_ROBREINTINE_BLOCK = BLOCKS.register("raw_robrientine_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().sound(SoundType.METAL).strength(6.5F, 12.0F)));

}