
package shishamo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetherIngotItem extends Item {
	public NetherIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
