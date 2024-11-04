package shishamo.procedures;

import shishamo.init.ShishamoModBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LoveBlockRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ShishamoModBlocks.LOVE_BLOCK.get().defaultBlockState()));
	}
}
