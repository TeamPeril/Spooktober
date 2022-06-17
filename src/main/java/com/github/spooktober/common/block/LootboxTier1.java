package com.github.spooktober.common.block;

import static com.github.spooktober.common.item.ItemMethods.dropItemEntity;
import static com.github.spooktober.common.item.ItemMethods.getRandomCandyID;
import static com.github.spooktober.common.item.ItemMethods.getRandomHatID;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LootboxTier1 extends Block{
	
	public LootboxTier1(Properties prop) {
		super(prop);
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void onRemove(BlockState blockstate1, World world, BlockPos pos, BlockState blockstate2,
			boolean p_196243_5_) {		
		super.onRemove(blockstate1, world, pos, blockstate2, p_196243_5_);		
		
		double poolCandyChance = 0.8;
		double rng = Math.random();
		
		if(rng > poolCandyChance)
		{
			dropItemEntity(world, getRandomHatID(), pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 1);
		}
		else
		{
			dropItemEntity(world, getRandomCandyID(), pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 8);
		}
	}		
}
