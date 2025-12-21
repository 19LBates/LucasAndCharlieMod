package Items;

import com.evil.kesu.KesU;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item KES_INGOT;
    public static Item RAW_KES;

    public static Item KES_SWORD;
    public static Item KES_PICKAXE;
    public static Item KES_AXE;
    public static Item KES_SHOVEL;
    public static Item KES_HOE;

    private static Item registerItem(String name) {
        Identifier id = Identifier.of(KesU.MOD_ID, name);
        return Registry.register(Registries.ITEM, id, new Item(new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), id))));
    }

    private static Item registerItem(String name, Item item) {
        Identifier id = Identifier.of(KesU.MOD_ID, name);
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems() {
        KES_INGOT = registerItem("kes_ingot");
        RAW_KES = registerItem("raw_kes");

        // Use full class names without importing
        Identifier kesSwordId = Identifier.of(KesU.MOD_ID, "kes_sword");
        KES_SWORD = registerItem("kes_sword", new Item(
                new Item.Settings().sword(ModToolMaterials.KES, 5, -2.4f)
                        .registryKey(RegistryKey.of(Registries.ITEM.getKey(), kesSwordId))));

        Identifier kesPickaxeId = Identifier.of(KesU.MOD_ID, "kes_pickaxe");
        KES_PICKAXE = registerItem("kes_pickaxe", new Item(
                new Item.Settings().pickaxe(ModToolMaterials.KES, 1, -2.8F)
                        .registryKey(RegistryKey.of(Registries.ITEM.getKey(), kesPickaxeId))));

        Identifier kesAxeId = Identifier.of(KesU.MOD_ID, "kes_axe");
        KES_AXE = registerItem("kes_axe", new AxeItem(ModToolMaterials.KES, 9, -3.1F,
                new Item.Settings()
                        .registryKey(RegistryKey.of(Registries.ITEM.getKey(), kesAxeId))));

        Identifier kesShovelId = Identifier.of(KesU.MOD_ID, "kes_shovel");
        KES_SHOVEL = registerItem("kes_shovel", new ShovelItem(ModToolMaterials.KES, 1.5F, -3.0F,
                new Item.Settings()
                        .registryKey(RegistryKey.of(Registries.ITEM.getKey(), kesShovelId))));

        Identifier kesHoeId = Identifier.of(KesU.MOD_ID, "kes_hoe");
        KES_HOE = registerItem("kes_hoe", new HoeItem(ModToolMaterials.KES, 0, -3.0F,
                new Item.Settings()
                        .registryKey(RegistryKey.of(Registries.ITEM.getKey(), kesHoeId))));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(KES_INGOT);
            entries.add(RAW_KES);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(KES_SWORD);
            entries.add(KES_AXE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(KES_PICKAXE);
            entries.add(KES_AXE);
            entries.add(KES_SHOVEL);
            entries.add(KES_HOE);
        });
    }
}