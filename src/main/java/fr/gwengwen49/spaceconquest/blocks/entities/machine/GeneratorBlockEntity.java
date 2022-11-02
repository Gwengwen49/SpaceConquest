package fr.gwengwen49.spaceconquest.blocks.entities.machine;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class GeneratorBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer {
    int productionRate;
    int fuelBurnTime;
    int gaugeStatus;
    private final String containerName;
    private List<ItemStack> items = NonNullList.withSize(5, ItemStack.EMPTY);
    public GeneratorBlockEntity(BlockEntityType<? extends GeneratorBlockEntity> blockEntityType, BlockPos blockPos, BlockState blockState, String containerName) {
        super(blockEntityType, blockPos, blockState);
        this.containerName = containerName;
    }

    protected final ContainerData data = new ContainerData() {
        @Override
        public int get(int index) {
            switch (index){
                case 0:
                    return GeneratorBlockEntity.this.productionRate;
                case 1:
                    return GeneratorBlockEntity.this.fuelBurnTime;
                case 2:
                    return GeneratorBlockEntity.this.gaugeStatus;
                default:
                    return 0;
            }
        }

        @Override
        public void set(int index, int value) {
            switch (index){
                case 0:
                    GeneratorBlockEntity.this.productionRate = value;
                    break;
                case 1:
                    GeneratorBlockEntity.this.fuelBurnTime = value;
                    break;
                case 2:
                    GeneratorBlockEntity.this.gaugeStatus = value;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    };
    @Override
    public int[] getSlotsForFace(Direction p_19238_) {
        return new int[0];
    }

    @Override
    public boolean canPlaceItemThroughFace(int p_19235_, ItemStack p_19236_, @Nullable Direction p_19237_) {
        return false;
    }

    @Override
    public boolean canTakeItemThroughFace(int p_19239_, ItemStack p_19240_, Direction p_19241_) {
        return false;
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable(containerName);
    }

    @Override
    protected AbstractContainerMenu createMenu(int p_58627_, Inventory p_58628_) {
        return null;
    }

    @Override
    public int getContainerSize() {
        return this.items.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getItem(int p_18941_) {
        return null;
    }

    @Override
    public ItemStack removeItem(int p_18942_, int p_18943_) {
        return null;
    }

    @Override
    public ItemStack removeItemNoUpdate(int p_18951_) {
        return null;
    }

    @Override
    public void setItem(int p_18944_, ItemStack p_18945_) {

    }

    @Override
    public boolean stillValid(Player p_18946_) {
        return false;
    }

    @Override
    public void clearContent() {

    }

    public static void tick(Level p_155286_, BlockPos p_155287_, BlockState p_155288_, GeneratorBlockEntity p_155289_) {

    }
}
