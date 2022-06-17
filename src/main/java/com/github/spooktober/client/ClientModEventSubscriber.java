package com.github.spooktober.client;

import com.github.spooktober.spooktober;
import com.github.spooktober.client.renderer.armor.GhastlyGibusRenderer;
import com.github.spooktober.client.renderer.armor.HauntedPumpkinHeadRenderer;
import com.github.spooktober.common.item.GhastlyGibus;
import com.github.spooktober.common.item.HauntedPumpkinHead;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(modid = spooktober.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {
	
	@SubscribeEvent
	public static void registerRenderers(final FMLClientSetupEvent event) {
		GeoArmorRenderer.registerArmorRenderer(HauntedPumpkinHead.class, new HauntedPumpkinHeadRenderer());
		GeoArmorRenderer.registerArmorRenderer(GhastlyGibus.class, new GhastlyGibusRenderer());
	}

}
