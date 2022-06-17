package com.github.spooktober.client.renderer.armor;
//https://github.com/bernie-g/geckolib/wiki/Armor-Animations

import com.github.spooktober.client.model.armor.GhastlyGibusModel;
import com.github.spooktober.common.item.GhastlyGibus;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GhastlyGibusRenderer extends GeoArmorRenderer<GhastlyGibus> {
	public GhastlyGibusRenderer()
	{
		super(new GhastlyGibusModel());

		// These values are what each bone name is in blockbench. So if your head bone
		// is named "bone545", make sure to do this.headBone = "bone545";
		// The default values are the ones that come with the default armor template in
		// the geckolib blockbench plugin.
		this.headBone = "armorHead";
		this.bodyBone = "armorBody";
		this.rightArmBone = "armorRightArm";
		this.leftArmBone = "armorLeftArm";
		this.rightLegBone = "armorRightLeg";
		this.leftLegBone = "armorLeftLeg";
		this.rightBootBone = "armorRightBoot";
		this.leftBootBone = "armorLeftBoot";
	}
}
