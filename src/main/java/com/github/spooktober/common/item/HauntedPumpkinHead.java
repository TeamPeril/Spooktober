package com.github.spooktober.common.item;

import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.github.spooktober.common.item.model.ArmorBaseModel;
import com.github.spooktober.core.events.UnusualEvent;
import com.github.spooktober.core.init.UnusualType;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HauntedPumpkinHead extends ArmorItem {
	
	private Supplier<Supplier<ArmorBaseModel>> armorModel;
	
	public HauntedPumpkinHead(IArmorMaterial armorMaterial, EquipmentSlotType equipSlot, Properties properties) {
		super(armorMaterial, equipSlot, properties);
		this.armorModel = armorModel;
	}
	
	@OnlyIn(Dist.CLIENT)
    @Nullable
    @Override
    public final BipedModel getArmorModel(LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor) {
        return armorModel.get().get().applyEntityStats(defaultArmor).applySlot(armorSlot);
    }
	
	@Nullable
    @Override
    public final String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return armorModel.get().get().getTexture();
    }
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		super.onArmorTick(stack, world, player);
		UnusualEvent.displayUnusualEffect(UnusualType.ORBIT, ParticleTypes.FLAME, world, player);
	}
}
