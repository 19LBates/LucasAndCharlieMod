package com.evil.kesu;

import Items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KesU implements ModInitializer {

    public static final String MOD_ID = "kesu";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("The Best mod of all time has now started.");

        ModItems.registerModItems();
    }
}