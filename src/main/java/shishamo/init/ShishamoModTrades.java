
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package shishamo.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class ShishamoModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(ShishamoModItems.CLOUD_INGOT.get()), 12, 7, 0.05f));
		}
	}
}
