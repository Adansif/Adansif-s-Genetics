package net.adansif.genetics.block;

import net.adansif.genetics.AdansifsGenetics;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock{

    public static final Block FOSSIL_BLOCK = registerBlock("fossil_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AdansifsGenetics.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(AdansifsGenetics.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        AdansifsGenetics.LOGGER.info("Registering a block for " + AdansifsGenetics.MOD_ID);
    }
    
}