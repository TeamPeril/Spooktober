package com.github.spooktober.client.model.armor;

import com.github.spooktober.spooktober;
import net.minecraft.util.ResourceLocation;

import com.github.spooktober.common.item.GhastlyGibus;
import com.github.spooktober.common.item.HauntedPumpkinHead;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GhastlyGibusModel extends AnimatedGeoModel<GhastlyGibus>{

	@Override
	public ResourceLocation getModelLocation(GhastlyGibus object) {
		return new ResourceLocation(spooktober.MOD_ID, "geo/ghastly_gibus.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GhastlyGibus object) {
		return new ResourceLocation(spooktober.MOD_ID, "textures/armor/ghastly_gibus.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(GhastlyGibus animatable) {
		return new ResourceLocation(spooktober.MOD_ID, "animations/ghastly_gibus.animation.json");
	}

	

	
}
