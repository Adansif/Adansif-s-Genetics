package net.adansif.genetics;

import net.adansif.genetics.block.ModBlock;
import net.adansif.genetics.item.ModItem;
import net.adansif.genetics.item.ModItemGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdansifsGenetics implements ModInitializer {
	public static final String MOD_ID = "adansifs-genetics";
    public static final Logger LOGGER = LoggerFactory.getLogger("adansifs-genetics");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItem.registerModItems();
		ModBlock.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}