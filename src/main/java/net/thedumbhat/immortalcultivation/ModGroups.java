package net.thedumbhat.immortalcultivation;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thedumbhat.immortalcultivation.block.ModBlocks;
import net.thedumbhat.immortalcultivation.item.ModItems;

public class ModGroups {
    public static final ItemGroup IMMORTAL_CULTIVATION_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ImmortalCultivation.MOD_ID, "spirit_stone_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SPIRIT_STONE))
                    .displayName(Text.translatable("itemgroup.immortal-cultivation.spirit_stone_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SPIRIT_STONE);
                        entries.add(ModItems.SPIRIT_STONE_SHARD);
                        entries.add(ModBlocks.SPIRIT_STONE_BLOCK);
                    }).build());



    public static void registerGroups() {
        ImmortalCultivation.LOGGER.info("Registering Item Groups for " + ImmortalCultivation.MOD_ID);
    }
}
