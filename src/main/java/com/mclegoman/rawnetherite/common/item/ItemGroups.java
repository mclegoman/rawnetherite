/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;

public class ItemGroups {
	public static void init() {
		if (FabricLoader.getInstance().isModLoaded("fabric-item-group-api-v1")) {
			ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(net.minecraft.item.Items.ANCIENT_DEBRIS, Items.rawNetheriteScrap);
			});
			ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.NATURAL_BLOCKS).register(content -> {
				content.addAfter(net.minecraft.item.Items.ANCIENT_DEBRIS, Items.rawNetheriteBlock);
			});
		}
	}
}
