
package shishamo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LoveCrystalItem extends Item {
	public LoveCrystalItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
