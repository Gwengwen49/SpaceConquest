package fr.gwengwen49.spaceconquest.blocks.machines;

import fr.gwengwen49.spaceconquest.blocks.entities.machine.GeneratorBlockEntity;
import fr.gwengwen49.spaceconquest.energy.Provider;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.Objects;

public abstract class GeneratorBlock extends BaseEntityBlock implements Provider {

    private int minProductionRate;
    private int maxProductionRate;
    protected GeneratorBlock(Properties p_49224_, int minProductionRate, int maxProductionRate) {
        super(p_49224_);
        this.minProductionRate = minProductionRate;
        this.maxProductionRate = maxProductionRate;
    }

    @Override
    public int getMinProductionRate() {
        return this.minProductionRate;
    }

    @Override
    public int getMaxProductionRate() {
        return this.maxProductionRate;
    }

    @Override
    public boolean canProvide() {
        return false;
    }

    @Override
    public boolean isPathfindable(BlockState p_60475_, BlockGetter p_60476_, BlockPos p_60477_, PathComputationType p_60478_) {
        return false;
    }

    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {

        level.addFreshEntity(new Allay(EntityType.ALLAY, level));
    }

    @Override
    public InteractionResult use(BlockState blockState, Level world, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if(world.isClientSide){
            return InteractionResult.SUCCESS;
        }
        else {
            if(world.getBlockEntity(blockPos) instanceof GeneratorBlockEntity)
            {
                player.openMenu((MenuProvider) world.getBlockEntity(blockPos));
            }
        }
        return InteractionResult.CONSUME;
    }

    public <T extends BlockEntity> BlockEntityTicker<T> createGeneratorTicker(Level world, BlockEntityType<T> blockEntityType, BlockEntityType<? extends GeneratorBlockEntity> generatorBlockEntityType) {
        return world.isClientSide ? null : createTickerHelper(blockEntityType, generatorBlockEntityType, GeneratorBlockEntity::tick);
    }

}
