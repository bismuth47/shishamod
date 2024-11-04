
package shishamo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpellDustItem extends Item {
	public SpellDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
