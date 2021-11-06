package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BundleItem;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlusClientside implements ClientModInitializer {
	private static final Logger LOGGER = LogManager.getLogger();
	
	@Override
	public void onInitializeClient() {
		LOGGER.info("Consistency+ Main - Starting client initialization");
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.WARPED_WART.get(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_SLAB.get(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_STAIRS.get(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_WALL.get(), RenderLayer.getCutout());

		// Tinted Glass
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.RED_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.ORANGE_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.YELLOW_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.LIME_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GREEN_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.BLUE_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.LIGHT_BLUE_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.CYAN_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.PURPLE_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.MAGENTA_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.PINK_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.WHITE_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.BROWN_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.LIGHT_GRAY_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRAY_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.BLACK_TINTED_GLASS_BLOCK.get(), RenderLayer.getTranslucent());


		// Bundles
		FabricModelPredicateProviderRegistry.register(CPlusItems.RED_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.ORANGE_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.YELLOW_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIME_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.GREEN_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIGHT_BLUE_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BLUE_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.CYAN_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.PURPLE_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.MAGENTA_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.PINK_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.WHITE_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIGHT_GRAY_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.GRAY_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BROWN_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BLACK_BUNDLE.get(), new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));

		
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D),
				CPlusItems.GRASS_SLAB.get(), CPlusItems.GRASS_STAIRS.get(), CPlusItems.GRASS_WALL.get());
		
		//NubertHandler.init();
		
		LOGGER.info("Consistency+ Main - Finished client initialization");
	}
}