package com.github.spooktober.core.init;

import java.util.function.Supplier;

import com.github.spooktober.spooktober;
import com.github.spooktober.common.block.LootboxTier1;
import com.github.spooktober.common.block.UnusualBinderBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS
		= DeferredRegister.create(ForgeRegistries.BLOCKS, spooktober.MOD_ID);
	
	private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
	{
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}
	
	private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
	{
		ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), 
				new Item.Properties().tab(spooktober.SPOOKTOBER_GROUP)));		
	}

	public static final RegistryObject<LootboxTier1> LOOTBOX_TIER1 = registerBlock("lootbox_tier1", 
			() -> new LootboxTier1(AbstractBlock.Properties.of(Material.STONE)));
	
	public static final RegistryObject<UnusualBinderBlock> UNUSUAL_BINDER = registerBlock("unusual_binder", 
			() -> new UnusualBinderBlock(AbstractBlock.Properties.of(Material.STONE).noOcclusion()));
}
