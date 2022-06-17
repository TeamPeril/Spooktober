package com.github.spooktober.common.item;

import com.github.spooktober.spooktober;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemMethods {
	
	private static String[] candyDropList = {
			"candy_chocolate_bar",
			"candy_lollipop",
			"candy_gummy_worms",
			"candy_gumballs",
			"candy_corn",
			"candy_spider_eye",
			"candy_slime_on_a_stick",
			"candy_sugar_blaze_stick"			
	};
	
	private static String[] hatDropList = {
			"haunted_pumpkin_head",
			"ghastly_gibus"
	};
	
	public static String getRandomCandyID()
	{		
		return candyDropList[(int)(Math.random() * candyDropList.length)];
	}
	
	public static String getRandomHatID()
	{
		return hatDropList[(int)(Math.random() * hatDropList.length)];
	}
	
	/*
	 * Drop a given item in the given world at a given position.
	 * 
	 * @param worldIn The world you wish to drop the item in
	 * @param itemID The ID of the item you wish to drop
	 * @param x The X coordinate
	 * @param y The Y coordinate
	 * @param Z The Z coordinate
	 * @param amount The amount of the given item that will be dropped
	 */
	public static ItemEntity dropItemEntity(World worldIn, String itemID, double x, double y, double z, int amount)
	{
		ResourceLocation key = new ResourceLocation(spooktober.MOD_ID + ":" + itemID); //Get resource location
		ItemStack itemstack = new ItemStack(ForgeRegistries.ITEMS.getValue(key), amount); //Create itemstack
		ItemEntity itementity = new ItemEntity(worldIn, x, y, z); //Create Item Entity
		itementity.setItem(itemstack); //Setting the item of the actual item stack
		itementity.setPos(x, y, z);//For whatever reason, we need to set the position AGAIN
		worldIn.addFreshEntity(itementity); //Add it into the world
		return itementity;
	}

}
