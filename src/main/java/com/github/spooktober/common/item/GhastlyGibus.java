package com.github.spooktober.common.item;
//https://github.com/bernie-g/geckolib/wiki/Armor-Animations

import com.github.spooktober.core.events.UnusualEvent;
import com.github.spooktober.core.init.UnusualType;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

public class GhastlyGibus extends GeoArmorItem implements IAnimatable{
	
	private AnimationFactory factory = new AnimationFactory(this);
	private double UnusualEffectOffset = 2.3;
	
	public GhastlyGibus(IArmorMaterial armorMaterial, EquipmentSlotType equipSlot, Properties properties) {
		super(armorMaterial, equipSlot, properties);		
	}
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		super.onArmorTick(stack, world, player);
		UnusualEvent.displayUnusualEffect(UnusualType.FIXED_MULTIPLE, ParticleTypes.WITCH, world, player, UnusualEffectOffset);
	}
	
	private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
		return PlayState.STOP; //Do Nothing
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController<GhastlyGibus>(this, "controller", 20, this::predicate));
		
	}

	@Override
	public AnimationFactory getFactory() {
		// TODO Auto-generated method stub
		return this.factory;
	}	
	
}
