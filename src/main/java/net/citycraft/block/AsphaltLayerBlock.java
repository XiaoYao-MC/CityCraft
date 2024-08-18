package net.citycraft.block;

import net.citycraft.CitycraftMod;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class AsphaltLayerBlock extends Block {

    public static final IntProperty LAYERS = IntProperty.of("layers",1,8);

    public AsphaltLayerBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(LAYERS, 1));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LAYERS);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().getItem() == CitycraftMod.ASPHALT_LAYER.asItem()){
            if (state.get(LAYERS) == 1) world.setBlockState(pos, state.with(LAYERS, 2));
            if (state.get(LAYERS) == 2) world.setBlockState(pos, state.with(LAYERS, 3));
            if (state.get(LAYERS) == 3) world.setBlockState(pos, state.with(LAYERS, 4));
            if (state.get(LAYERS) == 4) world.setBlockState(pos, state.with(LAYERS, 5));
            if (state.get(LAYERS) == 5) world.setBlockState(pos, state.with(LAYERS, 6));
            if (state.get(LAYERS) == 6) world.setBlockState(pos, state.with(LAYERS, 7));
            if (state.get(LAYERS) == 7) world.setBlockState(pos, state.with(LAYERS, 8));
            if (state.get(LAYERS) != 8) world.playSound(null, pos, SoundEvents.BLOCK_STONE_PLACE, SoundCategory.BLOCKS, 1f, 1f);
        }
        return ActionResult.SUCCESS;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            if (state.get(LAYERS) == 1) {
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1 / 8f, 1f);
            }
            if (state.get(LAYERS) == 2) {
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 2 / 8f, 1f);
            }
            if (state.get(LAYERS) == 3) {
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 3 / 8f, 1f);
            }
            if (state.get(LAYERS) == 4) {
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 4 / 8f, 1f);
            }
            if (state.get(LAYERS) == 5) {
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 5 / 8f, 1f);
            }
            if (state.get(LAYERS) == 6) {
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 6 / 8f, 1f);
            }
            if (state.get(LAYERS) == 7) {
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 7 / 8f, 1f);
            }
            if (state.get(LAYERS) == 8) {
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1f, 1f);
            }
        return null;
    }
}