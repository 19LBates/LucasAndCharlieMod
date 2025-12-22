package com.evil.kesu.blocks;

import com.evil.kesu.KesU;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static Block KES_ORE;
    public static Block KES_BLOCK;
    public static Block RAW_KES_BLOCK;
    public static Block DEEPSLATE_KES_ORE;

    private static Block register(RegistryKey<Block> key, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(key));
        return (Block)Registry.register(Registries.BLOCK, key, block);
    }

    private static Block register(RegistryKey<Block> key, AbstractBlock.Settings settings) {
        return register(key, Block::new, settings);
    }

    private static RegistryKey<Block> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(KesU.MOD_ID, id));
    }

    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    private static Block register(String id, AbstractBlock.Settings settings) {
        return register(id, Block::new, settings);
    }

    private static BlockItem registerBlockItem(RegistryKey<Block> key, Block block) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, key.getValue());
        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, blockItem);
        return blockItem;
    }

    public static void registerModBlocks() {
        KES_ORE = register("kes_ore", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(25f, 1200f));
        KES_BLOCK = register("kes_block.json", AbstractBlock.Settings.create().mapColor(MapColor.GOLD).requiresTool().strength(50f, 1200f).sounds(BlockSoundGroup.IRON));
        RAW_KES_BLOCK = register("raw_kes_block", AbstractBlock.Settings.create().mapColor(MapColor.LAPIS_BLUE).requiresTool().strength(50f, 1200f).sounds(BlockSoundGroup.AMETHYST_BLOCK));
        DEEPSLATE_KES_ORE = register("deepslate_kes_ore", AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).requiresTool().strength(50f, 1200f).sounds(BlockSoundGroup.AMETHYST_BLOCK));
        BlockItem kes_ore_item = registerBlockItem(keyOf("kes_ore"), KES_ORE);
        BlockItem kes_block_item = registerBlockItem(keyOf("kes_block.json"), KES_BLOCK);
        BlockItem raw_kes_block_item = registerBlockItem(keyOf("raw_kes_block"), RAW_KES_BLOCK);
        BlockItem deepslate_kes_ore_item = registerBlockItem(keyOf("deepslate_kes_ore"), DEEPSLATE_KES_ORE);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(kes_ore_item);
            entries.add(raw_kes_block_item);
            entries.add(deepslate_kes_ore_item);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(kes_block_item);
        });
    }

}