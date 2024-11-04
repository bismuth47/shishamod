
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shishamo.init;

import shishamo.item.UnfinishedSwordItem;
import shishamo.item.ThunderChangerItem;
import shishamo.item.SpellShardItem;
import shishamo.item.SpellDustItem;
import shishamo.item.SpellBladeItem;
import shishamo.item.ShishamoItem;
import shishamo.item.RefinedSpellDustItem;
import shishamo.item.RainIngotItem;
import shishamo.item.RainChangerItem;
import shishamo.item.RaidenHammerItem;
import shishamo.item.NetherSwordItem;
import shishamo.item.NetherIngotItem;
import shishamo.item.MusicDiskLoveItem;
import shishamo.item.MinebeamSwordItem;
import shishamo.item.LoveSwordItem;
import shishamo.item.LoveShovelItem;
import shishamo.item.LovePickaxeItem;
import shishamo.item.LoveHoeItem;
import shishamo.item.LoveCrystalItem;
import shishamo.item.LoveAxeItem;
import shishamo.item.LeafSwordItem;
import shishamo.item.LeadIngotItem;
import shishamo.item.FrozenTridentItem;
import shishamo.item.FrozenSwordItem;
import shishamo.item.FrozenIngotItem;
import shishamo.item.EmeraldNuggetItem;
import shishamo.item.DdBladeItem;
import shishamo.item.CloudPunchItem;
import shishamo.item.CloudIngotItem;
import shishamo.item.ChainSickleItem;
import shishamo.item.BurningBranchItem;
import shishamo.item.BranchItem;

import shishamo.ShishamoMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ShishamoModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ShishamoMod.MODID);
	public static final DeferredItem<Item> LOVE_CRYSTAL = REGISTRY.register("love_crystal", LoveCrystalItem::new);
	public static final DeferredItem<Item> LOVE_SWORD = REGISTRY.register("love_sword", LoveSwordItem::new);
	public static final DeferredItem<Item> LOVE_PICKAXE = REGISTRY.register("love_pickaxe", LovePickaxeItem::new);
	public static final DeferredItem<Item> NETHER_INGOT = REGISTRY.register("nether_ingot", NetherIngotItem::new);
	public static final DeferredItem<Item> LOVE_AXE = REGISTRY.register("love_axe", LoveAxeItem::new);
	public static final DeferredItem<Item> SHISHAMO = REGISTRY.register("shishamo", ShishamoItem::new);
	public static final DeferredItem<Item> LOVE_SHOVEL = REGISTRY.register("love_shovel", LoveShovelItem::new);
	public static final DeferredItem<Item> LOVE_HOE = REGISTRY.register("love_hoe", LoveHoeItem::new);
	public static final DeferredItem<Item> RAIN_INGOT = REGISTRY.register("rain_ingot", RainIngotItem::new);
	public static final DeferredItem<Item> CLOUD_INGOT = REGISTRY.register("cloud_ingot", CloudIngotItem::new);
	public static final DeferredItem<Item> CLOUD_PUNCH = REGISTRY.register("cloud_punch", CloudPunchItem::new);
	public static final DeferredItem<Item> DD_BLADE = REGISTRY.register("dd_blade", DdBladeItem::new);
	public static final DeferredItem<Item> FROZEN_SWORD = REGISTRY.register("frozen_sword", FrozenSwordItem::new);
	public static final DeferredItem<Item> MUSIC_DISK_LOVE = REGISTRY.register("music_disk_love", MusicDiskLoveItem::new);
	public static final DeferredItem<Item> SPELL_DUST = REGISTRY.register("spell_dust", SpellDustItem::new);
	public static final DeferredItem<Item> REFINED_SPELL_DUST = REGISTRY.register("refined_spell_dust", RefinedSpellDustItem::new);
	public static final DeferredItem<Item> EMERALD_NUGGET = REGISTRY.register("emerald_nugget", EmeraldNuggetItem::new);
	public static final DeferredItem<Item> RAIDEN_HAMMER = REGISTRY.register("raiden_hammer", RaidenHammerItem::new);
	public static final DeferredItem<Item> SPELL_BLADE = REGISTRY.register("spell_blade", SpellBladeItem::new);
	public static final DeferredItem<Item> LEAF_SWORD = REGISTRY.register("leaf_sword", LeafSwordItem::new);
	public static final DeferredItem<Item> LOVE_BLOCK = block(ShishamoModBlocks.LOVE_BLOCK);
	public static final DeferredItem<Item> SPELL_SHARD = REGISTRY.register("spell_shard", SpellShardItem::new);
	public static final DeferredItem<Item> FROZEN_TRIDENT = REGISTRY.register("frozen_trident", FrozenTridentItem::new);
	public static final DeferredItem<Item> FROZEN_INGOT = REGISTRY.register("frozen_ingot", FrozenIngotItem::new);
	public static final DeferredItem<Item> RAIN_CHANGER = REGISTRY.register("rain_changer", RainChangerItem::new);
	public static final DeferredItem<Item> THUNDER_CHANGER = REGISTRY.register("thunder_changer", ThunderChangerItem::new);
	public static final DeferredItem<Item> UNFINISHED_SWORD = REGISTRY.register("unfinished_sword", UnfinishedSwordItem::new);
	public static final DeferredItem<Item> BURNING_BRANCH = REGISTRY.register("burning_branch", BurningBranchItem::new);
	public static final DeferredItem<Item> BRANCH = REGISTRY.register("branch", BranchItem::new);
	public static final DeferredItem<Item> MINEBEAM_SWORD = REGISTRY.register("minebeam_sword", MinebeamSwordItem::new);
	public static final DeferredItem<Item> CHAIN_SICKLE = REGISTRY.register("chain_sickle", ChainSickleItem::new);
	public static final DeferredItem<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", LeadIngotItem::new);
	public static final DeferredItem<Item> NETHER_SWORD = REGISTRY.register("nether_sword", NetherSwordItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
