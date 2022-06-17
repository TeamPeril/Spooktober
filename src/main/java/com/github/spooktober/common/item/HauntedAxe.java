package com.github.spooktober.common.item;
import java.util.List;

import com.github.spooktober.core.events.ModSoundEvents;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class HauntedAxe extends AxeItem {
	
	private static float damageAdditive = 16.0f;
	private static float attackSpeedAdditive = -3.5f;
	private static boolean playedSound = false;
	
	//Constructor
	public HauntedAxe(Properties properties) {
		super(ItemTier.DIAMOND, damageAdditive, attackSpeedAdditive, properties
				.addToolType(ToolType.AXE, 4)
				.durability(1000)
				.setNoRepair()
				.fireResistant()
				); //Get Default Properties		
		
	}
	
	@Override
	public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
		// TODO Auto-generated method stub
		return super.onEntitySwing(stack, entity);
	}
	
	/*
	 *  When in hand and wearing Pumpkin head, give a set bonus
	 */
	@Override
	public void inventoryTick(ItemStack s, World w, Entity e, int p_77663_4_, boolean p_77663_5_) {		
		super.inventoryTick(s, w, e, p_77663_4_, p_77663_5_);
		
		int SPEED_DURATION = 20 * 10;
		int SPEED_LEVEL = 1;
		EffectInstance SPEED_EFFECT = new EffectInstance(Effects.MOVEMENT_SPEED, SPEED_DURATION, SPEED_LEVEL);
		
		//If held in main hand, give speed effect
		//NOTE: I would like to make it so effect is applied if is wearing full set aswell.
		if(e.getType() == EntityType.PLAYER)
		{
			LivingEntity player = (LivingEntity) e; //Get Player
			//If axe in hand
			if(s.equals(player.getItemBySlot(EquipmentSlotType.MAINHAND), false))
			{
				player.addEffect(SPEED_EFFECT);				
				if(playedSound == false)
				{
					playedSound = true;
					//PlaySound
					w.playSound(null, player.blockPosition(), ModSoundEvents.HAUNTED_AXE_EQUIP.get(), SoundCategory.PLAYERS, 1, 1);
				}							
			}
			else //If axe not in hand
			{
				playedSound = false;
			}
		}
	}
	
	//This changes the text you see when hovering over an item
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		
		super.appendHoverText(stack, worldIn, tooltip, flagIn); //Not sure why we need this		
		tooltip.add(new TranslationTextComponent("tooltip.spooktober.haunted_axe")); //Text that displays if not holding shift
		
	}
	
}
