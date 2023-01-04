package net.citycraft;

//import net.citycraft.screen.BoxScreen;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
//import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.SOUND_INSULATION_BOARD_1, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_S_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_S_S, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_D, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_C_R_S, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_C_R_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_C_R_L, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_C_S_S, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_C_S_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_C_C_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_SC_R_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_SC_S_S_L, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.WHITE_LINE_SC_S_S_R, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_S_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_S_S, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_D, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_C_R_S, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_C_R_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_C_R_L, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_C_S_S, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_C_S_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_C_C_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_SC_R_M, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_SC_S_S_L, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.YELLOW_LINE_SC_S_S_R, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.ZEBRA_CROSSING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CitycraftMod.GROUND_SIGN_PARKING, RenderLayer.getCutout());
        //ScreenRegistry.register(CitycraftMod.BOX_SCREEN_HANDLER, BoxScreen::new);
    }
}