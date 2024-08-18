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

public class ParkingLockBlock extends HorizontalFacingBlock {

	public static final BooleanProperty LOCKED = BooleanProperty.of("locked");

	public ParkingLockBlock(Settings settings) {
		super(settings);
		setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
		setDefaultState(getDefaultState().with(LOCKED, false));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.HORIZONTAL_FACING);
		builder.add(LOCKED);
	}

	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (player.getMainHandStack().getItem() == CitycraftMod.CONVERSION_STICK){
			if (state.get(LOCKED)) world.setBlockState(pos, state.with(LOCKED, false));
			else world.setBlockState(pos, state.with(LOCKED, true));
		}
		return ActionResult.SUCCESS;
	}

	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
		Direction dir = state.get(FACING);
		switch(dir){
			case NORTH:
				return VoxelShapes.cuboid(3/16f, 0f, 1/16f, 13/16f, 2/16f, 1f);
			case SOUTH:
				return VoxelShapes.cuboid(3/16f, 0f, 0f, 13/16f, 2/16f, 15/16f);
			case EAST:
				return VoxelShapes.cuboid(0f, 0f, 3/16f, 15/16f, 2/16f, 13/16f);
			case WEST:
				return VoxelShapes.cuboid(1/16f, 0f, 3/16f, 1f, 2/16f, 13/16f);
		}
		return null;
	}

	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(FACING, ctx.getPlayerFacing());
	}

}
