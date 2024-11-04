
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shishamo.init;

import shishamo.block.LoveBlockBlock;

import shishamo.ShishamoMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class ShishamoModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ShishamoMod.MODID);
	public static final DeferredBlock<Block> LOVE_BLOCK = REGISTRY.register("love_block", LoveBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
