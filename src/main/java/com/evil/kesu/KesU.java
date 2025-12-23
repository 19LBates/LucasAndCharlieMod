package com.evil.kesu;

import com.evil.kesu.blocks.ModBlocks;
import com.evil.kesu.entity.ModEntities;
import com.evil.kesu.entity.custom.MantisEntity;
import com.evil.kesu.items.ModItems;
import com.evil.kesu.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KesU implements ModInitializer {

    public static final String MOD_ID = "kesu";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("The Best mod of all time has now started.");
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModWorldGeneration.generateModWorldGen();

        FabricDefaultAttributeRegistry.register(ModEntities.MANTIS, MantisEntity.createAttributes());
    }
}