package com.evil.kesu.client;

import com.evil.kesu.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class KesUTagProvider extends FabricTagProvider.ItemTagProvider {

    public KesUTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.KES_SWORD);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.KES_PICKAXE);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.KES_AXE);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.KES_SHOVEL);

        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.KES_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.KES_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.KES_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.KES_BOOTS);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR).add(
                ModItems.KES_HELMET,
                ModItems.KES_CHESTPLATE,
                ModItems.KES_LEGGINGS,
                ModItems.KES_BOOTS
        );
    }
}
