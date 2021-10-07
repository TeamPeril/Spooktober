package com.github.spooktober;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.github.spooktober.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(spooktober.MOD_ID)
public class spooktober {
	
	public static final Logger LOGGER = LogManager.getLogger();	
	//Here I've created a variable of our mod id so we can use it throughout our project
    public static final String MOD_ID = "spooktober";
    public static final ItemGroup SPOOKTOBER_GROUP = new CreativeTabGroup("spooktober_tab");
	
	public spooktober()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		
		ItemInit.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		LOGGER.info("Hello from Spooktober.");
		
	}
	
	//Add Creative Item Tab
    public static class CreativeTabGroup extends ItemGroup {
        public CreativeTabGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.CANDY_CHOCOLATE_BAR.get());
        }
    }
}
