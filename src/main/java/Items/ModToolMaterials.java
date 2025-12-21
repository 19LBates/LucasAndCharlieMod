package Items;

import com.evil.kesu.KesU;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModToolMaterials {

    public static final TagKey<Item> REPAIRS_KES_TOOLS = TagKey.of(
            Registries.ITEM.getKey(),
            Identifier.of(KesU.MOD_ID, "repairs_kes_tools")
    );

    public static final ToolMaterial KES = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            3000,
            39.0F,
            5.0F,
            30,
            REPAIRS_KES_TOOLS
    );
}