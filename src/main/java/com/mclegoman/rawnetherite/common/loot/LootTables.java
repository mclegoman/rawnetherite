/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common.loot;

import com.mclegoman.rawnetherite.common.item.Items;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class LootTables {
	public static void init() {
		if (FabricLoader.getInstance().isModLoaded("fabric-item-group-api-v1")) {
			LootTableEvents.MODIFY.register((registryKey, builder, lootTableSource) -> {
				if (lootTableSource.isBuiltin()) {
					if (net.minecraft.loot.LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(registryKey)) {
						builder.pool(LootPool.builder().with(ItemEntry.builder(Items.rawNetheriteScrap).weight(5)).with(ItemEntry.builder(net.minecraft.item.Items.AIR).weight(95)).rolls(new ConstantLootNumberProvider(1.0F)));
					}
					if (net.minecraft.loot.LootTables.BASTION_TREASURE_CHEST.equals(registryKey)) {
						builder.pool(LootPool.builder().with(ItemEntry.builder(Items.rawNetheriteScrap).weight(5)).with(ItemEntry.builder(net.minecraft.item.Items.AIR).weight(95)).rolls(new ConstantLootNumberProvider(1.0F)));
					}
					if (net.minecraft.loot.LootTables.BASTION_OTHER_CHEST.equals(registryKey)) {
						builder.pool(LootPool.builder().with(ItemEntry.builder(Items.rawNetheriteScrap).weight(5)).with(ItemEntry.builder(net.minecraft.item.Items.AIR).weight(95)).rolls(new ConstantLootNumberProvider(1.0F)));
					}
				}
			});
		}
	}
}
