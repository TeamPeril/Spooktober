package com.github.spooktober.client.model.armor;

import com.github.spooktober.common.item.ChopperHat;
import com.github.spooktober.common.item.StrawHat;
import com.github.spooktober.spooktober;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChopperHatModel extends AnimatedGeoModel<ChopperHat>{

	@Override
	public ResourceLocation getModelLocation(ChopperHat object) {
		return new ResourceLocation(spooktober.MOD_ID, "geo/chopper_hat.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ChopperHat object) {
		return new ResourceLocation(spooktober.MOD_ID, "textures/armor/chopper_hat.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(ChopperHat animatable) {
		return new ResourceLocation(spooktober.MOD_ID, "animations/chopper_hat.animation.json");
	}

	

	
}
