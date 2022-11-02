package fr.gwengwen49.spaceconquest.registry;

import fr.gwengwen49.spaceconquest.SpaceConquest;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SCItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpaceConquest.MODID);

    //machines
    public static final RegistryObject<Item> FUEL_BURNING_GENERATOR =  ITEMS.register("fuel_burning_generator",() -> new BlockItem(SCBlocks.FUEL_BURNING_GENERATOR.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    //public static final RegistryObject<Item> COMPRESSOR;

    //tungsten group
    public static final RegistryObject<Item> TUNGSTEN_ORE = ITEMS.register("tungsten_ore",() -> new BlockItem(SCBlocks.TUNGSTEN_ORE.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",() ->  new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    //titanium group
    public static final RegistryObject<Item> TITANIUM_ORE = ITEMS.register("titanium_ore", () -> new BlockItem(SCBlocks.TITANIUM_ORE.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    //tin group
    public static final RegistryObject<Item> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(SCBlocks.TIN_ORE.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    //aluminium group
    public static final RegistryObject<Item> ALUMINIUM_ORE = ITEMS.register("aluminium_ore", () -> new BlockItem(SCBlocks.ALUMINIUM_ORE.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    //nickel group
    public static final RegistryObject<Item> NICKEL_ORE = ITEMS.register("nickel_ore", () -> new BlockItem(SCBlocks.NICKEL_ORE.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    //silver group
    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(SCBlocks.SILVER_ORE.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    //zinc group
    public static final RegistryObject<Item> ZINC_ORE = ITEMS.register("zinc_ore", () -> new BlockItem(SCBlocks.ZINC_ORE.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    //lead group
    public static final RegistryObject<Item> LEAD_ORE = ITEMS.register("lead_ore", () -> new BlockItem(SCBlocks.LEAD_ORE.get(), new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));

    //alloys
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(SCItems.SC_TAB)));


    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }


    public static final CreativeModeTab SC_TAB = new CreativeModeTab(SpaceConquest.MODID) {
        @Override
        public ItemStack makeIcon() {

            return SCItems.FUEL_BURNING_GENERATOR.get().getDefaultInstance();
        }
    };
}
