package net.citycraft.block;

import net.citycraft.CitycraftMod;
import net.citycraft.blockentity.TrafficLightsRight1BlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

import static net.citycraft.CitycraftMod.TRAFFIC_LIGHTS_RIGHT_1_ENTITY;


public  class TrafficLightsRight1Block extends BlockWithEntity implements BlockEntityProvider {
    public static final IntProperty TRAFFIC_LIGHTS_COLOUR = IntProperty.of("traffic_lights_colour",0,3);
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public TrafficLightsRight1Block(Settings settings){
        super(settings.nonOpaque());
        setDefaultState(getStateManager().getDefaultState().with(TRAFFIC_LIGHTS_COLOUR, 0));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(TRAFFIC_LIGHTS_COLOUR);
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().getItem()== CitycraftMod.CONVERSION_STICK){
            if (state.get(TRAFFIC_LIGHTS_COLOUR) == 0)
                world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 1));
            else world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 0));
        }
        return ActionResult.SUCCESS;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> VoxelShapes.cuboid(4 / 16f, 0f, 0f, 12 / 16f, 22 / 16f, 2 / 16f);
            case SOUTH -> VoxelShapes.cuboid(4 / 16f, 0f, 14 / 16f, 12 / 16f, 22 / 16f, 1f);
            case EAST -> VoxelShapes.cuboid(14 / 16f, 0f, 4 / 16f, 1f, 22 / 16f, 12 / 16f);
            case WEST -> VoxelShapes.cuboid(0f, 0f, 4 / 16f, 2 / 16f, 22 / 16f, 12 / 16f);
            default -> null;
        };
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TrafficLightsRight1BlockEntity(pos, state);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("block.citycraft.traffic_lights.tooltip").formatted(Formatting.DARK_PURPLE));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, TRAFFIC_LIGHTS_RIGHT_1_ENTITY, (world1, pos, state1, be) -> TrafficLightsRight1BlockEntity.tick(world1, pos, state1));
    }
}