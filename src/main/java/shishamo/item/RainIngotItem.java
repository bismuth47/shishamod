
package shishamo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RainIngotItem extends Item {
	public RainIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
