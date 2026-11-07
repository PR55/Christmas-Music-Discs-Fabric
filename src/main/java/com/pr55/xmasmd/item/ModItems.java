package com.pr55.xmasmd.item;

import com.pr55.xmasmd.ChristmasMusicDiscsFabric;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID,name), item);
    }

    public static void registerModItems(){
        ChristmasMusicDiscsFabric.LOGGER.info("Registering Mod Items for " + ChristmasMusicDiscsFabric.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
//            entries.add(PINK_GARNET);
//            entries.add(RAW_PINK_GARNET);
//            entries.add(TROLL_FACE_POINT);
//        });
    }
}
