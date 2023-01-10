package com.github.spooktober.client.model.armor;

import com.github.spooktober.common.item.HauntedPumpkinHead;
import com.github.spooktober.common.item.StrawHat;
import com.github.spooktober.spooktober;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StrawHatModel extends AnimatedGeoModel<StrawHat>{

	@Override
	public ResourceLocation getModelLocation(StrawHat object) {
		return new ResourceLocation(spooktober.MOD_ID, "geo/straw_hat.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(StrawHat object) {
		return new ResourceLocation(spooktober.MOD_ID, "textures/armor/straw_hat.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(StrawHat animatable) {
		return new ResourceLocation(spooktober.MOD_ID, "animations/straw_hat.animation.json");
	}

	

	
}
