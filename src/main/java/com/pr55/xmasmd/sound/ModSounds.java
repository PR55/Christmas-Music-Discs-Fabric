package com.pr55.xmasmd.sound;

import com.pr55.xmasmd.ChristmasMusicDiscsFabric;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent carol_of_the_bells = registerSoundEvent("carol_of_the_bells");
    public static final RegistryKey<JukeboxSong> carol_of_the_bells_key = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, "carol_of_the_bells"));

    public static final SoundEvent feliz_navidad = registerSoundEvent("feliz_navidad");
    public static final RegistryKey<JukeboxSong> feliz_navidad_key = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, "feliz_navidad"));

    public static final SoundEvent have_a_holly_jolly_christmas = registerSoundEvent("have_a_holly_jolly_christmas");
    public static final RegistryKey<JukeboxSong> have_a_holly_jolly_christmas_key = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, "have_a_holly_jolly_christmas"));

    public static final SoundEvent ill_be_home_for_christmas = registerSoundEvent("ill_be_home_for_christmas");
    public static final RegistryKey<JukeboxSong> ill_be_home_for_christmas_key = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, "ill_be_home_for_christmas"));

    public static final SoundEvent oh_come_all_ye_faithful = registerSoundEvent("oh_come_all_ye_faithful");
    public static final RegistryKey<JukeboxSong> oh_come_all_ye_faithful_key = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, "oh_come_all_ye_faithful"));

    public static final SoundEvent we_wish_you_a_merry_christmas = registerSoundEvent("we_wish_you_a_merry_christmas");
    public static final RegistryKey<JukeboxSong> we_wish_you_a_merry_christmas_key = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, "we_wish_you_a_merry_christmas"));

    public static final SoundEvent have_yourself_a_merry_christmas = registerSoundEvent("have_yourself_a_merry_christmas");
    public static final RegistryKey<JukeboxSong> have_yourself_a_merry_christmas_key = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, "have_yourself_a_merry_christmas"));

    public static final SoundEvent white_christmas = registerSoundEvent("white_christmas");
    public static final RegistryKey<JukeboxSong> white_christmas_key = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, "white_christmas"));

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(ChristmasMusicDiscsFabric.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        ChristmasMusicDiscsFabric.LOGGER.info("Registering Mod Sounds For " + ChristmasMusicDiscsFabric.MOD_ID);
    }
}
