package com.github.spooktober.client.model.armor;

import com.github.spooktober.common.item.PaperMaskZombie;
import com.github.spooktober.spooktober;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PaperMaskZombieModel extends AnimatedGeoModel<PaperMaskZombie>{

	@Override
	public ResourceLocation getModelLocation(PaperMaskZombie object) {
		return new ResourceLocation(spooktober.MOD_ID, "geo/paper_mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PaperMaskZombie object) {
		return new ResourceLocation(spooktober.MOD_ID, "textures/armor/paper_mask_zombie.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(PaperMaskZombie animatable) {
		return new ResourceLocation(spooktober.MOD_ID, "animations/paper_mask.animation.json");
	}

	

	
}
