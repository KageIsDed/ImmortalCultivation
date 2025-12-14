package net.thedumbhat.immortalcultivation;

import net.fabricmc.api.ModInitializer;

import net.thedumbhat.immortalcultivation.block.ModBlocks;
import net.thedumbhat.immortalcultivation.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImmortalCultivation implements ModInitializer {
	public static final String MOD_ID = "immortal-cultivation";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModGroups.registerGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}