package com.github.spooktober.common.block;

import com.github.spooktober.core.init.TileEntityInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class UnusualBinderBlock extends Block{

	public UnusualBinderBlock(Properties p_i48440_1_) {
		super(p_i48440_1_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityInit.UNUSUAL_BINDER.get().create();
	}

}
