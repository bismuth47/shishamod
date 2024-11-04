
package shishamo.item;

import shishamo.procedures.CloudPunchLivingEntityIsHitWithItemProcedure;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class CloudPunchItem extends Item {
	public CloudPunchItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CloudPunchLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
