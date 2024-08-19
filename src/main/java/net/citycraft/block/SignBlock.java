/*package net.citycraft.block;

import net.citycraft.blockentity.SignBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class SignBlock extends HorizontalFacingBlock implements BlockEntityProvider {
    public SignBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        switch(dir){
            case NORTH:
            case SOUTH:
                return VoxelShapes.cuboid(0f, 0f, 7/16f, 1f, 8/16f, 9/16f);
            case EAST:
            case WEST:
                return VoxelShapes.cuboid(7/16f,0f,0f,9/16f,8/16f,1f);
        }
        return null;
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SignBlockEntity(pos, state);
    }

}*/