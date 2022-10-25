package net.citycraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class SquareTrafficSign3Block extends HorizontalFacingBlock {

    public SquareTrafficSign3Block(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        switch(dir){
            case NORTH:
                return VoxelShapes.cuboid(3/16f, 0f, 0f, 13/16f, 1f, 1/16f);
            case SOUTH:
                return VoxelShapes.cuboid(3/16f, 0f, 15/16f, 13/16f, 1f, 1f);
            case EAST:
                return VoxelShapes.cuboid(15/16f,0f,3/16f,1f,1f,13/16f);
            case WEST:
                return VoxelShapes.cuboid(0f,0f,3/16f,1/16f,1f,13/16f);
        }
        return null;
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

}