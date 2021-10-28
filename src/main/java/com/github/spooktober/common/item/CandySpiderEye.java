package com.github.spooktober.common.item;
import java.util.List;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;



public class CandySpiderEye extends Item{
	
	private static int EFFECT_DURATION = 600;
	private static int EFFECT_LEVEL = 0;
	private static float EFFECT_CHANCE = 1.0f;
	private static EffectInstance EFFECT_SPEED = new EffectInstance(Effects.MOVEMENT_SPEED, EFFECT_DURATION, EFFECT_LEVEL);
	private static EffectInstance EFFECT_NIGHTVISION = new EffectInstance(Effects.NIGHT_VISION, EFFECT_DURATION, EFFECT_LEVEL);
	
	private static int NUTRITION = 2;
	private static float SATURATION = 0.1f;
	
	//These are the actual properties of the food
	public static Food FOOD_PROPERTIES = new Food.Builder()
			.effect(() -> EFFECT_SPEED, EFFECT_CHANCE)
			.effect(() -> EFFECT_NIGHTVISION, EFFECT_CHANCE)
			.nutrition(NUTRITION)
			.saturationMod(SATURATION)
			.alwaysEat()
			.build();
	
	//Constructor
	public CandySpiderEye(Properties properties) {
		super(properties
				.food(FOOD_PROPERTIES)
				); //Get Default Properties		
		
	}
	
	//This changes the text you see when hovering over an item
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		
		super.appendHoverText(stack, worldIn, tooltip, flagIn); //Not sure why we need this		
		tooltip.add(new TranslationTextComponent("tooltip.spooktober.candy_rare")); //Text that displays if not holding shift
		
	}
	
}
