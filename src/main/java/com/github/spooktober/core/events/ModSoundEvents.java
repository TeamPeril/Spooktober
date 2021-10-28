package com.github.spooktober.core.events;

import com.github.spooktober.spooktober;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {
	
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
		DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, spooktober.MOD_ID);
	
	public static final RegistryObject<SoundEvent> HAUNTED_AXE_EQUIP = registerSoundEvent("haunted_axe_equip");
	
	private static RegistryObject<SoundEvent> registerSoundEvent(String name)
	{
		return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(spooktober.MOD_ID, name)));
	}
	
	public static void register(IEventBus eventBus)
	{
		SOUND_EVENTS.register(eventBus);
	}

}
