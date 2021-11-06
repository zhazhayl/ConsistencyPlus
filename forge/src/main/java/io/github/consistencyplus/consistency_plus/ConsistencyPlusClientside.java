package io.github.consistencyplus.consistency_plus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConsistencyPlusClientside {
	private static final Logger LOGGER = LogManager.getLogger();

/*
	public void onInitializeClient() {
		LOGGER.info("Consistency+ Main - Starting client initialization");


		RenderLayers.putBlock(CPlusBlocks.WARPED_WART, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_STAIRS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_WALL, RenderLayer.getCutout());



		// Tinted Glass
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.RED_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.ORANGE_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.YELLOW_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.LIME_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GREEN_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.BLUE_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.LIGHT_BLUE_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.CYAN_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.PURPLE_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.MAGENTA_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.PINK_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.WHITE_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.BROWN_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.LIGHT_GRAY_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRAY_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.BLACK_TINTED_GLASS_BLOCK, RenderLayer.getTranslucent());


		// Bundles
		FabricModelPredicateProviderRegistry.register(CPlusItems.RED_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.ORANGE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.YELLOW_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIME_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.GREEN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIGHT_BLUE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BLUE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.CYAN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.PURPLE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.MAGENTA_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.PINK_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.WHITE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIGHT_GRAY_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.GRAY_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BROWN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BLACK_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));

		
		BlockColorProvider.register((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D),
				CPlusItems.GRASS_SLAB, CPlusItems.GRASS_STAIRS, CPlusItems.GRASS_WALL);


		NubertHandler.init();
		
		LOGGER.info("Consistency+ Main - Finished client initialization");
	}*/
}
