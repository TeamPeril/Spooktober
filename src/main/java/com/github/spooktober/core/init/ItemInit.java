package com.github.spooktober.core.init;

import com.github.spooktober.spooktober;
import com.github.spooktober.common.item.CandyChocolateBar;
import com.github.spooktober.common.item.CandyCorn;
import com.github.spooktober.common.item.CandyGumballs;
import com.github.spooktober.common.item.CandyGummyWorms;
import com.github.spooktober.common.item.CandyLollipop;
import com.github.spooktober.core.enums.EnumInit;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, spooktober.MOD_ID);
	
	//Register Candybar
	public static final RegistryObject<CandyChocolateBar> CANDY_CHOCOLATE_BAR = ITEMS.register(EnumInit.itemIDS.candy_chocolate_bar, 
			() -> new CandyChocolateBar(new Item.Properties()
					.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	//Register Lollipop
	public static final RegistryObject<CandyLollipop> CANDY_LOLLIPOP = ITEMS.register(EnumInit.itemIDS.candy_lollipop, 
			() -> new CandyLollipop(new Item.Properties()
					.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Gummy Worms
	public static final RegistryObject<CandyGummyWorms> CANDY_GUMMY_WORMS = ITEMS.register(EnumInit.itemIDS.candy_gummy_worms, 
				() -> new CandyGummyWorms(new Item.Properties()
					.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Gumballs
	public static final RegistryObject<CandyGumballs> CANDY_GUMBALLS = ITEMS.register(EnumInit.itemIDS.candy_gumballs, 
				() -> new CandyGumballs(new Item.Properties()
					.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
	
	//Register Candy Corn
		public static final RegistryObject<CandyCorn> CANDY_CORN = ITEMS.register(EnumInit.itemIDS.candy_corn, 
					() -> new CandyCorn(new Item.Properties()
						.tab(spooktober.SPOOKTOBER_GROUP))); //Modify Properties of food item));
}
