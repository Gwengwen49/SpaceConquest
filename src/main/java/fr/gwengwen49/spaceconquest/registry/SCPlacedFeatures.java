package fr.gwengwen49.spaceconquest.registry;

import fr.gwengwen49.spaceconquest.SpaceConquest;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SCPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SpaceConquest.MODID);
    public static final RegistryObject<PlacedFeature> TUNGSTEN_ORE_PLACED_FEATURE = PLACED_FEATURES.register("tungsten_ore_placed", () -> new PlacedFeature(SCFeatures.TUNGSTEN_ORE_FEATURE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(30)))));
    public static final RegistryObject<PlacedFeature> TITANIUM_ORE_PLACED_FEATURE = PLACED_FEATURES.register("titanium_ore_placed", () -> new PlacedFeature(SCFeatures.TITANIUM_ORE_FEATURE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-30), VerticalAnchor.absolute(41)))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_PLACED_FEATURE = PLACED_FEATURES.register("tin_ore_placed", () -> new PlacedFeature(SCFeatures.TIN_ORE_FEATURE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-30), VerticalAnchor.absolute(41)))));
    public static final RegistryObject<PlacedFeature> ALUMINIUM_ORE_PLACED_FEATURE = PLACED_FEATURES.register("aluminium_ore_placed", () -> new PlacedFeature(SCFeatures.ALUMINIUM_ORE_FEATURE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(30)))));
    public static final RegistryObject<PlacedFeature> NICKEL_ORE_PLACED_FEATURE = PLACED_FEATURES.register("nickel_ore_placed", () -> new PlacedFeature(SCFeatures.NICKEL_ORE_FEATURE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-30), VerticalAnchor.absolute(41)))));
    public static final RegistryObject<PlacedFeature> SILVER_ORE_PLACED_FEATURE = PLACED_FEATURES.register("silver_ore_placed", () -> new PlacedFeature(SCFeatures.SILVER_ORE_FEATURE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(30)))));
    public static final RegistryObject<PlacedFeature> ZINC_ORE_PLACED_FEATURE = PLACED_FEATURES.register("zinc_ore_placed", () -> new PlacedFeature(SCFeatures.ZINC_ORE_FEATURE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-30), VerticalAnchor.absolute(41)))));
    public static final RegistryObject<PlacedFeature> LEAD_ORE_PLACED_FEATURE = PLACED_FEATURES.register("lead_ore_placed", () -> new PlacedFeature(SCFeatures.LEAD_ORE_FEATURE.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(30)))));


    public static void register(IEventBus bus){
        PLACED_FEATURES.register(bus);
    }



    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
