/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ItemGroupRegistry {
	public static void init() {
		if (FabricLoader.getInstance().isModLoaded("fabric-item-group-api-v1")) {
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.ANCIENT_DEBRIS, ItemRegistry.rawNetheriteScrap);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(content -> {
				content.addAfter(Items.ANCIENT_DEBRIS, ItemRegistry.rawNetheriteBlock);
			});
		}
	}
}
