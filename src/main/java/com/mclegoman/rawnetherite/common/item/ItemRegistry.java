/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common.item;

import com.mclegoman.rawnetherite.common.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ItemRegistry {
	public static final Item rawNetheriteScrap;
	public static final Item rawNetheriteBlock;
	public static void init() {
	}
	static {
		rawNetheriteScrap = Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("rawnetherite", "raw_netherite_scrap")), new Item(new Item.Settings()));
		rawNetheriteBlock = Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of("rawnetherite", "raw_netherite_block")), new BlockItem(Blocks.rawNetheriteBlock, new Item.Settings()));
	}
}
