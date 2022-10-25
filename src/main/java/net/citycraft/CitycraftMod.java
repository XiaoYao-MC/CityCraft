package net.citycraft;

import net.citycraft.block.*;
import net.citycraft.item.AmazingToolItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CitycraftMod implements ModInitializer {

    //* CITYCRAFT_BLOCKS ↓ *//

    public static final Block CERAMIC_TILE_1 = new Block
            (FabricBlockSettings.of(Material.GLASS,MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f,3f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ceramic_tiles_1"), CERAMIC_TILE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ceramic_tiles_1"), new BlockItem(CERAMIC_TILE_1, new Item.Settings()));
    }

    public static final Block CERAMIC_TILE_2 = new Block
            (FabricBlockSettings.of(Material.GLASS,MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f,3f));
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ceramic_tiles_2"), CERAMIC_TILE_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ceramic_tiles_2"), new BlockItem(CERAMIC_TILE_2, new Item.Settings()));
    }

    public static final Block FINE_SLATES = new Block
            (FabricBlockSettings.of(Material.STONE,MapColor.WHITE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "fine_slates"), FINE_SLATES);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "fine_slates"), new BlockItem(FINE_SLATES, new Item.Settings()));
    }

    public static final SlabBlock FINE_SLATES_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.WHITE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","fine_slates_slab"), FINE_SLATES_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft","fine_slates_slab"), new BlockItem(FINE_SLATES_SLAB, new Item.Settings()));
    }

    public static final BlindSidewalkBlockBlock BLIND_SIDEWALK_BLOCK = new BlindSidewalkBlockBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","blind_sidewalk_block"), BLIND_SIDEWALK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("citycraft","blind_sidewalk_block"), new BlockItem(BLIND_SIDEWALK_BLOCK, new Item.Settings()));
    }

    public static final BlindSidewalkSlabBlock BLIND_SIDEWALK_SLAB = new BlindSidewalkSlabBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","blind_sidewalk_slab"), BLIND_SIDEWALK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft","blind_sidewalk_slab"), new BlockItem(BLIND_SIDEWALK_SLAB, new Item.Settings()));
    }

    //* CITYCRAFT_ROADS_DECORATION ↓ *//

    public static final Block GREEN_BELT = new Block
            (FabricBlockSettings.of(Material.STONE,MapColor.BROWN).sounds(BlockSoundGroup.GRASS).strength(1f,5f));
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "green_belt"), GREEN_BELT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "green_belt"), new BlockItem(GREEN_BELT, new Item.Settings()));
    }

    public static final ModernIronBarsBlock MODERN_IRON_BARS = new ModernIronBarsBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","modern_iron_bars"), MODERN_IRON_BARS);
        Registry.register(Registry.ITEM, new Identifier("citycraft","modern_iron_bars"), new BlockItem(MODERN_IRON_BARS, new Item.Settings()));
    }

    public static final WarningColumnBlock WARNING_COLUMN = new WarningColumnBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(1f,5f).requiresTool());
    static {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","warning_column"), WARNING_COLUMN);
        Registry.register(Registry.ITEM, new Identifier("citycraft","warning_column"), new BlockItem(WARNING_COLUMN, new Item.Settings()));
    }

    public static final TrafficBollardBlock TRAFFIC_BOLLARD = new TrafficBollardBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.ORANGE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","traffic_bollard"), TRAFFIC_BOLLARD);
        Registry.register(Registry.ITEM, new Identifier("citycraft","traffic_bollard"), new BlockItem(TRAFFIC_BOLLARD, new Item.Settings()));
    }
    public static final BlueConstructionBarrierBlock BLUE_CONSTRUCTION_BARRIER = new BlueConstructionBarrierBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","blue_construction_barrier"), BLUE_CONSTRUCTION_BARRIER);
        Registry.register(Registry.ITEM, new Identifier("citycraft","blue_construction_barrier"), new BlockItem(BLUE_CONSTRUCTION_BARRIER, new Item.Settings()));
    }

    public static final GreenConstructionBarrierBlock GREEN_CONSTRUCTION_BARRIER = new GreenConstructionBarrierBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","green_construction_barrier"), GREEN_CONSTRUCTION_BARRIER);
        Registry.register(Registry.ITEM, new Identifier("citycraft","green_construction_barrier"), new BlockItem(GREEN_CONSTRUCTION_BARRIER, new Item.Settings()));
    }

    //* CITYCRAFT_ROADS_DECORATION ↓ *//

    public static final SquareTrafficSign1Block SQUARE_TRAFFIC_SIGN_S = new SquareTrafficSign1Block
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_s"), SQUARE_TRAFFIC_SIGN_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_s"), new BlockItem(SQUARE_TRAFFIC_SIGN_S, new Item.Settings()));
    }

    public static final SquareTrafficSign2Block SQUARE_TRAFFIC_SIGN_L = new SquareTrafficSign2Block
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_l"), SQUARE_TRAFFIC_SIGN_L);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_l"), new BlockItem(SQUARE_TRAFFIC_SIGN_L, new Item.Settings()));
    }

    public static final SquareTrafficSign3Block SQUARE_TRAFFIC_SIGN_R = new SquareTrafficSign3Block
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_r"), SQUARE_TRAFFIC_SIGN_R);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_r"), new BlockItem(SQUARE_TRAFFIC_SIGN_R, new Item.Settings()));
    }

    public static final SquareTrafficSign4Block SQUARE_TRAFFIC_SIGN_SL = new SquareTrafficSign4Block
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_sl"), SQUARE_TRAFFIC_SIGN_SL);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_sl"), new BlockItem(SQUARE_TRAFFIC_SIGN_SL, new Item.Settings()));
    }

    public static final SquareTrafficSign5Block SQUARE_TRAFFIC_SIGN_SR = new SquareTrafficSign5Block
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_sr"), SQUARE_TRAFFIC_SIGN_SR);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_sr"), new BlockItem(SQUARE_TRAFFIC_SIGN_SR, new Item.Settings()));
    }

    public static final SquareTrafficSign6Block SQUARE_TRAFFIC_SIGN_SLR = new SquareTrafficSign6Block
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_slr"), SQUARE_TRAFFIC_SIGN_SLR);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_slr"), new BlockItem(SQUARE_TRAFFIC_SIGN_SLR, new Item.Settings()));
    }

    public static final SquareTrafficSign7Block SQUARE_TRAFFIC_SIGN_UT = new SquareTrafficSign7Block
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_ut"), SQUARE_TRAFFIC_SIGN_UT);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_ut"), new BlockItem(SQUARE_TRAFFIC_SIGN_UT, new Item.Settings()));
    }

    public static final SquareTrafficSign8Block SQUARE_TRAFFIC_SIGN_LUT = new SquareTrafficSign8Block
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_lut"), SQUARE_TRAFFIC_SIGN_LUT);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_lut"), new BlockItem(SQUARE_TRAFFIC_SIGN_LUT, new Item.Settings()));
    }



    public static final ItemGroup CITYCRAFT_BLOCKS = FabricItemGroupBuilder.create(
            new Identifier("citycraft", "citycraft_blocks"))
            .icon(() -> new ItemStack(CitycraftMod.FINE_SLATES))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.CERAMIC_TILE_1));
                stacks.add(new ItemStack(CitycraftMod.CERAMIC_TILE_2));
                stacks.add(new ItemStack(CitycraftMod.FINE_SLATES));
                stacks.add(new ItemStack(CitycraftMod.FINE_SLATES_SLAB));
                stacks.add(new ItemStack(CitycraftMod.BLIND_SIDEWALK_BLOCK));
                stacks.add(new ItemStack(CitycraftMod.BLIND_SIDEWALK_SLAB));
            })
            .build();

    public static final ItemGroup CITYCRAFT_ROADS_DECORATIONS = FabricItemGroupBuilder.create(
            new Identifier("citycraft","citycraft_roads_decorations"))
            .icon(() -> new ItemStack(CitycraftMod.MODERN_IRON_BARS))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.GREEN_BELT));
                stacks.add(new ItemStack(CitycraftMod.MODERN_IRON_BARS));
                stacks.add(new ItemStack(CitycraftMod.WARNING_COLUMN));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_BOLLARD));
                stacks.add(new ItemStack(CitycraftMod.BLUE_CONSTRUCTION_BARRIER));
                stacks.add(new ItemStack(CitycraftMod.GREEN_CONSTRUCTION_BARRIER));
            })
            .build();

    public static final ItemGroup CITYCRAFT_TRAFFIC_SIGNS = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_traffic_signs"))
            .icon(() -> new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_S))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_S));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_L));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_R));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SL));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SR));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SLR));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_UT));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_LUT));
            })
            .build();
/*
    public static final ItemGroup CITYCRAFT_ROADS = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_roads"))
            .icon(() -> new ItemStack(CitycraftMod.))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.));
            })
            .build();

    public static final ItemGroup CITYCRAFT_RAILWAY = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_railway"))
            .icon(() -> new ItemStack(CitycraftMod.))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.));
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
            })
            .build();








    //Blocks in development



    //Items in development

    public static final AmazingToolItem AMAZING_TOOL = new AmazingToolItem(new FabricItemSettings());
    {
        Registry.register(Registry.ITEM, new Identifier("citycraft", "amazing_tool"), AMAZING_TOOL);
    }
}