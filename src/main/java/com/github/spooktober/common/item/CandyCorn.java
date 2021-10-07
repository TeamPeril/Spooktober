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



public class CandyCorn extends Item{
	
	private static int EFFECT_DURATION = 200;
	private static int EFFECT_LEVEL = 3;
	private static float EFFECT_CHANCE = 1.0f;
	private static EffectInstance EFFECT_INSTANCE = new EffectInstance(Effects.NIGHT_VISION, EFFECT_DURATION, EFFECT_LEVEL);
	
	private static int NUTRITION = 2;
	private static float SATURATION = 0.1f;
	
	//These are the actual properties of the food
	public static Food FOOD_PROPERTIES = new Food.Builder()
			.effect(() -> EFFECT_INSTANCE, EFFECT_CHANCE) //The actual properties
			.effect(() -> EFFECT_INSTANCE, EFFECT_CHANCE) //This is just incase it recieves null value
			.nutrition(NUTRITION)
			.saturationMod(SATURATION)
			.alwaysEat()
			.build();
	
	//Constructor
	public CandyCorn(Properties properties) {
		super(properties
				.food(FOOD_PROPERTIES)
				); //Get Default Properties		
		
	}
	
	//This changes the text you see when hovering over an item
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		
		super.appendHoverText(stack, worldIn, tooltip, flagIn); //Not sure why we need this		
		tooltip.add(new TranslationTextComponent("tooltip.spooktober.candy")); //Text that displays if not holding shift
		
	}
	
}
