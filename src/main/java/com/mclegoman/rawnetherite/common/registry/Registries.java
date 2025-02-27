/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common.registry;

import com.mclegoman.rawnetherite.common.block.Blocks;
import com.mclegoman.rawnetherite.common.item.ItemGroupRegistry;
import com.mclegoman.rawnetherite.common.item.ItemRegistry;
import com.mclegoman.rawnetherite.common.loot.LootTableRegistry;

public class Registries {
	public static void init() {
		Blocks.init();
		ItemRegistry.init();
		LootTableRegistry.init();
		ItemGroupRegistry.init();
	}
}
