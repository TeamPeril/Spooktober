package com.github.spooktober.core.init;

import com.github.spooktober.spooktober;
import com.github.spooktober.common.tileentity.UnusualBinderTile;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit {
	
	public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
			DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, spooktober.MOD_ID);
	
	public static void register(IEventBus eventBus)
	{
		TILE_ENTITIES.register(eventBus);
	}
	
	public static RegistryObject<TileEntityType<UnusualBinderTile>> UNUSUAL_BINDER =
			TILE_ENTITIES.register("unusual_binder", () -> TileEntityType.Builder.of(
					UnusualBinderTile::new, BlockInit.UNUSUAL_BINDER.get()).build(null));
	
	

}
