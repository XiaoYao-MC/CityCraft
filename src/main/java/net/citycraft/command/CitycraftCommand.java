package net.citycraft.command;

import com.mojang.brigadier.CommandDispatcher;
import net.citycraft.block.AmazingBlockBlock;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

import static net.citycraft.CitycraftMod.TRAFFIC_LIGHTS_TIME;
import static net.minecraft.server.command.CommandManager.literal;

public class CitycraftCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("citycraft")
                .then(literal("about")
                        .executes(context -> {
                                ServerPlayerEntity player = context.getSource().getPlayer();
                                player.sendMessage(Text.literal("§b§l City Craft 2.0.2"), false);
                                player.sendMessage(Text.literal("by Xiao Yao , PDpg233 & mxy333"), false);
                                player.sendMessage(Text.literal("MC百科:https://www.mcmod.cn/class/7711.html"), false);
                                player.sendMessage(Text.literal("Modrinth:https://modrinth.com/mod/citycraft"), false);
                                player.sendMessage(Text.literal("Github:https://github.com/XiaoYao-MC/CityCraft"), false);
                                return 0;
                            })
                )
                .then(literal("amazing_block_play_music")
                        .then(literal("true")
                                .executes(context -> {
                                    ServerPlayerEntity player = context.getSource().getPlayer();
                                    player.sendMessage(Text.literal("amazing_block_play_music:§a§l true"), false);
                                    AmazingBlockBlock.AMAZING_BLOCK_PLAY_MUSIC = 1;
                                    return 0;
                                })
                        )
                        .then(literal("false")
                                .executes(context -> {
                                    ServerPlayerEntity player = context.getSource().getPlayer();
                                    player.sendMessage(Text.literal("amazing_block_play_music:§a§l false"), false);
                                    AmazingBlockBlock.AMAZING_BLOCK_PLAY_MUSIC = 0;
                                    return 0;
                                })
                        )
                )
                .then(literal("traffic_lights_time")
                        .executes(context -> {
                            ServerPlayerEntity player = context.getSource().getPlayer();
                            player.sendMessage(Text.literal( TRAFFIC_LIGHTS_TIME / 20 + "s/§a§l120s"), true);
                            return 0;
                        })
                )
        );
    }
}

