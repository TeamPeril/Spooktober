package com.github.spooktober.client.model.armor;

import com.github.spooktober.common.item.PaperMaskCreeper;
import com.github.spooktober.common.item.PaperMaskSpider;
import com.github.spooktober.spooktober;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PaperMaskSpiderModel extends AnimatedGeoModel<PaperMaskSpider>{

	@Override
	public ResourceLocation getModelLocation(PaperMaskSpider object) {
		return new ResourceLocation(spooktober.MOD_ID, "geo/paper_mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PaperMaskSpider object) {
		return new ResourceLocation(spooktober.MOD_ID, "textures/armor/paper_mask_spider.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(PaperMaskSpider animatable) {
		return new ResourceLocation(spooktober.MOD_ID, "animations/paper_mask.animation.json");
	}

	

	
}
