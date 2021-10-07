package com.github.spooktober.core.events;

import com.github.spooktober.spooktober;
import com.github.spooktober.core.enums.EnumInit;

import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;


@Mod.EventBusSubscriber(modid = spooktober.MOD_ID)
public class ModEvents {
	
	
	
	
	/*
	 * Learned from: https://forums.minecraftforge.net/topic/77711-1144-create-itemstack-using-registry-name/
	 */
	
	//Drop Candy on hostile mob death
	@SubscribeEvent
	public static void onLivingDeathEvent (LivingDeathEvent event)
	{
		boolean debug = true;
		LivingEntity entity = event.getEntityLiving();
		World worldIn = entity.level;
		
		//If entity is not null and (undead or arthropod)
		if(entity != null && (entity.getMobType() == CreatureAttribute.UNDEAD || entity.getMobType() == CreatureAttribute.ARTHROPOD))
		{			
			if (debug) System.out.println("DEBUG Reached Item Spawn Code");
			if (debug) System.out.println("DEBUG entity: " + entity);
			if (debug) System.out.println("DEBUG WorldIn: " + worldIn);
			
			ResourceLocation key = new ResourceLocation("spooktober:" + EnumInit.getRandomCandyID()); //Get Resource Location for Item
			if (debug) System.out.println("DEBUG ResourceLocation: " + key);			
			
			ItemStack candyStack = new ItemStack(ForgeRegistries.ITEMS.getValue(key)); //Create Item Stack
			if (debug) System.out.println("DEBUG ItemStack: " + candyStack);
			
			ItemEntity droppedCandy = new ItemEntity(worldIn, entity.getX(), entity.getY(), entity.getZ()); //Create Item Entity
			droppedCandy.setItem(candyStack); //Setting the item of the actual item stack			
			droppedCandy.setPos(entity.getX(), entity.getY(), entity.getZ()); //Setting the dropped item's position
			if (debug) System.out.println("DEBUG ItemEntity: " + droppedCandy);
			
			worldIn.addFreshEntity(droppedCandy); //Add it into the world
		}
	}


}






