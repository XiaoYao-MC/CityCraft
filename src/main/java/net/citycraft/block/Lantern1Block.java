package net.citycraft.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.List;

public class Lantern1Block extends HorizontalFacingBlock {
    public Lantern1Block(Settings settings) {
        super(settings.nonOpaque());
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(4/16f, 7/16f, 4/16f, 12/16f, 15/16f, 12/16f);
    }

}