package net.citycraft.blockentity;

import static net.citycraft.CitycraftMod.*;
import static net.citycraft.block.TrafficLightsForward1Block.*;
import static net.citycraft.block.TrafficLightsRight1Block.TRAFFIC_LIGHTS_COLOUR;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class TrafficLightsRight1BlockEntity extends BlockEntity {

    public TrafficLightsRight1BlockEntity(BlockPos pos, BlockState state) {
        super(TRAFFIC_LIGHTS_RIGHT_1_ENTITY, pos, state);
    }
    
    public static void tick(World world, BlockPos pos, BlockState state) {
        int TIME = TRAFFIC_LIGHTS_TIME/20;
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
            case SOUTH:
                if (TIME > 0 & TIME < 57 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 1));
                    break;
                }
                if (TIME >= 57 & TIME <= 60 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 2));
                    break;
                }
                if (TIME > 60 & TIME <= 70 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 3));
                    break;
                }
                if (TIME > 70 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 1));
                    break;
                }
            case EAST:
            case WEST:
                if (TIME > 0 & TIME < 10 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 3));
                    break;
                }
                if (TIME >= 10 & TIME <= 117 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 1));
                    break;
                }
                if (TIME > 117 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 2));
                    break;
                }
        }
    }
}