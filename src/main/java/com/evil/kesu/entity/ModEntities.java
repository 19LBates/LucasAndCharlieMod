package com.evil.kesu.entity;

import com.evil.kesu.KesU;
import com.evil.kesu.entity.custom.MantisEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MantisEntity> MANTIS = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(KesU.MOD_ID, "mantis"),
            EntityType.Builder.create(MantisEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 2.5f)
                    .build(null));

    public static void registerModEntities() {
        KesU.LOGGER.info("Registering Mod Entities for " + KesU.MOD_ID);
    }
}