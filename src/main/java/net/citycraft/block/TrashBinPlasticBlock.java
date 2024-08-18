package net.citycraft.block;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
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

import static net.minecraft.item.Items.*;


public class TrashBinPlasticBlock extends HorizontalFacingBlock {

    public static final IntProperty COLOUR = IntProperty.of("colour",1,5);

    public TrashBinPlasticBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        setDefaultState(getDefaultState().with(COLOUR, 1));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
        builder.add(COLOUR);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().getItem() == LIGHT_BLUE_DYE){
            world.setBlockState(pos, state.with(COLOUR, 1));
            world.playSound(null, pos, SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1f, 1f);
        }
        if (player.getMainHandStack().getItem() == LIME_DYE){
            world.setBlockState(pos, state.with(COLOUR, 2));
            world.playSound(null, pos, SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1f, 1f);
        }
        if (player.getMainHandStack().getItem() == YELLOW_DYE){
            world.setBlockState(pos, state.with(COLOUR, 3));
            world.playSound(null, pos, SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1f, 1f);
        }
        if (player.getMainHandStack().getItem() == RED_DYE){
            world.setBlockState(pos, state.with(COLOUR, 4));
            world.playSound(null, pos, SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1f, 1f);
        }
        if (player.getMainHandStack().getItem() == GRAY_DYE){
            world.setBlockState(pos, state.with(COLOUR, 5));
            world.playSound(null, pos, SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1f, 1f);
        }
        return ActionResult.SUCCESS;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return VoxelShapes.cuboid(2/16f, 0f, 2/16f, 14/16f, 21/16f, 14/16f);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }
}