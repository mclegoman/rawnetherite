/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.mixin;

import com.mclegoman.rawnetherite.common.RawNetherite;
import net.minecraft.registry.Registries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Registries.class)
public abstract class RegistriesMixin {
	@Inject(method = "bootstrap", at = @At(value = "INVOKE", target = "Lnet/minecraft/registry/Registries;freezeRegistries()V"))
	private static void luminance$onInitialize(CallbackInfo ci) {
		BootstrapAccessor.luminance$invokeSetOutputStreams();
		RawNetherite.init();
	}
}
