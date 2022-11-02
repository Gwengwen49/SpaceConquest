package fr.gwengwen49.spaceconquest.level;

import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.blending.Blender;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class NoiseChunkM extends NoiseChunk {
    public NoiseChunkM(int p_224343_, RandomState p_224344_, int p_224345_, int p_224346_, NoiseSettings p_224347_, DensityFunctions.BeardifierOrMarker p_224348_, NoiseGeneratorSettings p_224349_, Aquifer.FluidPicker p_224350_, Blender p_224351_) {
        super(p_224343_, p_224344_, p_224345_, p_224346_, p_224347_, p_224348_, p_224349_, p_224350_, p_224351_);
    }

    @Override
    protected Climate.Sampler cachedClimateSampler(NoiseRouter p_224360_, List<Climate.ParameterPoint> p_224361_) {
        return super.cachedClimateSampler(p_224360_, p_224361_);
    }

    @Nullable
    @Override
    protected BlockState getInterpolatedState() {
        return super.getInterpolatedState();
    }

    @Override
    protected int cellHeight() {
        return super.cellHeight();
    }

    @Override
    protected int cellWidth() {
        return super.cellWidth();
    }

    public static enum BeardifierMarker implements DensityFunctions.BeardifierOrMarker {
        INSTANCE;

        public double compute(DensityFunction.FunctionContext p_208515_) {
            return 0.0D;
        }

        public void fillArray(double[] p_208517_, DensityFunction.ContextProvider p_208518_) {
            Arrays.fill(p_208517_, 0.0D);
        }

        public double minValue() {
            return 0.0D;
        }

        public double maxValue() {
            return 0.0D;
        }
    }
}
