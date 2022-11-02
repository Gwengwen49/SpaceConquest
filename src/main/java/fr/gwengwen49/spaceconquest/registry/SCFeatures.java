package fr.gwengwen49.spaceconquest.registry;

import com.google.common.base.Suppliers;
import fr.gwengwen49.spaceconquest.SpaceConquest;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Objects;

public class SCFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SpaceConquest.MODID);

    public static final RegistryObject<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_FEATURE = FEATURES.register("tungsten_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Objects.requireNonNull(Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SCBlocks.TUNGSTEN_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SCBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState()))).get()), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TITANIUM_ORE_FEATURE = FEATURES.register("titanium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Objects.requireNonNull(Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SCBlocks.TITANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SCBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()))).get()), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TIN_ORE_FEATURE = FEATURES.register("tin_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Objects.requireNonNull(Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SCBlocks.TIN_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SCBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()))).get()), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_FEATURE = FEATURES.register("aluminium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Objects.requireNonNull(Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SCBlocks.ALUMINIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SCBlocks.DEEPSLATE_ALUMINIUM_ORE.get().defaultBlockState()))).get()), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NICKEL_ORE_FEATURE = FEATURES.register("nickel_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Objects.requireNonNull(Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SCBlocks.NICKEL_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SCBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState()))).get()), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE_FEATURE = FEATURES.register("silver_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Objects.requireNonNull(Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SCBlocks.SILVER_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SCBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()))).get()), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ZINC_ORE_FEATURE = FEATURES.register("zinc_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Objects.requireNonNull(Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SCBlocks.ZINC_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SCBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState()))).get()), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LEAD_ORE_FEATURE = FEATURES.register("lead_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Objects.requireNonNull(Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SCBlocks.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SCBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState()))).get()), 8)));

    public static void register(IEventBus bus){
        FEATURES.register(bus);
    }


}
