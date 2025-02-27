/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.mixin;

import net.minecraft.Bootstrap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Bootstrap.class)
public interface BootstrapAccessor {
	@Invoker("setOutputStreams")
	static void luminance$invokeSetOutputStreams() {
		throw new IllegalStateException("Failed to invoke setOutputStreams!");
	}
}
