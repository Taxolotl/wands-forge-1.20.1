package io.github.taxolotl.wands.worldgen;

import io.github.taxolotl.wands.Wands;
import io.github.taxolotl.wands.block.ModBlocks;
import io.github.taxolotl.wands.util.ModUtilFunctions;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY_KEY = registerKey("mahogany");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YEW_KEY = registerKey("yew");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECHWOOD_KEY = registerKey("beechwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("maple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EBONY_KEY = registerKey("ebony");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLLY_KEY = registerKey("holly");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, MAHOGANY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MAHOGANY_LOG.get()),
                new StraightTrunkPlacer(ModUtilFunctions.Math.feetToBlocks(40), ModUtilFunctions.Math.feetToBlocks(5), ModUtilFunctions.Math.feetToBlocks(5)),

                BlockStateProvider.simple(ModBlocks.MAHOGANY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(ModUtilFunctions.Math.yardsToBlocks(10)), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)
        ).build());

        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get()),
                new StraightTrunkPlacer(ModUtilFunctions.Math.yardsToBlocks(10), ModUtilFunctions.Math.feetToBlocks(5), ModUtilFunctions.Math.feetToBlocks(5)),

                BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(ModUtilFunctions.Math.yardsToBlocks(10)), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)
        ).build());

        register(context, YEW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.YEW_LOG.get()),
                new StraightTrunkPlacer(ModUtilFunctions.Math.yardsToBlocks(10), ModUtilFunctions.Math.feetToBlocks(15), ModUtilFunctions.Math.feetToBlocks(15)),

                BlockStateProvider.simple(ModBlocks.YEW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(ModUtilFunctions.Math.feetToBlocks(16)), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)
        ).build());

        register(context, BEECHWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BEECHWOOD_LOG.get()),
                new StraightTrunkPlacer(ModUtilFunctions.Math.yardsToBlocks(10), ModUtilFunctions.Math.yardsToBlocks(20), ModUtilFunctions.Math.yardsToBlocks(20)),

                BlockStateProvider.simple(ModBlocks.BEECHWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(16), ConstantInt.of(10), 3),

                new TwoLayersFeatureSize(1, 0, 2)
        ).build());

        register(context, MAPLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MAPLE_LOG.get()),
                new StraightTrunkPlacer(ModUtilFunctions.Math.feetToBlocks(8), ModUtilFunctions.Math.feetToBlocks(22), ModUtilFunctions.Math.feetToBlocks(70)),

                BlockStateProvider.simple(ModBlocks.MAPLE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(ModUtilFunctions.Math.feetToBlocks(10)), ConstantInt.of(2), 10),

                new TwoLayersFeatureSize(1, 0, 2)
        ).build());

        register(context, EBONY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.EBONY_LOG.get()),
                new StraightTrunkPlacer(18, 3, 3),

                BlockStateProvider.simple(ModBlocks.EBONY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(16), ConstantInt.of(0), 4),

                new TwoLayersFeatureSize(1, 0, 2)
        ).build());

        register(context, HOLLY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HOLLY_LOG.get()),
                new StraightTrunkPlacer(ModUtilFunctions.Math.yardsToBlocks(10), ModUtilFunctions.Math.feetToBlocks(10), ModUtilFunctions.Math.feetToBlocks(10)),

                BlockStateProvider.simple(ModBlocks.HOLLY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(ModUtilFunctions.Math.feetToBlocks(10)), ConstantInt.of(1), 5),

                new TwoLayersFeatureSize(1, 0, 2)
        ).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Wands.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
