package net.adansif.genetics.item;

import net.adansif.genetics.AdansifsGenetics;
import net.adansif.genetics.block.ModBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup ADANSIF_GENETICS = Registry.register(Registries.ITEM_GROUP, 
                                                                    new Identifier(AdansifsGenetics.MOD_ID, "adansif-genetics"), 
                                                                    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.adansif-genetics"))
                                                                    .icon(() -> new ItemStack(ModItem.FOSSIL)).entries((displayContext, entries) -> {
                            /*Here we add items to the group*/          entries.add(ModItem.FOSSIL);
                                                                        entries.add(ModBlock.FOSSIL_BLOCK);
                                                                    }).build());

    public static void registerItemGroup(){
        AdansifsGenetics.LOGGER.info("Registering group for " + AdansifsGenetics.MOD_ID);
    }

}
