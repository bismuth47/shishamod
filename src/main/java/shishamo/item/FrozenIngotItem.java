
package shishamo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FrozenIngotItem extends Item {
	public FrozenIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
