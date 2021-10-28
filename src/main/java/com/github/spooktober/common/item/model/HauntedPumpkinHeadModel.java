package com.github.spooktober.common.item.model;

import java.util.function.Function;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;

public class HauntedPumpkinHeadModel extends ArmorBaseModel{

	public HauntedPumpkinHeadModel() {
		super(48, 32, new ResourceLocation("spooktober:item/haunted_axe"));
	}

	@Override
	public void setupArmorParts() {
    //You need to cut out some parts from Blockbenchs exported model, and paste them here.
    //You can see 2 examples of how this may look, adding a cube to the head
    //and a rotated cube on the chest
    //Export the unedited armor template to see which parts you should **not** copy over
		armorHead.cubeList.add(new ModelBox(armorHead, 0, 18, -0.5F, -22.0F, -5.0F, 1, 22, 10, 0.0F, false));
    
		ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, -0.7854F);
		armorBody.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 18, 82, -4.0F, 1.0F, -3.0F, 3, 3, 1, 0.0F, false));
  }

}
