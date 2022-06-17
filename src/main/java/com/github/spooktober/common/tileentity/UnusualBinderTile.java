package com.github.spooktober.common.tileentity;

import javax.annotation.Nonnull;

import com.github.spooktober.core.init.TileEntityInit;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class UnusualBinderTile extends TileEntity{

	private final ItemStackHandler itemHandler = createHandler();
	private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);
	
	public UnusualBinderTile(TileEntityType<?> tileEntityType) {
		super(tileEntityType);
		
	}
	
	public UnusualBinderTile()
	{
		this(TileEntityInit.UNUSUAL_BINDER.get());
	}
	
	private ItemStackHandler createHandler()
	{
		return new ItemStackHandler(3) {
			
			//If something changes in inventory, let tile entity know.
			@Override
			protected void onContentsChanged(int slot) {
				setChanged();
			}
			
			//Used for determining what block can go in what slot
			@Override
			public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
				
				switch(slot)
				{
				//
				}
				return super.isItemValid(slot, stack);
			}
		};
	}
}
