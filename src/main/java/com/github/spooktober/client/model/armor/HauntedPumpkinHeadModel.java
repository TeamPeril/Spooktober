package com.github.spooktober.client.model.armor;

import com.github.spooktober.spooktober;
import net.minecraft.util.ResourceLocation;
import com.github.spooktober.common.item.HauntedPumpkinHead;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HauntedPumpkinHeadModel extends AnimatedGeoModel<HauntedPumpkinHead>{

	@Override
	public ResourceLocation getModelLocation(HauntedPumpkinHead object) {
		return new ResourceLocation(spooktober.MOD_ID, "geo/haunted_pumpkin_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(HauntedPumpkinHead object) {
		return new ResourceLocation(spooktober.MOD_ID, "textures/armor/haunted_pumpkin_head.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(HauntedPumpkinHead animatable) {
		return new ResourceLocation(spooktober.MOD_ID, "animations/haunted_pumpkin_head.animation.json");
	}

	

	
}
