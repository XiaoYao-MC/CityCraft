package net.citycraft.blockentity;

import static net.citycraft.CitycraftMod.*;
import static net.citycraft.block.TrafficLightsForward1Block.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class TrafficLightsForward1BlockEntity extends BlockEntity {

    public TrafficLightsForward1BlockEntity(BlockPos pos, BlockState state) {
        super(TRAFFIC_LIGHTS_FORWARD_1_ENTITY, pos, state);
    }
    
    public static void tick(World world, BlockPos pos, BlockState state) {
        int TIME = TRAFFIC_LIGHTS_TIME/20;
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
            case SOUTH:
                if (TIME > 0 & TIME < 37 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 1));
                    break;
                }
                if (TIME >= 37 & TIME <= 40 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 2));
                    break;
                }
                if (TIME > 40 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 3));
                    break;
                }
            case EAST:
            case WEST:
                if (TIME > 0 & TIME < 60 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 3));
                    break;
                }
                if (TIME >= 60 & TIME <= 97 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 1));
                    break;
                }
                if (TIME > 97 & TIME < 100 &(state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 2));
                    break;
                }
                if (TIME >= 100 & (state.get(TRAFFIC_LIGHTS_COLOUR) != 0)) {
                    world.setBlockState(pos, state.with(TRAFFIC_LIGHTS_COLOUR, 3));
                    break;
                }
        }
    }
}