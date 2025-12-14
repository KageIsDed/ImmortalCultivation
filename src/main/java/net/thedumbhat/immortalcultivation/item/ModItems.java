package net.thedumbhat.immortalcultivation.item;

import net.thedumbhat.immortalcultivation.ImmortalCultivation;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ModItems {
    public static final  Item SPIRIT_STONE_SHARD = registerItem("spirit_stone_shard", new Item(new Item.Settings()));
    public static final  Item SPIRIT_STONE = registerItem("spirit_stone", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ImmortalCultivation.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ImmortalCultivation.LOGGER.info("Registering Mod Items for" + ImmortalCultivation.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SPIRIT_STONE_SHARD);
            entries.add(SPIRIT_STONE);
        });
    }
}