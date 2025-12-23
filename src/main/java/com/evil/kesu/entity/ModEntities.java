package com.evil.kesu.entity;

import com.evil.kesu.KesU;
import com.evil.kesu.entity.custom.MantisEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {

    private static final RegistryKey<EntityType<?>> MANTIS_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(KesU.MOD_ID, "mantis"));

    public static final EntityType<MantisEntity> MANTIS = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(KesU.MOD_ID, "mantis"),
            EntityType.Builder.create(MantisEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 2.5f)
                    .build(MANTIS_KEY));

    public static void registerModEntities() {
        KesU.LOGGER.info("Registering Mod Entities for " + KesU.MOD_ID);
    }
}