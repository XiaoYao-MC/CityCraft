package net.citycraft;

import net.citycraft.block.*;
import net.citycraft.blockentity.TrafficLightsForward1BlockEntity;
import net.citycraft.blockentity.TrafficLightsLeft1BlockEntity;
import net.citycraft.blockentity.TrafficLightsRight1BlockEntity;
import net.citycraft.command.CitycraftCommand;
import net.citycraft.item.ATipFromXiaoYaoItem;
import net.citycraft.item.ConversionStickItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.item.FoodComponents.ENCHANTED_GOLDEN_APPLE;

public class CitycraftMod implements ModInitializer {

    public static final Block ASPHALT = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt"), ASPHALT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt"), new BlockItem(ASPHALT, new Item.Settings()));
    }

    public static final Block ASPHALT_RED = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.RED).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt_red"), ASPHALT_RED);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt_red"), new BlockItem(ASPHALT_RED, new Item.Settings()));
    }

    public static final Block ASPHALT_GREEN = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.GREEN).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt_green"), ASPHALT_GREEN);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt_green"), new BlockItem(ASPHALT_GREEN, new Item.Settings()));
    }

    public static final Block ASPHALT_BLUE = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_BLUE).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt_blue"), ASPHALT_BLUE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt_blue"), new BlockItem(ASPHALT_BLUE, new Item.Settings()));
    }

    public static final SlabBlock ASPHALT_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt_slab"), ASPHALT_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt_slab"), new BlockItem(ASPHALT_SLAB, new Item.Settings()));
    }

    public static final AsphaltLayerBlock ASPHALT_LAYER = new AsphaltLayerBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt_layer"), ASPHALT_LAYER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt_layer"), new BlockItem(ASPHALT_LAYER, new Item.Settings()));
    }

    public static final AsphaltSlope1Block ASPHALT_SLOPE_1 = new AsphaltSlope1Block
            (FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt_slope_1"), ASPHALT_SLOPE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt_slope_1"), new BlockItem(ASPHALT_SLOPE_1, new Item.Settings()));
    }

    public static final AsphaltSlope2Block ASPHALT_SLOPE_2 = new AsphaltSlope2Block
            (FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt_slope_2"), ASPHALT_SLOPE_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt_slope_2"), new BlockItem(ASPHALT_SLOPE_2, new Item.Settings()));
    }

    public static final AsphaltSlope3Block ASPHALT_SLOPE_3 = new AsphaltSlope3Block
            (FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "asphalt_slope_3"), ASPHALT_SLOPE_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "asphalt_slope_3"), new BlockItem(ASPHALT_SLOPE_3, new Item.Settings()));
    }

    public static final Block CEMENT = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

     {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "cement"), CEMENT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "cement"), new BlockItem(CEMENT, new Item.Settings()));
    }

    public static final SlabBlock CEMENT_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "cement_slab"), CEMENT_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "cement_slab"), new BlockItem(CEMENT_SLAB, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_S_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_s_m"), WHITE_LINE_S_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_s_m"), new BlockItem(WHITE_LINE_S_M, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_S_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_s_s"), WHITE_LINE_S_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_s_s"), new BlockItem(WHITE_LINE_S_S, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_D = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_d"), WHITE_LINE_D);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_d"), new BlockItem(WHITE_LINE_D, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_C_R_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_c_r_s"), WHITE_LINE_C_R_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_c_r_s"), new BlockItem(WHITE_LINE_C_R_S, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_C_R_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_c_r_m"), WHITE_LINE_C_R_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_c_r_m"), new BlockItem(WHITE_LINE_C_R_M, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_C_R_L = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_c_r_l"), WHITE_LINE_C_R_L);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_c_r_l"), new BlockItem(WHITE_LINE_C_R_L, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_C_S_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_c_s_s"), WHITE_LINE_C_S_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_c_s_s"), new BlockItem(WHITE_LINE_C_S_S, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_C_S_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_c_s_m"), WHITE_LINE_C_S_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_c_s_m"), new BlockItem(WHITE_LINE_C_S_M, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_C_C_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_c_c_m"), WHITE_LINE_C_C_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_c_c_m"), new BlockItem(WHITE_LINE_C_C_M, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_SC_R_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_sc_r_m"), WHITE_LINE_SC_R_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_sc_r_m"), new BlockItem(WHITE_LINE_SC_R_M, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_SC_S_S_L = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_sc_s_s_l"), WHITE_LINE_SC_S_S_L);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_sc_s_s_l"), new BlockItem(WHITE_LINE_SC_S_S_L, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_SC_S_S_R = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_sc_s_s_r"), WHITE_LINE_SC_S_S_R);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_sc_s_s_r"), new BlockItem(WHITE_LINE_SC_S_S_R, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_S_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_s_m"), YELLOW_LINE_S_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_s_m"), new BlockItem(YELLOW_LINE_S_M, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_S_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_s_s"), YELLOW_LINE_S_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_s_s"), new BlockItem(YELLOW_LINE_S_S, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_D = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_d"), YELLOW_LINE_D);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_d"), new BlockItem(YELLOW_LINE_D, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_C_R_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_c_r_s"), YELLOW_LINE_C_R_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_c_r_s"), new BlockItem(YELLOW_LINE_C_R_S, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_C_R_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_c_r_m"), YELLOW_LINE_C_R_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_c_r_m"), new BlockItem(YELLOW_LINE_C_R_M, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_C_R_L = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_c_r_l"), YELLOW_LINE_C_R_L);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_c_r_l"), new BlockItem(YELLOW_LINE_C_R_L, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_C_S_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_c_s_s"), YELLOW_LINE_C_S_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_c_s_s"), new BlockItem(YELLOW_LINE_C_S_S, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_C_S_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_c_s_m"), YELLOW_LINE_C_S_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_c_s_m"), new BlockItem(YELLOW_LINE_C_S_M, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_C_C_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_c_c_m"), YELLOW_LINE_C_C_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_c_c_m"), new BlockItem(YELLOW_LINE_C_C_M, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_SC_R_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_sc_r_m"), YELLOW_LINE_SC_R_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_sc_r_m"), new BlockItem(YELLOW_LINE_SC_R_M, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_SC_S_S_L = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_sc_s_s_l"), YELLOW_LINE_SC_S_S_L);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_sc_s_s_l"), new BlockItem(YELLOW_LINE_SC_S_S_L, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_SC_S_S_R = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_sc_s_s_r"), YELLOW_LINE_SC_S_S_R);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_sc_s_s_r"), new BlockItem(YELLOW_LINE_SC_S_S_R, new Item.Settings()));
    }

    public static final LineBlock WHITE_LINE_DOUBLE_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_double_s"), WHITE_LINE_DOUBLE_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_double_s"), new BlockItem(WHITE_LINE_DOUBLE_S, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_DOUBLE_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_double_s"), YELLOW_LINE_DOUBLE_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_double_s"), new BlockItem(YELLOW_LINE_DOUBLE_S, new Item.Settings()));
    }
    
    public static final LineBlock WHITE_LINE_CROSS = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_cross"), WHITE_LINE_CROSS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_cross"), new BlockItem(WHITE_LINE_CROSS, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_CROSS = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_cross"), YELLOW_LINE_CROSS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_cross"), new BlockItem(YELLOW_LINE_CROSS, new Item.Settings()));
    }
    public static final LineBlock WHITE_LINE_DOUBLE_C = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_line_double_c"), WHITE_LINE_DOUBLE_C);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_line_double_c"), new BlockItem(WHITE_LINE_DOUBLE_C, new Item.Settings()));
    }

    public static final LineBlock YELLOW_LINE_DOUBLE_C = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "yellow_line_double_c"), YELLOW_LINE_DOUBLE_C);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "yellow_line_double_c"), new BlockItem(YELLOW_LINE_DOUBLE_C, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_1 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_1"), DIVERSION_LINE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_1"), new BlockItem(DIVERSION_LINE_1, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_2 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_2"), DIVERSION_LINE_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_2"), new BlockItem(DIVERSION_LINE_2, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_3 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_3"), DIVERSION_LINE_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_3"), new BlockItem(DIVERSION_LINE_3, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_4 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_4"), DIVERSION_LINE_4);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_4"), new BlockItem(DIVERSION_LINE_4, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_5 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_5"), DIVERSION_LINE_5);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_5"), new BlockItem(DIVERSION_LINE_5, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_6 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_6"), DIVERSION_LINE_6);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_6"), new BlockItem(DIVERSION_LINE_6, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_7 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_7"), DIVERSION_LINE_7);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_7"), new BlockItem(DIVERSION_LINE_7, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_8 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_8"), DIVERSION_LINE_8);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_8"), new BlockItem(DIVERSION_LINE_8, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_9 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_9"), DIVERSION_LINE_9);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_9"), new BlockItem(DIVERSION_LINE_9, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_10 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_10"), DIVERSION_LINE_10);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_10"), new BlockItem(DIVERSION_LINE_10, new Item.Settings()));
    }

    public static final LineBlock DIVERSION_LINE_11 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "diversion_line_11"), DIVERSION_LINE_11);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "diversion_line_11"), new BlockItem(DIVERSION_LINE_11, new Item.Settings()));
    }

    public static final LineBlock NO_PARKING_LINE_1 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "no_parking_line_1"), NO_PARKING_LINE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "no_parking_line_1"), new BlockItem(NO_PARKING_LINE_1, new Item.Settings()));
    }

    public static final LineBlock NO_PARKING_LINE_2 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "no_parking_line_2"), NO_PARKING_LINE_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "no_parking_line_2"), new BlockItem(NO_PARKING_LINE_2, new Item.Settings()));
    }

    public static final LineBlock NO_PARKING_LINE_3 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "no_parking_line_3"), NO_PARKING_LINE_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "no_parking_line_3"), new BlockItem(NO_PARKING_LINE_3, new Item.Settings()));
    }

    public static final LineBlock NO_PARKING_LINE_4 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "no_parking_line_4"), NO_PARKING_LINE_4);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "no_parking_line_4"), new BlockItem(NO_PARKING_LINE_4, new Item.Settings()));
    }

    public static final LineBlock NO_PARKING_LINE_5 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "no_parking_line_5"), NO_PARKING_LINE_5);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "no_parking_line_5"), new BlockItem(NO_PARKING_LINE_5, new Item.Settings()));
    }

    public static final LineBlock ZEBRA_CROSSING = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "zebra_crossing"), ZEBRA_CROSSING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "zebra_crossing"), new BlockItem(ZEBRA_CROSSING, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_PARKING = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_parking"), GROUND_SIGN_PARKING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_parking"), new BlockItem(GROUND_SIGN_PARKING, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_ZEBRA_CROSSING_WARNING = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_zebra_crossing_warning"), GROUND_SIGN_ZEBRA_CROSSING_WARNING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_zebra_crossing_warning"), new BlockItem(GROUND_SIGN_ZEBRA_CROSSING_WARNING, new Item.Settings()));
    }
    public static final LineBlock GROUND_SIGN_A = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_a"), GROUND_SIGN_A);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_a"), new BlockItem(GROUND_SIGN_A, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_B = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_b"), GROUND_SIGN_B);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_b"), new BlockItem(GROUND_SIGN_B, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_C = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_c"), GROUND_SIGN_C);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_c"), new BlockItem(GROUND_SIGN_C, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_D = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_d"), GROUND_SIGN_D);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_d"), new BlockItem(GROUND_SIGN_D, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_E = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_e"), GROUND_SIGN_E);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_e"), new BlockItem(GROUND_SIGN_E, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_F = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_f"), GROUND_SIGN_F);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_f"), new BlockItem(GROUND_SIGN_F, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_G = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_g"), GROUND_SIGN_G);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_g"), new BlockItem(GROUND_SIGN_G, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_H = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_h"), GROUND_SIGN_H);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_h"), new BlockItem(GROUND_SIGN_H, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_I = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_i"), GROUND_SIGN_I);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_i"), new BlockItem(GROUND_SIGN_I, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_J = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_j"), GROUND_SIGN_J);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_j"), new BlockItem(GROUND_SIGN_J, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_K = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_k"), GROUND_SIGN_K);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_k"), new BlockItem(GROUND_SIGN_K, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_L = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_l"), GROUND_SIGN_L);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_l"), new BlockItem(GROUND_SIGN_L, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_M = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_m"), GROUND_SIGN_M);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_m"), new BlockItem(GROUND_SIGN_M, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_N = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_n"), GROUND_SIGN_N);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_n"), new BlockItem(GROUND_SIGN_N, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_O = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_o"), GROUND_SIGN_O);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_o"), new BlockItem(GROUND_SIGN_O, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_P = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_p"), GROUND_SIGN_P);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_p"), new BlockItem(GROUND_SIGN_P, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_Q = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_q"), GROUND_SIGN_Q);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_q"), new BlockItem(GROUND_SIGN_Q, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_R = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_r"), GROUND_SIGN_R);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_r"), new BlockItem(GROUND_SIGN_R, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_S = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_s"), GROUND_SIGN_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_s"), new BlockItem(GROUND_SIGN_S, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_T = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_t"), GROUND_SIGN_T);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_t"), new BlockItem(GROUND_SIGN_T, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_U = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_u"), GROUND_SIGN_U);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_u"), new BlockItem(GROUND_SIGN_U, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_V = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_v"), GROUND_SIGN_V);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_v"), new BlockItem(GROUND_SIGN_V, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_W = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_w"), GROUND_SIGN_W);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_w"), new BlockItem(GROUND_SIGN_W, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_X = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_x"), GROUND_SIGN_X);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_x"), new BlockItem(GROUND_SIGN_X, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_Y = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_y"), GROUND_SIGN_Y);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_y"), new BlockItem(GROUND_SIGN_Y, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_Z = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_z"), GROUND_SIGN_Z);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_z"), new BlockItem(GROUND_SIGN_Z, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_0 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_0"), GROUND_SIGN_0);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_0"), new BlockItem(GROUND_SIGN_0, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_1 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_1"), GROUND_SIGN_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_1"), new BlockItem(GROUND_SIGN_1, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_2 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_2"), GROUND_SIGN_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_2"), new BlockItem(GROUND_SIGN_2, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_3 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_3"), GROUND_SIGN_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_3"), new BlockItem(GROUND_SIGN_3, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_4 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_4"), GROUND_SIGN_4);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_4"), new BlockItem(GROUND_SIGN_4, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_5 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_5"), GROUND_SIGN_5);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_5"), new BlockItem(GROUND_SIGN_5, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_6 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_6"), GROUND_SIGN_6);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_6"), new BlockItem(GROUND_SIGN_6, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_7 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_7"), GROUND_SIGN_7);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_7"), new BlockItem(GROUND_SIGN_7, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_8 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_8"), GROUND_SIGN_8);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_8"), new BlockItem(GROUND_SIGN_8, new Item.Settings()));
    }

    public static final LineBlock GROUND_SIGN_9 = new LineBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ground_sign_9"), GROUND_SIGN_9);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ground_sign_9"), new BlockItem(GROUND_SIGN_9, new Item.Settings()));
    }


    public static final ArrowBlock ARROW_FORWARD = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_forward"), ARROW_FORWARD);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_forward"), new BlockItem(ARROW_FORWARD, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_LEFT = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_left"), ARROW_LEFT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_left"), new BlockItem(ARROW_LEFT, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_RIGHT = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_right"), ARROW_RIGHT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_right"), new BlockItem(ARROW_RIGHT, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_LEFT_RIGHT = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_left_right"), ARROW_LEFT_RIGHT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_left_right"), new BlockItem(ARROW_LEFT_RIGHT, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_FORWARD_LEFT = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_forward_left"), ARROW_FORWARD_LEFT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_forward_left"), new BlockItem(ARROW_FORWARD_LEFT, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_FORWARD_RIGHT = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_forward_right"), ARROW_FORWARD_RIGHT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_forward_right"), new BlockItem(ARROW_FORWARD_RIGHT, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_FORWARD_LEFT_RIGHT = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_forward_left_right"), ARROW_FORWARD_LEFT_RIGHT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_forward_left_right"), new BlockItem(ARROW_FORWARD_LEFT_RIGHT, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_BACK_1 = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_back_1"), ARROW_BACK_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_back_1"), new BlockItem(ARROW_BACK_1, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_BACK_2 = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_back_2"), ARROW_BACK_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_back_2"), new BlockItem(ARROW_BACK_2, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_FORWARD_BACK_1 = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_forward_back_1"), ARROW_FORWARD_BACK_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_forward_back_1"), new BlockItem(ARROW_FORWARD_BACK_1, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_FORWARD_BACK_2 = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_forward_back_2"), ARROW_FORWARD_BACK_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_forward_back_2"), new BlockItem(ARROW_FORWARD_BACK_2, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_LEFT_BACK_1 = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_left_back_1"), ARROW_LEFT_BACK_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_left_back_1"), new BlockItem(ARROW_LEFT_BACK_1, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_LEFT_BACK_2 = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_left_back_2"), ARROW_LEFT_BACK_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_left_back_2"), new BlockItem(ARROW_LEFT_BACK_2, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_RIGHT_BACK_1 = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_right_back_1"), ARROW_RIGHT_BACK_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_right_back_1"), new BlockItem(ARROW_RIGHT_BACK_1, new Item.Settings()));
    }

    public static final ArrowBlock ARROW_RIGHT_BACK_2 = new ArrowBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "arrow_right_back_2"), ARROW_RIGHT_BACK_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "arrow_right_back_2"), new BlockItem(ARROW_RIGHT_BACK_2, new Item.Settings()));
    }

    /*public static final CustomGroundSignBlock CUSTOM_GROUND_SIGN = new CustomGroundSignBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(0f, 1f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "custom_ground_sign"), CUSTOM_GROUND_SIGN);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "custom_ground_sign"), new BlockItem(CUSTOM_GROUND_SIGN, new Item.Settings()));
    }*/

    public static final SecondAnniversaryBlockBlock SECOND_ANNIVERSARY_BLOCK = new SecondAnniversaryBlockBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 100f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "second_anniversary_block"), SECOND_ANNIVERSARY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "second_anniversary_block"), new BlockItem(SECOND_ANNIVERSARY_BLOCK, new Item.Settings()));
    }

    public static final Block CERAMIC_TILE_1 = new Block
            (FabricBlockSettings.of(Material.GLASS, MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ceramic_tiles_1"), CERAMIC_TILE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ceramic_tiles_1"), new BlockItem(CERAMIC_TILE_1, new Item.Settings()));
    }

    public static final Block CERAMIC_TILE_2 = new Block
            (FabricBlockSettings.of(Material.GLASS, MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ceramic_tiles_2"), CERAMIC_TILE_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ceramic_tiles_2"), new BlockItem(CERAMIC_TILE_2, new Item.Settings()));
    }

    public static final Block TERRAZZO_1 = new Block
            (FabricBlockSettings.of(Material.GLASS, MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "terrazzo_1"), TERRAZZO_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "terrazzo_1"), new BlockItem(TERRAZZO_1, new Item.Settings()));
    }

    public static final Block TERRAZZO_2 = new Block
            (FabricBlockSettings.of(Material.GLASS, MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "terrazzo_2"), TERRAZZO_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "terrazzo_2"), new BlockItem(TERRAZZO_2, new Item.Settings()));
    }

    public static final Block TERRAZZO_3 = new Block
            (FabricBlockSettings.of(Material.GLASS, MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "terrazzo_3"), TERRAZZO_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "terrazzo_3"), new BlockItem(TERRAZZO_3, new Item.Settings()));
    }

    public static final Block FINE_SLATES = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "fine_slates"), FINE_SLATES);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "fine_slates"), new BlockItem(FINE_SLATES, new Item.Settings()));
    }

    public static final SlabBlock FINE_SLATES_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "fine_slates_slab"), FINE_SLATES_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "fine_slates_slab"), new BlockItem(FINE_SLATES_SLAB, new Item.Settings()));
    }

    public static final Block BLACK_BRICKS = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "black_bricks"), BLACK_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "black_bricks"), new BlockItem(BLACK_BRICKS, new Item.Settings()));
    }

    public static final SlabBlock BLACK_BRICKS_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "black_bricks_slab"), BLACK_BRICKS_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "black_bricks_slab"), new BlockItem(BLACK_BRICKS_SLAB, new Item.Settings()));
    }

    public static final Block GRAY_BRICKS = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "gray_bricks"), GRAY_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "gray_bricks"), new BlockItem(GRAY_BRICKS, new Item.Settings()));
    }

    public static final SlabBlock GRAY_BRICKS_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "gray_bricks_slab"), GRAY_BRICKS_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "gray_bricks_slab"), new BlockItem(GRAY_BRICKS_SLAB, new Item.Settings()));
    }

    public static final Block LIGHT_GRAY_BRICKS = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "light_gray_bricks"), LIGHT_GRAY_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "light_gray_bricks"), new BlockItem(LIGHT_GRAY_BRICKS, new Item.Settings()));
    }

    public static final SlabBlock LIGHT_GRAY_BRICKS_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "light_gray_bricks_slab"), LIGHT_GRAY_BRICKS_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "light_gray_bricks_slab"), new BlockItem(LIGHT_GRAY_BRICKS_SLAB, new Item.Settings()));
    }

    public static final Block WHITE_BRICKS = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_bricks"), WHITE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_bricks"), new BlockItem(WHITE_BRICKS, new Item.Settings()));
    }

    public static final SlabBlock WHITE_BRICKS_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.WHITE).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "white_bricks_slab"), WHITE_BRICKS_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "white_bricks_slab"), new BlockItem(WHITE_BRICKS_SLAB, new Item.Settings()));
    }

    public static final Block BEIGE_BRICKS = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_YELLOW).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "beige_bricks"), BEIGE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "beige_bricks"), new BlockItem(BEIGE_BRICKS, new Item.Settings()));
    }

    public static final SlabBlock BEIGE_BRICKS_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_YELLOW).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "beige_bricks_slab"), BEIGE_BRICKS_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "beige_bricks_slab"), new BlockItem(BEIGE_BRICKS_SLAB, new Item.Settings()));
    }

    public static final BlindSidewalkBlockBlock BLIND_SIDEWALK_BLOCK = new BlindSidewalkBlockBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "blind_sidewalk_block"), BLIND_SIDEWALK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "blind_sidewalk_block"), new BlockItem(BLIND_SIDEWALK_BLOCK, new Item.Settings()));
    }

    public static final BlindSidewalkSlabBlock BLIND_SIDEWALK_SLAB = new BlindSidewalkSlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "blind_sidewalk_slab"), BLIND_SIDEWALK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "blind_sidewalk_slab"), new BlockItem(BLIND_SIDEWALK_SLAB, new Item.Settings()));
    }

    public static final BlindSidewalkBlockBlock BLIND_SIDEWALK_BLOCK_CORNER = new BlindSidewalkBlockBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "blind_sidewalk_block_corner"), BLIND_SIDEWALK_BLOCK_CORNER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "blind_sidewalk_block_corner"), new BlockItem(BLIND_SIDEWALK_BLOCK_CORNER, new Item.Settings()));
    }

    public static final BlindSidewalkSlabBlock BLIND_SIDEWALK_SLAB_CORNER = new BlindSidewalkSlabBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "blind_sidewalk_slab_corner"), BLIND_SIDEWALK_SLAB_CORNER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "blind_sidewalk_slab_corner"), new BlockItem(BLIND_SIDEWALK_SLAB_CORNER, new Item.Settings()));
    }

    public static final PathBlock STONE_PATH = new PathBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "stone_path"), STONE_PATH);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "stone_path"), new BlockItem(STONE_PATH, new Item.Settings()));
    }

    public static final PathBlock COBBLESTONE_PATH = new PathBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "cobblestone_path"), COBBLESTONE_PATH);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "cobblestone_path"), new BlockItem(COBBLESTONE_PATH, new Item.Settings()));
    }

    public static final PathBlock STONE_BRICKS_PATH = new PathBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "stone_bricks_path"), STONE_BRICKS_PATH);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "stone_bricks_path"), new BlockItem(STONE_BRICKS_PATH, new Item.Settings()));
    }

    public static final AmazingBlockBlock AMAZING_BLOCK = new AmazingBlockBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f, 100f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "amazing_block"), AMAZING_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "amazing_block"), new BlockItem(AMAZING_BLOCK, new Item.Settings()));
    }

    public static final Block GREEN_BELT = new Block
            (FabricBlockSettings.of(Material.STONE, MapColor.BROWN).sounds(BlockSoundGroup.GRASS).strength(1f, 3f));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "green_belt"), GREEN_BELT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "green_belt"), new BlockItem(GREEN_BELT, new Item.Settings()));
    }

    public static final ModernIronBarsBlock MODERN_IRON_BARS = new ModernIronBarsBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "modern_iron_bars"), MODERN_IRON_BARS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "modern_iron_bars"), new BlockItem(MODERN_IRON_BARS, new Item.Settings()));
    }

    public static final WarningColumnBlock WARNING_COLUMN = new WarningColumnBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "warning_column"), WARNING_COLUMN);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "warning_column"), new BlockItem(WARNING_COLUMN, new Item.Settings()));
    }

    public static final TrafficBollardBlock TRAFFIC_BOLLARD = new TrafficBollardBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_bollard"), TRAFFIC_BOLLARD);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_bollard"), new BlockItem(TRAFFIC_BOLLARD, new Item.Settings()));
    }

    public static final TrashBinPlasticBlock TRASH_BIN_PLASTIC = new TrashBinPlasticBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "trash_bin_plastic"), TRASH_BIN_PLASTIC);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "trash_bin_plastic"), new BlockItem(TRASH_BIN_PLASTIC, new Item.Settings()));
    }

    public static final TrashBinMetalBlock TRASH_BIN_METAL = new TrashBinMetalBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "trash_bin_metal"), TRASH_BIN_METAL);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "trash_bin_metal"), new BlockItem(TRASH_BIN_METAL, new Item.Settings()));
    }

    public static final ManholeCoverCircleBlock MANHOLE_COVER_CIRCLE = new ManholeCoverCircleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "manhole_cover_circle"), MANHOLE_COVER_CIRCLE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "manhole_cover_circle"), new BlockItem(MANHOLE_COVER_CIRCLE, new Item.Settings()));
    }

    public static final ManholeCoverSquareBlock MANHOLE_COVER_SQUARE = new ManholeCoverSquareBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "manhole_cover_square"), MANHOLE_COVER_SQUARE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "manhole_cover_square"), new BlockItem(MANHOLE_COVER_SQUARE, new Item.Settings()));
    }

    public static final TableTennisTableBlock TABLE_TENNIS_TABLE = new TableTennisTableBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "table_tennis_table"), TABLE_TENNIS_TABLE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "table_tennis_table"), new BlockItem(TABLE_TENNIS_TABLE, new Item.Settings()));
    }

    public static final ConstructionBarrierBlock BLUE_CONSTRUCTION_BARRIER = new ConstructionBarrierBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "blue_construction_barrier"), BLUE_CONSTRUCTION_BARRIER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "blue_construction_barrier"), new BlockItem(BLUE_CONSTRUCTION_BARRIER, new Item.Settings()));
    }

    public static final ConstructionBarrierBlock GREEN_CONSTRUCTION_BARRIER = new ConstructionBarrierBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "green_construction_barrier"), GREEN_CONSTRUCTION_BARRIER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "green_construction_barrier"), new BlockItem(GREEN_CONSTRUCTION_BARRIER, new Item.Settings()));
    }

    public static final ExpresswayGuardrailBlock EXPRESSWAY_GUARDRAIL_1 = new ExpresswayGuardrailBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "expressway_guardrail_1"), EXPRESSWAY_GUARDRAIL_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "expressway_guardrail_1"), new BlockItem(EXPRESSWAY_GUARDRAIL_1, new Item.Settings()));
    }

    public static final ExpresswayGuardrailBlock EXPRESSWAY_GUARDRAIL_2 = new ExpresswayGuardrailBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "expressway_guardrail_2"), EXPRESSWAY_GUARDRAIL_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "expressway_guardrail_2"), new BlockItem(EXPRESSWAY_GUARDRAIL_2, new Item.Settings()));
    }

    public static final ExpresswayGuardrailBlock EXPRESSWAY_GUARDRAIL_3 = new ExpresswayGuardrailBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "expressway_guardrail_3"), EXPRESSWAY_GUARDRAIL_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "expressway_guardrail_3"), new BlockItem(EXPRESSWAY_GUARDRAIL_3, new Item.Settings()));
    }

    public static final ExpresswayGuardrailBlock EXPRESSWAY_GUARDRAIL_4 = new ExpresswayGuardrailBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "expressway_guardrail_4"), EXPRESSWAY_GUARDRAIL_4);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "expressway_guardrail_4"), new BlockItem(EXPRESSWAY_GUARDRAIL_4, new Item.Settings()));
    }

    public static final ExpresswayGuardrailBlock EXPRESSWAY_GUARDRAIL_BLUE_1 = new ExpresswayGuardrailBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "expressway_guardrail_blue_1"), EXPRESSWAY_GUARDRAIL_BLUE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "expressway_guardrail_blue_1"), new BlockItem(EXPRESSWAY_GUARDRAIL_BLUE_1, new Item.Settings()));
    }

    public static final ExpresswayGuardrailBlock EXPRESSWAY_GUARDRAIL_BLUE_2 = new ExpresswayGuardrailBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "expressway_guardrail_blue_2"), EXPRESSWAY_GUARDRAIL_BLUE_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "expressway_guardrail_blue_2"), new BlockItem(EXPRESSWAY_GUARDRAIL_BLUE_2, new Item.Settings()));
    }

    public static final ExpresswayGuardrailBlock EXPRESSWAY_GUARDRAIL_BLUE_3 = new ExpresswayGuardrailBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "expressway_guardrail_blue_3"), EXPRESSWAY_GUARDRAIL_BLUE_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "expressway_guardrail_blue_3"), new BlockItem(EXPRESSWAY_GUARDRAIL_BLUE_3, new Item.Settings()));
    }

    public static final ExpresswayGuardrailBlock EXPRESSWAY_GUARDRAIL_BLUE_4 = new ExpresswayGuardrailBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "expressway_guardrail_blue_4"), EXPRESSWAY_GUARDRAIL_BLUE_4);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "expressway_guardrail_blue_4"), new BlockItem(EXPRESSWAY_GUARDRAIL_BLUE_4, new Item.Settings()));
    }

    public static final CrownBlock CROWN = new CrownBlock
            (FabricBlockSettings.of(Material.STONE, MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "crown"), CROWN);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "crown"), new BlockItem(CROWN, new Item.Settings()));
    }

    public static final CarStopperBlock CAR_STOPPER = new CarStopperBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "car_stopper"), CAR_STOPPER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "car_stopper"), new BlockItem(CAR_STOPPER, new Item.Settings()));
    }

    public static final ParkingLockBlock PARKING_LOCK = new ParkingLockBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "parking_lock"), PARKING_LOCK);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "parking_lock"), new BlockItem(PARKING_LOCK, new Item.Settings()));
    }

    public static final ElevatedRoadGuardrail1Block ELEVATED_ROAD_GUARDRAIL_1 = new ElevatedRoadGuardrail1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "elevated_road_guardrail_1"), ELEVATED_ROAD_GUARDRAIL_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "elevated_road_guardrail_1"), new BlockItem(ELEVATED_ROAD_GUARDRAIL_1, new Item.Settings()));
    }

    public static final ElevatedRoadGuardrail1Block ELEVATED_ROAD_GUARDRAIL_1_BLUE = new ElevatedRoadGuardrail1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "elevated_road_guardrail_1_blue"), ELEVATED_ROAD_GUARDRAIL_1_BLUE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "elevated_road_guardrail_1_blue"), new BlockItem(ELEVATED_ROAD_GUARDRAIL_1_BLUE, new Item.Settings()));
    }

    public static final SoundInsulationBoard1Block SOUND_INSULATION_BOARD_1 = new SoundInsulationBoard1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sound_insulation_board_1"), SOUND_INSULATION_BOARD_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sound_insulation_board_1"), new BlockItem(SOUND_INSULATION_BOARD_1, new Item.Settings()));
    }

    public static final TrafficSignPole1Block TRAFFIC_SIGN_POLE_1 = new TrafficSignPole1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_sign_pole_1"), TRAFFIC_SIGN_POLE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_sign_pole_1"), new BlockItem(TRAFFIC_SIGN_POLE_1, new Item.Settings()));
    }

    public static final TrafficSignSupportFrame1Block TRAFFIC_SIGN_SUPPORT_FRAME_1 = new TrafficSignSupportFrame1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_sign_support_frame_1"), TRAFFIC_SIGN_SUPPORT_FRAME_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_sign_support_frame_1"), new BlockItem(TRAFFIC_SIGN_SUPPORT_FRAME_1, new Item.Settings()));
    }

    public static final TrafficSignSupportFrame2Block TRAFFIC_SIGN_SUPPORT_FRAME_2 = new TrafficSignSupportFrame2Block
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_sign_support_frame_2"), TRAFFIC_SIGN_SUPPORT_FRAME_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_sign_support_frame_2"), new BlockItem(TRAFFIC_SIGN_SUPPORT_FRAME_2, new Item.Settings()));
    }

    public static final TrafficSignSupportFrame3Block TRAFFIC_SIGN_SUPPORT_FRAME_3 = new TrafficSignSupportFrame3Block
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_sign_support_frame_3"), TRAFFIC_SIGN_SUPPORT_FRAME_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_sign_support_frame_3"), new BlockItem(TRAFFIC_SIGN_SUPPORT_FRAME_3, new Item.Settings()));
    }

    public static final TrafficSignSupportFrame4Block TRAFFIC_SIGN_SUPPORT_FRAME_4 = new TrafficSignSupportFrame4Block
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_sign_support_frame_4"), TRAFFIC_SIGN_SUPPORT_FRAME_4);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_sign_support_frame_4"), new BlockItem(TRAFFIC_SIGN_SUPPORT_FRAME_4, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_S = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_s"), SQUARE_TRAFFIC_SIGN_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_s"), new BlockItem(SQUARE_TRAFFIC_SIGN_S, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_L = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_l"), SQUARE_TRAFFIC_SIGN_L);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_l"), new BlockItem(SQUARE_TRAFFIC_SIGN_L, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_R = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_r"), SQUARE_TRAFFIC_SIGN_R);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_r"), new BlockItem(SQUARE_TRAFFIC_SIGN_R, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_LR = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_lr"), SQUARE_TRAFFIC_SIGN_LR);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_lr"), new BlockItem(SQUARE_TRAFFIC_SIGN_LR, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_SL = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_sl"), SQUARE_TRAFFIC_SIGN_SL);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_sl"), new BlockItem(SQUARE_TRAFFIC_SIGN_SL, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_SR = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_sr"), SQUARE_TRAFFIC_SIGN_SR);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_sr"), new BlockItem(SQUARE_TRAFFIC_SIGN_SR, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_SLR = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_slr"), SQUARE_TRAFFIC_SIGN_SLR);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_slr"), new BlockItem(SQUARE_TRAFFIC_SIGN_SLR, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_UT = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_ut"), SQUARE_TRAFFIC_SIGN_UT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_ut"), new BlockItem(SQUARE_TRAFFIC_SIGN_UT, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_UT_2 = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_ut_2"), SQUARE_TRAFFIC_SIGN_UT_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_ut_2"), new BlockItem(SQUARE_TRAFFIC_SIGN_UT_2, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_SUT = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_sut"), SQUARE_TRAFFIC_SIGN_SUT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_sut"), new BlockItem(SQUARE_TRAFFIC_SIGN_SUT, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_SUT_2 = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_sut_2"), SQUARE_TRAFFIC_SIGN_SUT_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_sut_2"), new BlockItem(SQUARE_TRAFFIC_SIGN_SUT_2, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_LUT = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_lut"), SQUARE_TRAFFIC_SIGN_LUT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_lut"), new BlockItem(SQUARE_TRAFFIC_SIGN_LUT, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_LUT_2 = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_lut_2"), SQUARE_TRAFFIC_SIGN_LUT_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_lut_2"), new BlockItem(SQUARE_TRAFFIC_SIGN_LUT_2, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_RUT = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_rut"), SQUARE_TRAFFIC_SIGN_RUT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_rut"), new BlockItem(SQUARE_TRAFFIC_SIGN_RUT, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_RUT_2 = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "square_traffic_sign_rut_2"), SQUARE_TRAFFIC_SIGN_RUT_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "square_traffic_sign_rut_2"), new BlockItem(SQUARE_TRAFFIC_SIGN_RUT_2, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_5 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_5"), SPEED_LIMIT_SIGN_5);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_5"), new BlockItem(SPEED_LIMIT_SIGN_5, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_10 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_10"), SPEED_LIMIT_SIGN_10);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_10"), new BlockItem(SPEED_LIMIT_SIGN_10, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_20 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_20"), SPEED_LIMIT_SIGN_20);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_20"), new BlockItem(SPEED_LIMIT_SIGN_20, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_30 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_30"), SPEED_LIMIT_SIGN_30);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_30"), new BlockItem(SPEED_LIMIT_SIGN_30, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_40 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_40"), SPEED_LIMIT_SIGN_40);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_40"), new BlockItem(SPEED_LIMIT_SIGN_40, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_50 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_50"), SPEED_LIMIT_SIGN_50);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_50"), new BlockItem(SPEED_LIMIT_SIGN_50, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_60 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_60"), SPEED_LIMIT_SIGN_60);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_60"), new BlockItem(SPEED_LIMIT_SIGN_60, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_70 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_70"), SPEED_LIMIT_SIGN_70);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_70"), new BlockItem(SPEED_LIMIT_SIGN_70, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_80 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_80"), SPEED_LIMIT_SIGN_80);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_80"), new BlockItem(SPEED_LIMIT_SIGN_80, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_90 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_90"), SPEED_LIMIT_SIGN_90);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_90"), new BlockItem(SPEED_LIMIT_SIGN_90, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_100 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_100"), SPEED_LIMIT_SIGN_100);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_100"), new BlockItem(SPEED_LIMIT_SIGN_100, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_110 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_110"), SPEED_LIMIT_SIGN_110);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_110"), new BlockItem(SPEED_LIMIT_SIGN_110, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_120 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "speed_limit_sign_120"), SPEED_LIMIT_SIGN_120);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "speed_limit_sign_120"), new BlockItem(SPEED_LIMIT_SIGN_120, new Item.Settings()));
    }

    public static final TrafficLightsForward1Block TRAFFIC_LIGHTS_FORWARD_1 = new TrafficLightsForward1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 5f).luminance(15).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_lights_forward_1"), TRAFFIC_LIGHTS_FORWARD_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_lights_forward_1"), new BlockItem(TRAFFIC_LIGHTS_FORWARD_1, new Item.Settings()));
    }

    public static final TrafficLightsLeft1Block TRAFFIC_LIGHTS_LEFT_1 = new TrafficLightsLeft1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 5f).luminance(15).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_lights_left_1"), TRAFFIC_LIGHTS_LEFT_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_lights_left_1"), new BlockItem(TRAFFIC_LIGHTS_LEFT_1, new Item.Settings()));
    }

    public static final TrafficLightsRight1Block TRAFFIC_LIGHTS_RIGHT_1 = new TrafficLightsRight1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 5f).luminance(15).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "traffic_lights_right_1"), TRAFFIC_LIGHTS_RIGHT_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "traffic_lights_right_1"), new BlockItem(TRAFFIC_LIGHTS_RIGHT_1, new Item.Settings()));
    }

    public static final ThinPoleBlock THIN_POLE_BLUE = new ThinPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "thin_pole_blue"), THIN_POLE_BLUE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "thin_pole_blue"), new BlockItem(THIN_POLE_BLUE, new Item.Settings()));
    }

    public static final ThinPoleBlock THIN_POLE_GRAY = new ThinPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GRAY).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "thin_pole_gray"), THIN_POLE_GRAY);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "thin_pole_gray"), new BlockItem(THIN_POLE_GRAY, new Item.Settings()));
    }

    public static final ThinPoleBlock THIN_POLE_WHITE = new ThinPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "thin_pole_white"), THIN_POLE_WHITE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "thin_pole_white"), new BlockItem(THIN_POLE_WHITE, new Item.Settings()));
    }

    public static final MediumPoleBlock MEDIUM_POLE_BLUE = new MediumPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "medium_pole_blue"), MEDIUM_POLE_BLUE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "medium_pole_blue"), new BlockItem(MEDIUM_POLE_BLUE, new Item.Settings()));
    }

    public static final MediumPoleBlock MEDIUM_POLE_GRAY = new MediumPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GRAY).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "medium_pole_gray"), MEDIUM_POLE_GRAY);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "medium_pole_gray"), new BlockItem(MEDIUM_POLE_GRAY, new Item.Settings()));
    }

    public static final MediumPoleBlock MEDIUM_POLE_WHITE = new MediumPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "medium_pole_white"), MEDIUM_POLE_WHITE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "medium_pole_white"), new BlockItem(MEDIUM_POLE_WHITE, new Item.Settings()));
    }

    public static final ThickPoleBlock THICK_POLE_BLUE = new ThickPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "thick_pole_blue"), THICK_POLE_BLUE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "thick_pole_blue"), new BlockItem(THICK_POLE_BLUE, new Item.Settings()));
    }

    public static final ThickPoleBlock THICK_POLE_GRAY = new ThickPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GRAY).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "thick_pole_gray"), THICK_POLE_GRAY);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "thick_pole_gray"), new BlockItem(THICK_POLE_GRAY, new Item.Settings()));
    }

    public static final ThickPoleBlock THICK_POLE_WHITE = new ThickPoleBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "thick_pole_white"), THICK_POLE_WHITE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "thick_pole_white"), new BlockItem(THICK_POLE_WHITE, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_D_BL = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_d_bl"), SIGN_D_BL);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_d_bl"), new BlockItem(SIGN_D_BL, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_D_BR = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_d_br"), SIGN_D_BR);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_d_br"), new BlockItem(SIGN_D_BR, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_D_CAR = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_d_car"), SIGN_D_CAR);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_d_car"), new BlockItem(SIGN_D_CAR, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_D_CAR_BL = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_d_car_bl"), SIGN_D_CAR_BL);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_d_car_bl"), new BlockItem(SIGN_D_CAR_BL, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_D_CAR_BR = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_d_car_br"), SIGN_D_CAR_BR);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_d_car_br"), new BlockItem(SIGN_D_CAR_BR, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_D_BICYCLE = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_d_bicycle"), SIGN_D_BICYCLE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_d_bicycle"), new BlockItem(SIGN_D_BICYCLE, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_D_BICYCLE_BL = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_d_bicycle_bl"), SIGN_D_BICYCLE_BL);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_d_bicycle_bl"), new BlockItem(SIGN_D_BICYCLE_BL, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_D_BICYCLE_BR = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_d_bicycle_br"), SIGN_D_BICYCLE_BR);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_d_bicycle_br"), new BlockItem(SIGN_D_BICYCLE_BR, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_ROUNDABOUT = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_roundabout"), SIGN_ROUNDABOUT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_roundabout"), new BlockItem(SIGN_ROUNDABOUT, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_HONKING = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_honking"), SIGN_HONKING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_honking"), new BlockItem(SIGN_HONKING, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_PARKING_1 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_parking_1"), SIGN_PARKING_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_parking_1"), new BlockItem(SIGN_PARKING_1, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_PARKING_2 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_parking_2"), SIGN_PARKING_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_parking_2"), new BlockItem(SIGN_PARKING_2, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_NO_U_TURNS = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_no_u_turns"), SIGN_NO_U_TURNS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_no_u_turns"), new BlockItem(SIGN_NO_U_TURNS, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_NO_CARS = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_no_cars"), SIGN_NO_CARS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_no_cars"), new BlockItem(SIGN_NO_CARS, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_NO_BICYCLES = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_no_bicycles"), SIGN_NO_BICYCLES);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_no_bicycles"), new BlockItem(SIGN_NO_BICYCLES, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_NO_PEDESTRIANS = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_no_pedestrians"), SIGN_NO_PEDESTRIANS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_no_pedestrians"), new BlockItem(SIGN_NO_PEDESTRIANS, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_NO_HONKING = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_no_honking"), SIGN_NO_HONKING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_no_honking"), new BlockItem(SIGN_NO_HONKING, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_NO_DRIVING = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_no_driving"), SIGN_NO_DRIVING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_no_driving"), new BlockItem(SIGN_NO_DRIVING, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_NO_PARKING = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_no_parking"), SIGN_NO_PARKING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_no_parking"), new BlockItem(SIGN_NO_PARKING, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SIGN_NO_STOPPING = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_no_stopping"), SIGN_NO_STOPPING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_no_stopping"), new BlockItem(SIGN_NO_STOPPING, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger"), SIGN_DANGER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger"), new BlockItem(SIGN_DANGER, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_BICYCLES = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_bicycles"), SIGN_DANGER_BICYCLES);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_bicycles"), new BlockItem(SIGN_DANGER_BICYCLES, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_SIGNALS = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_signals"), SIGN_DANGER_SIGNALS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_signals"), new BlockItem(SIGN_DANGER_SIGNALS, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_CHILDREN = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_children"), SIGN_DANGER_CHILDREN);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_children"), new BlockItem(SIGN_DANGER_CHILDREN, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_PEDESTRIANS = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_pedestrians"), SIGN_DANGER_PEDESTRIANS);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_pedestrians"), new BlockItem(SIGN_DANGER_PEDESTRIANS, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_CROSSWALK = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_crosswalk"), SIGN_DANGER_CROSSWALK);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_crosswalk"), new BlockItem(SIGN_DANGER_CROSSWALK, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_CONSTRUCTION = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_construction"), SIGN_DANGER_CONSTRUCTION);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_construction"), new BlockItem(SIGN_DANGER_CONSTRUCTION, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_TUNNEL = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_tunnel"), SIGN_DANGER_TUNNEL);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_tunnel"), new BlockItem(SIGN_DANGER_TUNNEL, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_UNEVEN_ROAD = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_uneven_road"), SIGN_DANGER_UNEVEN_ROAD);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_uneven_road"), new BlockItem(SIGN_DANGER_UNEVEN_ROAD, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_ROAD_NARROWING = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_road_narrowing"), SIGN_DANGER_ROAD_NARROWING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_road_narrowing"), new BlockItem(SIGN_DANGER_ROAD_NARROWING, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_LEFT_ROAD_NARROWING = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_left_road_narrowing"), SIGN_DANGER_LEFT_ROAD_NARROWING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_left_road_narrowing"), new BlockItem(SIGN_DANGER_LEFT_ROAD_NARROWING, new Item.Settings()));
    }

    public static final TriangleTrafficSignBlock SIGN_DANGER_RIGHT_ROAD_NARROWING = new TriangleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "sign_danger_right_road_narrowing"), SIGN_DANGER_RIGHT_ROAD_NARROWING);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "sign_danger_right_road_narrowing"), new BlockItem(SIGN_DANGER_RIGHT_ROAD_NARROWING, new Item.Settings()));
    }

    /*public static final RoadSignBlock ROAD_SIGN_1 = new RoadSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","road_sign_1"), ROAD_SIGN_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft","road_sign_1"), new BlockItem(ROAD_SIGN_1, new Item.Settings()));
    }*/

    public static final RoadLight1Block ROAD_LIGHT_WHITE_1 = new RoadLight1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 5f).luminance(15).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "road_light_white_1"), ROAD_LIGHT_WHITE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "road_light_white_1"), new BlockItem(ROAD_LIGHT_WHITE_1, new Item.Settings()));
    }

    public static final RoadLight1Block ROAD_LIGHT_GRAY_1 = new RoadLight1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.GRAY).sounds(BlockSoundGroup.METAL).strength(1f, 5f).luminance(15).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "road_light_gray_1"), ROAD_LIGHT_GRAY_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "road_light_gray_1"), new BlockItem(ROAD_LIGHT_GRAY_1, new Item.Settings()));
    }

    public static final TunnelBlowerBlock TUNNEL_BLOWER = new TunnelBlowerBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.GRAY).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "tunnel_blower"), TUNNEL_BLOWER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "tunnel_blower"), new BlockItem(TUNNEL_BLOWER, new Item.Settings()));
    }

    public static final TunnelLight1Block TUNNEL_LIGHT_1 = new TunnelLight1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.GRAY).sounds(BlockSoundGroup.METAL).strength(1f, 5f).luminance(15).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "tunnel_light_1"), TUNNEL_LIGHT_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "tunnel_light_1"), new BlockItem(TUNNEL_LIGHT_1, new Item.Settings()));
    }

    public static final TunnelLight2Block TUNNEL_LIGHT_2 = new TunnelLight2Block
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 5f).luminance(15).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "tunnel_light_2"), TUNNEL_LIGHT_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "tunnel_light_2"), new BlockItem(TUNNEL_LIGHT_2, new Item.Settings()));
    }

    public static final TunnelEmergencyTelephoneBlock TUNNEL_EMERGENCY_TELEPHONE = new TunnelEmergencyTelephoneBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "tunnel_emergency_telephone"), TUNNEL_EMERGENCY_TELEPHONE);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "tunnel_emergency_telephone"), new BlockItem(TUNNEL_EMERGENCY_TELEPHONE, new Item.Settings()));
    }

    public static final FireExtinguisherBlock FIRE_EXTINGUISHER = new FireExtinguisherBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "fire_extinguisher"), FIRE_EXTINGUISHER);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "fire_extinguisher"), new BlockItem(FIRE_EXTINGUISHER, new Item.Settings()));
    }

    public static final FireHydrantBlock FIRE_HYDRANT = new FireHydrantBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.RED).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "fire_hydrant"), FIRE_HYDRANT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "fire_hydrant"), new BlockItem(FIRE_HYDRANT, new Item.Settings()));
    }

    public static final Lantern1Block LANTERN_1 = new Lantern1Block
            (FabricBlockSettings.of(Material.WOOL, MapColor.RED).sounds(BlockSoundGroup.WOOL).strength(1f, 1f).luminance(15));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "lantern_1"), LANTERN_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "lantern_1"), new BlockItem(LANTERN_1, new Item.Settings()));
    }

    public static final OverheadCatenarySupportFrameBlock OVERHEAD_CATENARY_SUPPORT_FRAME = new OverheadCatenarySupportFrameBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_support_frame_1"), OVERHEAD_CATENARY_SUPPORT_FRAME);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_support_frame_1"), new BlockItem(OVERHEAD_CATENARY_SUPPORT_FRAME, new Item.Settings()));
    }

    public static final OverheadCatenaryPole1Block OVERHEAD_CATENARY_SUPPORT_POLE_1 = new OverheadCatenaryPole1Block
            (FabricBlockSettings.of(Material.METAL, MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_support_pole_1"), OVERHEAD_CATENARY_SUPPORT_POLE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_support_pole_1"), new BlockItem(OVERHEAD_CATENARY_SUPPORT_POLE_1, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_1 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_1"), OVERHEAD_CATENARY_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_1"), new BlockItem(OVERHEAD_CATENARY_1, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_2 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_2"), OVERHEAD_CATENARY_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_2"), new BlockItem(OVERHEAD_CATENARY_2, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_3 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_3"), OVERHEAD_CATENARY_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_3"), new BlockItem(OVERHEAD_CATENARY_3, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_4 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_4"), OVERHEAD_CATENARY_4);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_4"), new BlockItem(OVERHEAD_CATENARY_4, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_5 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_5"), OVERHEAD_CATENARY_5);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_5"), new BlockItem(OVERHEAD_CATENARY_5, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_6 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_6"), OVERHEAD_CATENARY_6);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_6"), new BlockItem(OVERHEAD_CATENARY_6, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_7 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_7"), OVERHEAD_CATENARY_7);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_7"), new BlockItem(OVERHEAD_CATENARY_7, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_8 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_8"), OVERHEAD_CATENARY_8);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_8"), new BlockItem(OVERHEAD_CATENARY_8, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_9 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_9"), OVERHEAD_CATENARY_9);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_9"), new BlockItem(OVERHEAD_CATENARY_9, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_10 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL, MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f, 3f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "overhead_catenary_10"), OVERHEAD_CATENARY_10);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "overhead_catenary_10"), new BlockItem(OVERHEAD_CATENARY_10, new Item.Settings()));
    }


    public static final Item MONEY_UNIT_1 = new Item(new FabricItemSettings().maxCount(100));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "money_unit_1"), MONEY_UNIT_1);
    }

    public static final Item MONEY_UNIT_5 = new Item(new FabricItemSettings().maxCount(50));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "money_unit_5"), MONEY_UNIT_5);
    }

    public static final Item MONEY_UNIT_10 = new Item(new FabricItemSettings().maxCount(50));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "money_unit_10"), MONEY_UNIT_10);
    }

    public static final Item MONEY_UNIT_20 = new Item(new FabricItemSettings().maxCount(50));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "money_unit_20"), MONEY_UNIT_20);
    }

    public static final Item MONEY_UNIT_50 = new Item(new FabricItemSettings().maxCount(50));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "money_unit_50"), MONEY_UNIT_50);
    }

    public static final Item MONEY_UNIT_100 = new Item(new FabricItemSettings().maxCount(50));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "money_unit_100"), MONEY_UNIT_100);
    }

    public static final ConversionStickItem CONVERSION_STICK = new ConversionStickItem(new FabricItemSettings().maxCount(1));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "conversion_stick"), CONVERSION_STICK);
    }

    public static final ATipFromXiaoYaoItem A_TIP_FROM_XIAO_YAO = new ATipFromXiaoYaoItem(new FabricItemSettings().maxCount(1));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "a_tip_from_xiao_yao"), A_TIP_FROM_XIAO_YAO);
    }

    public static final Item TEST = new Item(new FabricItemSettings().food(ENCHANTED_GOLDEN_APPLE).maxCount(1));

    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "test"), TEST);
    }

    public static final PictureDisplayPlatformBlock PICTURE_DISPLAY_PLATFORM = new PictureDisplayPlatformBlock
            (FabricBlockSettings.of(Material.WOOD, MapColor.BROWN).sounds(BlockSoundGroup.STONE).strength(1f, 5f).requiresTool());

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "picture_display_platform"), PICTURE_DISPLAY_PLATFORM);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "picture_display_platform"), new BlockItem(PICTURE_DISPLAY_PLATFORM, new Item.Settings()));
    }

/*
    public static final RedstoneWireBlock TEST_1 = new RedstoneWireBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","test_1"), TEST_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft","test_1"), new BlockItem(TEST_1, new Item.Settings()));
    }
*/


    public static final BlockEntityType<TrafficLightsForward1BlockEntity> TRAFFIC_LIGHTS_FORWARD_1_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier("citycraft", "traffic_lights_forward_1_entity"),
            FabricBlockEntityTypeBuilder.create(TrafficLightsForward1BlockEntity::new, TRAFFIC_LIGHTS_FORWARD_1).build()
    );

    public static final BlockEntityType<TrafficLightsLeft1BlockEntity> TRAFFIC_LIGHTS_LEFT_1_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier("citycraft", "traffic_lights_left_1_entity"),
            FabricBlockEntityTypeBuilder.create(TrafficLightsLeft1BlockEntity::new, TRAFFIC_LIGHTS_LEFT_1).build()
    );

    public static final BlockEntityType<TrafficLightsRight1BlockEntity> TRAFFIC_LIGHTS_RIGHT_1_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier("citycraft", "traffic_lights_right_1_entity"),
            FabricBlockEntityTypeBuilder.create(TrafficLightsRight1BlockEntity::new, TRAFFIC_LIGHTS_RIGHT_1).build()
    );

    /*public static final BlockEntityType<RoadSignBlockEntity> ROAD_SIGN_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier("citycraft", "road_sign_entity"),
            FabricBlockEntityTypeBuilder.create(RoadSignBlockEntity::new, ROAD_SIGN_1).build()
    );*/

    {
        new CitycraftCommand();
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated, environment) -> CitycraftCommand.register(dispatcher));
    }

    {
        Registry.register(Registry.PAINTING_VARIANT, new Identifier("citycraft", "plain_1"), new PaintingVariant(48,32));
    }

    /*public static final BedBlock TEST_11 = new BedBlock(DyeColor.RED, AbstractBlock.Settings.of(Material.WOOD));

    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "test_11"), TEST_11);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "test_11"), new BlockItem(TEST_11, new Item.Settings()));
    }*/

    public static int TRAFFIC_LIGHTS_TIME = 0;

    {
        ServerTickEvents.END_SERVER_TICK.register((server) ->
        {
            TRAFFIC_LIGHTS_TIME = TRAFFIC_LIGHTS_TIME + 1;
            if (TRAFFIC_LIGHTS_TIME / 20 > 120) {
                TRAFFIC_LIGHTS_TIME = 0;
            }
        });
    }









    public static final ItemGroup CITYCRAFT_ROADS = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_roads"))
            .icon(() -> new ItemStack(CitycraftMod.ASPHALT))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.ASPHALT));
                stacks.add(new ItemStack(CitycraftMod.ASPHALT_RED));
                stacks.add(new ItemStack(CitycraftMod.ASPHALT_GREEN));
                stacks.add(new ItemStack(CitycraftMod.ASPHALT_BLUE));
                stacks.add(new ItemStack(CitycraftMod.ASPHALT_SLAB));
                stacks.add(new ItemStack(CitycraftMod.ASPHALT_LAYER));
                stacks.add(new ItemStack(CitycraftMod.ASPHALT_SLOPE_1));
                stacks.add(new ItemStack(CitycraftMod.ASPHALT_SLOPE_2));
                stacks.add(new ItemStack(CitycraftMod.ASPHALT_SLOPE_3));
                stacks.add(new ItemStack(CitycraftMod.CEMENT));
                stacks.add(new ItemStack(CitycraftMod.CEMENT_SLAB));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_S_M));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_S_S));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_D));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_C_R_S));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_C_R_M));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_C_R_L));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_C_S_S));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_C_S_M));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_C_C_M));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_SC_R_M));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_SC_S_S_L));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_SC_S_S_R));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_CROSS));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_S_M));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_S_S));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_D));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_C_R_S));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_C_R_M));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_C_R_L));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_C_S_S));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_C_S_M));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_C_C_M));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_SC_R_M));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_SC_S_S_L));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_SC_S_S_R));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_CROSS));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_DOUBLE_S));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_DOUBLE_S));
                stacks.add(new ItemStack(CitycraftMod.WHITE_LINE_DOUBLE_C));
                stacks.add(new ItemStack(CitycraftMod.YELLOW_LINE_DOUBLE_C));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_1));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_2));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_3));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_4));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_5));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_6));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_7));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_8));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_9));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_10));
                stacks.add(new ItemStack(CitycraftMod.DIVERSION_LINE_11));
                stacks.add(new ItemStack(CitycraftMod.NO_PARKING_LINE_1));
                stacks.add(new ItemStack(CitycraftMod.NO_PARKING_LINE_2));
                stacks.add(new ItemStack(CitycraftMod.NO_PARKING_LINE_3));
                stacks.add(new ItemStack(CitycraftMod.NO_PARKING_LINE_4));
                stacks.add(new ItemStack(CitycraftMod.NO_PARKING_LINE_5));
                stacks.add(new ItemStack(CitycraftMod.ZEBRA_CROSSING));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_ZEBRA_CROSSING_WARNING));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_PARKING));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_A));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_B));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_C));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_D));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_E));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_F));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_G));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_H));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_I));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_J));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_K));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_L));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_M));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_N));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_O));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_P));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_Q));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_R));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_S));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_T));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_U));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_V));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_W));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_X));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_Y));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_Z));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_0));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_1));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_2));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_3));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_4));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_5));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_6));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_7));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_8));
                stacks.add(new ItemStack(CitycraftMod.GROUND_SIGN_9));
                stacks.add(new ItemStack(CitycraftMod.ARROW_FORWARD));
                stacks.add(new ItemStack(CitycraftMod.ARROW_LEFT));
                stacks.add(new ItemStack(CitycraftMod.ARROW_RIGHT));
                stacks.add(new ItemStack(CitycraftMod.ARROW_LEFT_RIGHT));
                stacks.add(new ItemStack(CitycraftMod.ARROW_FORWARD_LEFT));
                stacks.add(new ItemStack(CitycraftMod.ARROW_FORWARD_RIGHT));
                stacks.add(new ItemStack(CitycraftMod.ARROW_FORWARD_LEFT_RIGHT));
                stacks.add(new ItemStack(CitycraftMod.ARROW_BACK_1));
                stacks.add(new ItemStack(CitycraftMod.ARROW_BACK_2));
                stacks.add(new ItemStack(CitycraftMod.ARROW_FORWARD_BACK_1));
                stacks.add(new ItemStack(CitycraftMod.ARROW_FORWARD_BACK_2));
                stacks.add(new ItemStack(CitycraftMod.ARROW_LEFT_BACK_1));
                stacks.add(new ItemStack(CitycraftMod.ARROW_LEFT_BACK_2));
                stacks.add(new ItemStack(CitycraftMod.ARROW_RIGHT_BACK_1));
                stacks.add(new ItemStack(CitycraftMod.ARROW_RIGHT_BACK_2));
            })
            .build();

    public static final ItemGroup CITYCRAFT_SIGNS = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_signs"))
            .icon(() -> new ItemStack(CitycraftMod.SIGN_D_BL))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_POLE_1));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_SUPPORT_FRAME_1));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_SUPPORT_FRAME_2));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_SUPPORT_FRAME_3));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_SUPPORT_FRAME_4));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_S));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_L));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_R));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_LR));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SL));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SR));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SLR));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_UT));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_UT_2));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SUT));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SUT_2));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_LUT));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_LUT_2));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_RUT));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_RUT_2));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_5));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_10));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_20));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_30));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_40));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_50));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_60));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_70));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_80));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_90));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_100));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_110));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_120));
                stacks.add(new ItemStack(CitycraftMod.SIGN_D_BL));
                stacks.add(new ItemStack(CitycraftMod.SIGN_D_BR));
                stacks.add(new ItemStack(CitycraftMod.SIGN_D_CAR));
                stacks.add(new ItemStack(CitycraftMod.SIGN_D_CAR_BL));
                stacks.add(new ItemStack(CitycraftMod.SIGN_D_CAR_BR));
                stacks.add(new ItemStack(CitycraftMod.SIGN_D_BICYCLE));
                stacks.add(new ItemStack(CitycraftMod.SIGN_D_BICYCLE_BL));
                stacks.add(new ItemStack(CitycraftMod.SIGN_D_BICYCLE_BR));
                stacks.add(new ItemStack(CitycraftMod.SIGN_ROUNDABOUT));
                stacks.add(new ItemStack(CitycraftMod.SIGN_HONKING));
                stacks.add(new ItemStack(CitycraftMod.SIGN_NO_U_TURNS));
                stacks.add(new ItemStack(CitycraftMod.SIGN_NO_CARS));
                stacks.add(new ItemStack(CitycraftMod.SIGN_NO_BICYCLES));
                stacks.add(new ItemStack(CitycraftMod.SIGN_NO_PEDESTRIANS));
                stacks.add(new ItemStack(CitycraftMod.SIGN_NO_HONKING));
                stacks.add(new ItemStack(CitycraftMod.SIGN_NO_DRIVING));
                stacks.add(new ItemStack(CitycraftMod.SIGN_NO_PARKING));
                stacks.add(new ItemStack(CitycraftMod.SIGN_NO_STOPPING));
                stacks.add(new ItemStack(CitycraftMod.SIGN_PARKING_1));
                stacks.add(new ItemStack(CitycraftMod.SIGN_PARKING_2));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_BICYCLES));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_SIGNALS));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_CHILDREN));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_PEDESTRIANS));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_CROSSWALK));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_CONSTRUCTION));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_TUNNEL));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_UNEVEN_ROAD));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_ROAD_NARROWING));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_LEFT_ROAD_NARROWING));
                stacks.add(new ItemStack(CitycraftMod.SIGN_DANGER_RIGHT_ROAD_NARROWING));
                stacks.add(new ItemStack(CitycraftMod.CONVERSION_STICK));
            })
            .build();

    public static final ItemGroup CITYCRAFT_DECORATIONS = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_decorations"))
            .icon(() -> new ItemStack(CitycraftMod.BLUE_CONSTRUCTION_BARRIER))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.SECOND_ANNIVERSARY_BLOCK));
                stacks.add(new ItemStack(CitycraftMod.CERAMIC_TILE_1));
                stacks.add(new ItemStack(CitycraftMod.CERAMIC_TILE_2));
                stacks.add(new ItemStack(CitycraftMod.TERRAZZO_1));
                stacks.add(new ItemStack(CitycraftMod.TERRAZZO_2));
                stacks.add(new ItemStack(CitycraftMod.TERRAZZO_3));
                stacks.add(new ItemStack(CitycraftMod.FINE_SLATES));
                stacks.add(new ItemStack(CitycraftMod.FINE_SLATES_SLAB));
                stacks.add(new ItemStack(CitycraftMod.BLACK_BRICKS));
                stacks.add(new ItemStack(CitycraftMod.BLACK_BRICKS_SLAB));
                stacks.add(new ItemStack(CitycraftMod.GRAY_BRICKS));
                stacks.add(new ItemStack(CitycraftMod.GRAY_BRICKS_SLAB));
                stacks.add(new ItemStack(CitycraftMod.LIGHT_GRAY_BRICKS));
                stacks.add(new ItemStack(CitycraftMod.LIGHT_GRAY_BRICKS_SLAB));
                stacks.add(new ItemStack(CitycraftMod.WHITE_BRICKS));
                stacks.add(new ItemStack(CitycraftMod.WHITE_BRICKS_SLAB));
                stacks.add(new ItemStack(CitycraftMod.BEIGE_BRICKS));
                stacks.add(new ItemStack(CitycraftMod.BEIGE_BRICKS_SLAB));
                stacks.add(new ItemStack(CitycraftMod.BLIND_SIDEWALK_BLOCK));
                stacks.add(new ItemStack(CitycraftMod.BLIND_SIDEWALK_SLAB));
                stacks.add(new ItemStack(CitycraftMod.BLIND_SIDEWALK_BLOCK_CORNER));
                stacks.add(new ItemStack(CitycraftMod.BLIND_SIDEWALK_SLAB_CORNER));
                stacks.add(new ItemStack(CitycraftMod.STONE_PATH));
                stacks.add(new ItemStack(CitycraftMod.COBBLESTONE_PATH));
                stacks.add(new ItemStack(CitycraftMod.STONE_BRICKS_PATH));
                stacks.add(new ItemStack(CitycraftMod.AMAZING_BLOCK));
                stacks.add(new ItemStack(CitycraftMod.GREEN_BELT));
                stacks.add(new ItemStack(CitycraftMod.MODERN_IRON_BARS));
                stacks.add(new ItemStack(CitycraftMod.WARNING_COLUMN));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_BOLLARD));
                stacks.add(new ItemStack(CitycraftMod.TRASH_BIN_PLASTIC));
                stacks.add(new ItemStack(CitycraftMod.TRASH_BIN_METAL));
                stacks.add(new ItemStack(CitycraftMod.MANHOLE_COVER_CIRCLE));
                stacks.add(new ItemStack(CitycraftMod.MANHOLE_COVER_SQUARE));
                stacks.add(new ItemStack(CitycraftMod.TABLE_TENNIS_TABLE));
                stacks.add(new ItemStack(CitycraftMod.BLUE_CONSTRUCTION_BARRIER));
                stacks.add(new ItemStack(CitycraftMod.GREEN_CONSTRUCTION_BARRIER));
                stacks.add(new ItemStack(CitycraftMod.EXPRESSWAY_GUARDRAIL_1));
                stacks.add(new ItemStack(CitycraftMod.EXPRESSWAY_GUARDRAIL_2));
                stacks.add(new ItemStack(CitycraftMod.EXPRESSWAY_GUARDRAIL_3));
                stacks.add(new ItemStack(CitycraftMod.EXPRESSWAY_GUARDRAIL_4));
                stacks.add(new ItemStack(CitycraftMod.EXPRESSWAY_GUARDRAIL_BLUE_1));
                stacks.add(new ItemStack(CitycraftMod.EXPRESSWAY_GUARDRAIL_BLUE_2));
                stacks.add(new ItemStack(CitycraftMod.EXPRESSWAY_GUARDRAIL_BLUE_3));
                stacks.add(new ItemStack(CitycraftMod.EXPRESSWAY_GUARDRAIL_BLUE_4));
                stacks.add(new ItemStack(CitycraftMod.CROWN));
                stacks.add(new ItemStack(CitycraftMod.CAR_STOPPER));
                stacks.add(new ItemStack(CitycraftMod.PARKING_LOCK));
                stacks.add(new ItemStack(CitycraftMod.ELEVATED_ROAD_GUARDRAIL_1));
                stacks.add(new ItemStack(CitycraftMod.ELEVATED_ROAD_GUARDRAIL_1_BLUE));
                stacks.add(new ItemStack(CitycraftMod.SOUND_INSULATION_BOARD_1));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_LIGHTS_FORWARD_1));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_LIGHTS_LEFT_1));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_LIGHTS_RIGHT_1));
                stacks.add(new ItemStack(CitycraftMod.THIN_POLE_BLUE));
                stacks.add(new ItemStack(CitycraftMod.THIN_POLE_GRAY));
                stacks.add(new ItemStack(CitycraftMod.THIN_POLE_WHITE));
                stacks.add(new ItemStack(CitycraftMod.MEDIUM_POLE_BLUE));
                stacks.add(new ItemStack(CitycraftMod.MEDIUM_POLE_GRAY));
                stacks.add(new ItemStack(CitycraftMod.MEDIUM_POLE_WHITE));
                stacks.add(new ItemStack(CitycraftMod.THICK_POLE_BLUE));
                stacks.add(new ItemStack(CitycraftMod.THICK_POLE_GRAY));
                stacks.add(new ItemStack(CitycraftMod.THICK_POLE_WHITE));
                stacks.add(new ItemStack(CitycraftMod.ROAD_LIGHT_WHITE_1));
                stacks.add(new ItemStack(CitycraftMod.ROAD_LIGHT_GRAY_1));
                stacks.add(new ItemStack(CitycraftMod.TUNNEL_BLOWER));
                stacks.add(new ItemStack(CitycraftMod.TUNNEL_LIGHT_1));
                stacks.add(new ItemStack(CitycraftMod.TUNNEL_LIGHT_2));
                stacks.add(new ItemStack(CitycraftMod.TUNNEL_EMERGENCY_TELEPHONE));
                stacks.add(new ItemStack(CitycraftMod.FIRE_EXTINGUISHER));
                stacks.add(new ItemStack(CitycraftMod.FIRE_HYDRANT));
                stacks.add(new ItemStack(CitycraftMod.LANTERN_1));
                stacks.add(new ItemStack(CitycraftMod.CONVERSION_STICK));
            })
            .build();

    public static final ItemGroup CITYCRAFT_ITEMS = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_items"))
            .icon(() -> new ItemStack(CitycraftMod.MONEY_UNIT_100))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.MONEY_UNIT_1));
                stacks.add(new ItemStack(CitycraftMod.MONEY_UNIT_5));
                stacks.add(new ItemStack(CitycraftMod.MONEY_UNIT_10));
                stacks.add(new ItemStack(CitycraftMod.MONEY_UNIT_20));
                stacks.add(new ItemStack(CitycraftMod.MONEY_UNIT_50));
                stacks.add(new ItemStack(CitycraftMod.MONEY_UNIT_100));
            })
            .build();

/*
    public static final ItemGroup CITYCRAFT_RAILWAY = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_railway"))
            .icon(() -> new ItemStack(Blocks.RAIL))
            .appendItems(stacks -> {
                /*stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_SUPPORT_FRAME));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_SUPPORT_POLE_1));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_1));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_2));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_3));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_4));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_5));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_6));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_7));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_8));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_9));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_10));
                stacks.add(new ItemStack(CitycraftMod.A_TIP_FROM_XIAO_YAO));
            })
            .build();
*/
    public static final ItemGroup MINECRAFT_SPECIAL_THINGS = FabricItemGroupBuilder.create(
            new Identifier("citycraft","minecraft_special_things"))
            .icon(() -> new ItemStack(Items.DRAGON_EGG))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.DRAGON_EGG));
                stacks.add(new ItemStack(Items.DEBUG_STICK));
                stacks.add(new ItemStack(Items.COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.STRUCTURE_BLOCK));
                stacks.add(new ItemStack(Items.BARRIER));
            })
            .build();



    public static final Identifier NEVER_GONNA_GIVE_YOU_UP = new Identifier("citycraft:never_gonna_give_you_up");
    public static SoundEvent NEVER_GONNA_GIVE_YOU_UP_SOUND = new SoundEvent(NEVER_GONNA_GIVE_YOU_UP);
    {
        Registry.register(Registry.SOUND_EVENT, CitycraftMod.NEVER_GONNA_GIVE_YOU_UP, NEVER_GONNA_GIVE_YOU_UP_SOUND);
    }








/*
    public static final Block BOX_BLOCK;
    public static final BlockItem BOX_BLOCK_ITEM;
    public static final BlockEntityType<BoxBlockEntity> BOX_BLOCK_ENTITY;
    public static final ScreenHandlerType<BoxScreenHandler> BOX_SCREEN_HANDLER;

    public static final String MOD_ID = "citycraft";
    // 我们的大型箱子中不同部分的公共id
    public static final Identifier BOX = new Identifier(MOD_ID, "box_block");

    static {
        BOX_BLOCK = Registry.register(Registry.BLOCK, BOX, new BoxBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
        BOX_BLOCK_ITEM = Registry.register(Registry.ITEM, BOX, new BlockItem(BOX_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
        BOX_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, BOX, FabricBlockEntityTypeBuilder.create(BoxBlockEntity::new, BOX_BLOCK).build(null));
        BOX_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(BOX, BoxScreenHandler::new);
    }*/
}