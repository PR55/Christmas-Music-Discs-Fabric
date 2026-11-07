package com.pr55.xmasmd.item;

import com.pr55.xmasmd.ChristmasMusicDiscsFabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup DUMMY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ChristmasMusicDiscsFabric.MOD_ID,"tabchristmas_songs"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack((ModItems.carol_of_the_bells_disk)))
                    .displayName(Text.translatable("item_group.xmas-md.christmas_songs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.empty_music_disk);
                        entries.add(ModItems.carol_of_the_bells_disk);
                        entries.add(ModItems.feliz_navidad_disk);
                        entries.add(ModItems.have_a_holly_jolly_christmas_disk);
                        entries.add(ModItems.have_yourself_a_merry_christmas_disk);
                        entries.add(ModItems.ill_be_home_for_christmas_disk);
                        entries.add(ModItems.oh_come_all_ye_faithful_disk);
                        entries.add(ModItems.we_wish_you_a_merry_christmas_disk);
                        entries.add(ModItems.white_christmas_disk);
                    }).build());

    public static void registerItemGroups(){
        ChristmasMusicDiscsFabric.LOGGER.info("Registering Item Groups for " + ChristmasMusicDiscsFabric.MOD_ID + "!");
    }
}
