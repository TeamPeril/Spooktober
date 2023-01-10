package com.github.spooktober.client.model.armor;

import com.github.spooktober.common.item.PaperMaskCreeper;
import com.github.spooktober.common.item.PaperMaskDefault;
import com.github.spooktober.spooktober;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PaperMaskCreeperModel extends AnimatedGeoModel<PaperMaskCreeper>{

	@Override
	public ResourceLocation getModelLocation(PaperMaskCreeper object) {
		return new ResourceLocation(spooktober.MOD_ID, "geo/paper_mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PaperMaskCreeper object) {
		return new ResourceLocation(spooktober.MOD_ID, "textures/armor/paper_mask_creeper.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(PaperMaskCreeper animatable) {
		return new ResourceLocation(spooktober.MOD_ID, "animations/paper_mask.animation.json");
	}

	

	
}
