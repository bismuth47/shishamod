
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shishamo.init;

import shishamo.ShishamoMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ShishamoModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ShishamoMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_LOVE = REGISTRY.register("music_disc.love", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("shishamo", "music_disc.love")));
}
