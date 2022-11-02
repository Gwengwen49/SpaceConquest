package fr.gwengwen49.spaceconquest.registry;

import fr.gwengwen49.spaceconquest.SpaceConquest;
import fr.gwengwen49.spaceconquest.blocks.machines.FuelBurningGenerator;
import fr.gwengwen49.spaceconquest.util.BiValue;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.datafix.fixes.BlockEntityKeepPacked;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BannerBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SCBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SpaceConquest.MODID);

    public static final RegistryObject<Block> FUEL_BURNING_GENERATOR = BLOCKS.register("fuel_burning_generator",() -> new FuelBurningGenerator(0, 16));

    //tungsten stuff
    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));
    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = BLOCKS.register("deepslate_tungsten_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));
    //titanium stuff
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 4.5F), UniformInt.of(8, 18)));
    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = BLOCKS.register("deepslate_titanium_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));
    //tin stuff
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.5F, 2.5F)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));
    //aluminium stuff
    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.5F, 2.5F)));
    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ORE = BLOCKS.register("deepslate_aluminium_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));
    //nickel stuff
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.5F, 2.5F)));
    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));
    //silver stuff
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.5F, 2.5F)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));
    //zinc stuff
    public static final RegistryObject<Block> ZINC_ORE = BLOCKS.register("zinc_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.5F, 2.5F)));
    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = BLOCKS.register("deepslate_zinc_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));
    //lead stuff
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.5F, 2.5F)));
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 9)));

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
