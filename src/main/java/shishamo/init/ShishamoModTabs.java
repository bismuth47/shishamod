
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shishamo.init;

import shishamo.ShishamoMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ShishamoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShishamoMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SHISHAMO_TAB = REGISTRY.register("shishamo_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shishamo.shishamo_tab")).icon(() -> new ItemStack(ShishamoModItems.SHISHAMO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShishamoModItems.LOVE_CRYSTAL.get());
				tabData.accept(ShishamoModItems.LOVE_SWORD.get());
				tabData.accept(ShishamoModItems.LOVE_PICKAXE.get());
				tabData.accept(ShishamoModItems.NETHER_INGOT.get());
				tabData.accept(ShishamoModItems.LOVE_AXE.get());
				tabData.accept(ShishamoModItems.LOVE_SHOVEL.get());
				tabData.accept(ShishamoModItems.LOVE_HOE.get());
				tabData.accept(ShishamoModItems.RAIN_INGOT.get());
				tabData.accept(ShishamoModItems.CLOUD_INGOT.get());
				tabData.accept(ShishamoModItems.CLOUD_PUNCH.get());
				tabData.accept(ShishamoModItems.DD_BLADE.get());
				tabData.accept(ShishamoModItems.FROZEN_SWORD.get());
				tabData.accept(ShishamoModItems.MUSIC_DISK_LOVE.get());
				tabData.accept(ShishamoModItems.SPELL_DUST.get());
				tabData.accept(ShishamoModItems.REFINED_SPELL_DUST.get());
				tabData.accept(ShishamoModItems.EMERALD_NUGGET.get());
				tabData.accept(ShishamoModItems.RAIDEN_HAMMER.get());
				tabData.accept(ShishamoModItems.SPELL_BLADE.get());
				tabData.accept(ShishamoModItems.LEAF_SWORD.get());
				tabData.accept(ShishamoModBlocks.LOVE_BLOCK.get().asItem());
				tabData.accept(ShishamoModItems.SPELL_SHARD.get());
				tabData.accept(ShishamoModItems.FROZEN_TRIDENT.get());
				tabData.accept(ShishamoModItems.FROZEN_INGOT.get());
				tabData.accept(ShishamoModItems.RAIN_CHANGER.get());
				tabData.accept(ShishamoModItems.THUNDER_CHANGER.get());
				tabData.accept(ShishamoModItems.UNFINISHED_SWORD.get());
				tabData.accept(ShishamoModItems.BURNING_BRANCH.get());
				tabData.accept(ShishamoModItems.BRANCH.get());
				tabData.accept(ShishamoModItems.MINEBEAM_SWORD.get());
				tabData.accept(ShishamoModItems.CHAIN_SICKLE.get());
				tabData.accept(ShishamoModItems.LEAD_INGOT.get());
				tabData.accept(ShishamoModItems.NETHER_SWORD.get());
			}).withSearchBar().build());
}
