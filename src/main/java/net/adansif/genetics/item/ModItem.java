package net.adansif.genetics.item;

import net.adansif.genetics.AdansifsGenetics;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItem {

    public static final Item FOSSIL = registerItem("fossil", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(FOSSIL);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(AdansifsGenetics.MOD_ID, name), item);
    }
    
    public static void registerModItems(){
        AdansifsGenetics.LOGGER.info("Registering an Item for " + AdansifsGenetics.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItem::addItemsToIngredientItemGroup);
    }

}
