package com.evil.kesu.client;

import com.evil.kesu.world.ModConfiguredFeatures;
import com.evil.kesu.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class KesUDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(KesUModelProvider::new);
        pack.addProvider(KesUTagProvider::new);
        pack.addProvider(KesURegistryDataGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder builder) {
        builder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        builder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
