package com.pr55.xmasmd.item;

import com.pr55.xmasmd.ChristmasMusicDiscsFabric;
import com.pr55.xmasmd.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item empty_music_disk = registerItem("empty_music_disk",
            new Item(new Item.Settings().maxCount(64)));

    public static final Item carol_of_the_bells_disk = registerItem("carol_of_the_bells_disk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.carol_of_the_bells_key).maxCount(1)));
    public static final Item feliz_navidad_disk = registerItem("feliz_navidad_disk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.feliz_navidad_key).maxCount(1)));
    public static final Item have_a_holly_jolly_christmas_disk = registerItem("have_a_holly_jolly_christmas_disk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.have_a_holly_jolly_christmas_key).maxCount(1)));
    public static final Item have_yourself_a_merry_christmas_disk = registerItem("have_yourself_a_merry_christmas_disk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.have_yourself_a_merry_christmas_key).maxCount(1)));
    public static final Item ill_be_home_for_christmas_disk = registerItem("ill_be_home_for_christmas_disk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ill_be_home_for_christmas_key).maxCount(1)));
    public static final Item oh_come_all_ye_faithful_disk = registerItem("oh_come_all_ye_faithful_disk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.oh_come_all_ye_faithful_key).maxCount(1)));
    public static final Item we_wish_you_a_merry_christmas_disk = registerItem("we_wish_you_a_merry_christmas_disk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.we_wish_you_a_merry_christmas_key).maxCount(1)));
    public static final Item white_christmas_disk = registerItem("white_christmas_disk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.white_christmas_key).maxCount(1)));

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
