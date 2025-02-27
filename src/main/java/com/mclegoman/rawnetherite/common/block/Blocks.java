/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class Blocks {
	public static final Block rawNetheriteBlock;
	public static void init() {
	}
	static {
		rawNetheriteBlock = Registry.register(Registries.BLOCK, RegistryKey.of(Registries.BLOCK.getKey(), Identifier.of("rawnetherite", "raw_netherite_block")), new Block(AbstractBlock.Settings.create().mapColor(DyeColor.BLACK).sounds(BlockSoundGroup.ANCIENT_DEBRIS).toolRequired().strength(6.0F, 200.0F)));
	}
}
