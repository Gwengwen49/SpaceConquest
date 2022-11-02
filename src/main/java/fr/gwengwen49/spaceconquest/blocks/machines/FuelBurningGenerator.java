package fr.gwengwen49.spaceconquest.blocks.machines;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.Nullable;

public class FuelBurningGenerator extends GeneratorBlock{

    public FuelBurningGenerator(int minProductionRate, int maxProductionRate) {
        super(Properties.of(Material.METAL), minProductionRate, maxProductionRate);
    }

    @Override
    public int provide() {
        return 0;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_) {
        return null;
    }
}
