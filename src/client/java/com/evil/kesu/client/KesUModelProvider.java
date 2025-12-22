package com.evil.kesu.client;

import com.evil.kesu.blocks.ModBlocks;
import com.evil.kesu.items.ModArmorMaterials;
import com.evil.kesu.items.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class KesUModelProvider extends FabricModelProvider {

    public KesUModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.KES_ORE);
        blockStateModelGenerator.registerSingleton(ModBlocks.KES_BLOCK, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_KES_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_KES_ORE);
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

        itemModelGenerator.registerArmor(ModItems.KES_HELMET, ModArmorMaterials.KES_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.KES_CHESTPLATE, ModArmorMaterials.KES_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.KES_LEGGINGS, ModArmorMaterials.KES_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.KES_BOOTS, ModArmorMaterials.KES_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
    }
}
