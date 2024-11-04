
package shishamo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BranchItem extends Item {
	public BranchItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
