package net.citycraft.block;

import net.citycraft.CitycraftMod;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CircleTrafficSignBlock extends HorizontalFacingBlock {

	public static final BooleanProperty SIDE = BooleanProperty.of("side");

	public CircleTrafficSignBlock(Settings settings) {
		super(settings);
		setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
		setDefaultState(getDefaultState().with(SIDE, false));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.HORIZONTAL_FACING);
		builder.add(SIDE);
	}

	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (player.getMainHandStack().getItem()== CitycraftMod.CHANGING_STICK){
			if (state.get(SIDE)) world.setBlockState(pos, state.with(SIDE, false));
			else world.setBlockState(pos, state.with(SIDE, true));
		}
		return ActionResult.SUCCESS;
	}

	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
		Direction dir = state.get(FACING);
		switch(dir){
			case NORTH:
				if (state.get(SIDE))
					return VoxelShapes.cuboid(2/16f, 4/16f, 0f, 14/16f, 1f, 1/16f);
				else
					return VoxelShapes.cuboid(2/16f, 0f, 7.5/16f, 14/16f, 12/16f, 8.5/16f);
			case SOUTH:
				if (state.get(SIDE))
					return VoxelShapes.cuboid(2/16f, 4/16f, 15/16f, 14/16f, 1f, 1f);
				else
					return VoxelShapes.cuboid(2/16f, 0f, 7.5/16f, 14/16f, 12/16f, 8.5/16f);
			case EAST:
				if (state.get(SIDE))
					return VoxelShapes.cuboid(15/16f, 4/16f, 2/16f, 1f, 1f, 14/16f);
				else
					return VoxelShapes.cuboid(7.5/16f,0f,2/16f,8.5/16f,12/16f,14/16f);
			case WEST:
				if (state.get(SIDE))
					return VoxelShapes.cuboid(0f, 4/16f, 2/16f, 1/16f, 1f, 14/16f);
				else
					return VoxelShapes.cuboid(7.5/16f,0f,2/16f,8.5/16f,12/16f,14/16f);
		}
		return null;
	}

	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(FACING, ctx.getPlayerFacing());
	}

}
