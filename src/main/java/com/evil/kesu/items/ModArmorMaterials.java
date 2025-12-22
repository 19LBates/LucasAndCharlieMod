package com.evil.kesu.items;

import com.evil.kesu.KesU;
import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import static net.minecraft.item.equipment.EquipmentAssetKeys.REGISTRY_KEY;
import java.util.Map;

public class ModArmorMaterials {

    public static final TagKey<Item> REPAIRS_KES_ARMOR = TagKey.of(
            Registries.ITEM.getKey(),
            Identifier.of(KesU.MOD_ID, "repairs_kes_armor")
    );

    public static final RegistryKey<EquipmentAsset> KES_ARMOR_MATERIAL_KEY = RegistryKey.of(
            REGISTRY_KEY, Identifier.of(KesU.MOD_ID, "kes"));

    public static final ArmorMaterial KES = new ArmorMaterial(
            50,
            createDefenseMap(5, 8, 10, 5, 27),
            30,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F,
            0.3F,
            REPAIRS_KES_ARMOR,
            KES_ARMOR_MATERIAL_KEY);

    private static Map<EquipmentType, Integer> createDefenseMap(int bootsDefense, int leggingsDefense, int chestplateDefense, int helmetDefense, int bodyDefense) {
        return Maps.newEnumMap(Map.of(EquipmentType.BOOTS, bootsDefense, EquipmentType.LEGGINGS, leggingsDefense, EquipmentType.CHESTPLATE, chestplateDefense, EquipmentType.HELMET, helmetDefense, EquipmentType.BODY, bodyDefense));
    }
}
