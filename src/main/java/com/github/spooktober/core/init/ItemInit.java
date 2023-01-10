package com.github.spooktober.core.init;

import com.github.spooktober.spooktober;
import com.github.spooktober.common.item.*;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, spooktober.MOD_ID);
	
	//Register Candybar
	public static final RegistryObject<CandyChocolateBar> CANDY_CHOCOLATE_BAR = ITEMS.register("candy_chocolate_bar", 
			() -> new CandyChocolateBar(new Item.Properties()
					.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	//Register Lollipop
	public static final RegistryObject<CandyLollipop> CANDY_LOLLIPOP = ITEMS.register("candy_lollipop", 
			() -> new CandyLollipop(new Item.Properties()
					.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Gummy Worms
	public static final RegistryObject<CandyGummyWorms> CANDY_GUMMY_WORMS = ITEMS.register("candy_gummy_worms", 
			() -> new CandyGummyWorms(new Item.Properties()
				.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Gumballs
	public static final RegistryObject<CandyGumballs> CANDY_GUMBALLS = ITEMS.register("candy_gumballs", 
			() -> new CandyGumballs(new Item.Properties()
				.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Candy Corn
	public static final RegistryObject<CandyCorn> CANDY_CORN = ITEMS.register("candy_corn", 
			() -> new CandyCorn(new Item.Properties()
				.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Candy Spider Eye
	public static final RegistryObject<CandySpiderEye> CANDY_SPIDER_EYE = ITEMS.register("candy_spider_eye", 
			() -> new CandySpiderEye(new Item.Properties()
				.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Candy Slime on a Stick
	public static final RegistryObject<CandySlimeOnAStick> CANDY_SLIME_ON_A_STICK = ITEMS.register("candy_slime_on_a_stick", 
			() -> new CandySlimeOnAStick(new Item.Properties()
				.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Candy Sugar Blaze Stick
	public static final RegistryObject<CandySugarBlazeStick> CANDY_SUGAR_BLAZE_STICK = ITEMS.register("candy_sugar_blaze_stick", 
		() -> new CandySugarBlazeStick(new Item.Properties()
			.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
		
	//Register Haunted Axe
	public static final RegistryObject<HauntedAxe> HAUNTED_AXE = ITEMS.register("haunted_axe", 
		() -> new HauntedAxe(new Item.Properties()
			.tab(spooktober.SPOOKTOBER_GROUP)));
	
	//Register Haunted Pumpkin Head
	public static final RegistryObject<HauntedPumpkinHead> HAUNTED_PUMPKIN_HEAD = ITEMS.register("haunted_pumpkin_head", 
		() -> new HauntedPumpkinHead(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, 
				new Item.Properties()				
			.tab(spooktober.SPOOKTOBER_GROUP)));
	
	//Register Haunted Pumpkin Head
	public static final RegistryObject<GhastlyGibus> GhastlyGibus = ITEMS.register("ghastly_gibus", 
		() -> new GhastlyGibus(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, 
				new Item.Properties()				
			.tab(spooktober.SPOOKTOBER_GROUP)));
	
	//Register Candy Sugar Blaze Stick
	public static final RegistryObject<UnusualEffectApplier> UNUSUAL_EFFECT_APPLIER = ITEMS.register("unusual_effect_applier", 
		() -> new UnusualEffectApplier(new Item.Properties()
			.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));

	//Register Straw Hat
	public static final RegistryObject<StrawHat> StrawHat = ITEMS.register("straw_hat",
			() -> new StrawHat(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD,
					new Item.Properties()
							.tab(spooktober.SPOOKTOBER_GROUP)));

	//Register Paper Mask
	public static final RegistryObject<PaperMaskDefault> PaperMaskDefault = ITEMS.register("paper_mask_default",
			() -> new PaperMaskDefault(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD,
					new Item.Properties()
							.tab(spooktober.SPOOKTOBER_GROUP)));

	//Register Creeper Paper Mask
	public static final RegistryObject<PaperMaskCreeper> PaperMaskCreeper = ITEMS.register("paper_mask_creeper",
			() -> new PaperMaskCreeper(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD,
					new Item.Properties()
							.tab(spooktober.SPOOKTOBER_GROUP)));

	//Register Spider Paper Mask
	public static final RegistryObject<PaperMaskSpider> PaperMaskSpider = ITEMS.register("paper_mask_spider",
			() -> new PaperMaskSpider(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD,
					new Item.Properties()
							.tab(spooktober.SPOOKTOBER_GROUP)));

	//Register Paper Mask
	public static final RegistryObject<PaperMaskZombie> PaperMaskZombie = ITEMS.register("paper_mask_zombie",
			() -> new PaperMaskZombie(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD,
					new Item.Properties()
							.tab(spooktober.SPOOKTOBER_GROUP)));

	//Register Straw Hat
	public static final RegistryObject<ChopperHat> ChopperHat = ITEMS.register("chopper_hat",
			() -> new ChopperHat(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD,
					new Item.Properties()
							.tab(spooktober.SPOOKTOBER_GROUP)));
}
