package com.evil.kesu.client;

import com.evil.kesu.items.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class KesUModelProvider extends FabricModelProvider {

    public KesUModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.KES_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_KES, Models.GENERATED);
        itemModelGenerator.register(ModItems.KES_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KES_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KES_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KES_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KES_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KES_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.KES_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KES_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.KES_BOOTS, Models.GENERATED);
    }
}
