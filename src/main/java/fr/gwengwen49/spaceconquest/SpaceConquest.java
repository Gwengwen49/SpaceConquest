package fr.gwengwen49.spaceconquest;

import com.mojang.logging.LogUtils;
import fr.gwengwen49.spaceconquest.registry.SCBlocks;
import fr.gwengwen49.spaceconquest.registry.SCFeatures;
import fr.gwengwen49.spaceconquest.registry.SCItems;
import fr.gwengwen49.spaceconquest.registry.SCPlacedFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Arrays;


@Mod(SpaceConquest.MODID)
public class SpaceConquest {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "space_conquest";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public SpaceConquest() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::serverSetup);
        modEventBus.addListener(this::dataSetup);
        SCBlocks.register(modEventBus);
        SCItems.register(modEventBus);
        SCFeatures.register(modEventBus);
        SCPlacedFeatures.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(final FMLClientSetupEvent event) {
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event) {
    }

    private void dataSetup(final GatherDataEvent event) {
    }

    @Mod.EventBusSubscriber(modid = SpaceConquest.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class AutoReg {

        @SubscribeEvent
        public static void onPlayerInteract(PlayerInteractEvent event){
            if(event.getItemStack().getItem().equals(Items.ANVIL))
            {
                replaceBy(20, 40, 20, event.getLevel(), event.getEntity(), Blocks.STONE.defaultBlockState(), Blocks.GRANITE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState());
            }

        }

        public static void replaceBy(int radX, int radY, int radZ, Level world, Player player, BlockState... blocksToReplace)
        {
            for(int x= -radX; x <= radX; x++){
                for(int y = -radY; y <= radY; y++){
                    for(int z = -radZ; z <= radZ; z++){
                        int finalX = x;
                        int finalY = y;
                        int finalZ = z;
                        int finalX1 = x;
                        int finalY1 = y;
                        int finalZ1 = z;
                        Arrays.stream(blocksToReplace).filter(blockState -> world.getBlockState(new BlockPos(player.getX()+finalX1, player.getY()+finalY1, player.getZ()+finalZ1)).equals(blockState)).forEach(blockState -> world.setBlock(new BlockPos(player.getX()+finalX, player.getY()+finalY, player.getZ()+finalZ), Blocks.AIR.defaultBlockState(), 1));
                    }
                }
            }
        }
    }

}
