package Items;

import com.evil.kesu.KesU;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item KES_INGOT;
    public static Item RAW_KES;

    private static Item registerItem(String name) {
        Identifier id = Identifier.of(KesU.MOD_ID, name);
        return Registry.register(Registries.ITEM, id, new Item( new Item.Settings().registryKey(RegistryKey.of(Registries.ITEM.getKey(), id))));
    }

    public static void registerModItems() {
        KES_INGOT = registerItem("kes_ingot");
        RAW_KES = registerItem("raw_kes");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(KES_INGOT);
            entries.add(RAW_KES);
        });
    }
}
