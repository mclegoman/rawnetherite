/*
    Raw Netherite
    Contributor(s): dannytaylor
    Github: https://github.com/mclegoman/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common.loot;

import com.mclegoman.rawnetherite.common.item.ItemRegistry;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class LootTableRegistry {
	public static void init() {
		if (FabricLoader.getInstance().isModLoaded("fabric-loot-api-v3")) {
			LootTableEvents.MODIFY.register((registryKey, builder, source, provider) -> {
				if (source.isBuiltin()) {
					if (LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(registryKey)) {
						builder.pool(LootPool.builder().with(ItemEntry.builder(ItemRegistry.rawNetheriteScrap).weight(5)).with(ItemEntry.builder(Items.AIR).weight(95)).rolls(new ConstantLootNumberProvider(1.0F)));
					}
					if (LootTables.BASTION_TREASURE_CHEST.equals(registryKey)) {
						builder.pool(LootPool.builder().with(ItemEntry.builder(ItemRegistry.rawNetheriteScrap).weight(5)).with(ItemEntry.builder(Items.AIR).weight(95)).rolls(new ConstantLootNumberProvider(1.0F)));
					}
					if (LootTables.BASTION_OTHER_CHEST.equals(registryKey)) {
						builder.pool(LootPool.builder().with(ItemEntry.builder(ItemRegistry.rawNetheriteScrap).weight(5)).with(ItemEntry.builder(Items.AIR).weight(95)).rolls(new ConstantLootNumberProvider(1.0F)));
					}
				}
			});
		}
	}
}
