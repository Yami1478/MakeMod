package Rzmor.init;

import Rzmor.Main;
import Rzmor.item.Saitama;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ItemMod {
	
	public static Item SaitamaHead = ((Item)(new Saitama(Main.lv2, 4, EntityEquipmentSlot.HEAD)).setUnlocalizedName("SaitamaHead").setRegistryName("SaitamaHead")).setCreativeTab(Main.tabHelmets);	

	@EventBusSubscriber(modid = "RZmor")
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			IForgeRegistry<Item> registry = event.getRegistry();
			registry.register((Item)ItemMod.SaitamaHead);
		}
	}
	
}
