package com.github.spooktober.client.model.armor;

import com.github.spooktober.common.item.GhastlyGibus;
import com.github.spooktober.common.item.PaperMaskDefault;
import com.github.spooktober.spooktober;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PaperMaskDefaultModel extends AnimatedGeoModel<PaperMaskDefault>{

	@Override
	public ResourceLocation getModelLocation(PaperMaskDefault object) {
		return new ResourceLocation(spooktober.MOD_ID, "geo/paper_mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PaperMaskDefault object) {
		return new ResourceLocation(spooktober.MOD_ID, "textures/armor/paper_mask_default.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(PaperMaskDefault animatable) {
		return new ResourceLocation(spooktober.MOD_ID, "animations/paper_mask.animation.json");
	}

	

	
}
