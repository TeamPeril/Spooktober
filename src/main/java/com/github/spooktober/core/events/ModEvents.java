package com.github.spooktober.core.events;

import com.github.spooktober.spooktober;
import static com.github.spooktober.common.item.ItemMethods.dropItemEntity;
import static com.github.spooktober.common.item.ItemMethods.getRandomCandyID;

import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import java.util.Calendar;

@Mod.EventBusSubscriber(modid = spooktober.MOD_ID)
public class ModEvents {
	
	/*
	 * Learned from: https://forums.minecraftforge.net/topic/77711-1144-create-itemstack-using-registry-name/
	 */
	
	//Drop Candy on hostile mob death
	@SubscribeEvent
	public static void onLivingDeathEvent (LivingDeathEvent event)
	{
		LivingEntity entity = event.getEntityLiving();
		World worldIn = entity.level;
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		// If Fall
		if(month >= Calendar.SEPTEMBER && month <= Calendar.NOVEMBER)
		{
			//If entity is not null and (undead or arthropod)
			if(entity != null && (entity.getMobType() == CreatureAttribute.UNDEAD || entity.getMobType() == CreatureAttribute.ARTHROPOD))
			{
				dropItemEntity(worldIn, getRandomCandyID(), entity.getX(), entity.getY(), entity.getZ(), 1);
			}
		}

	}
}






