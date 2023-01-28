package com.dragon.dragonsmod.item;

import com.dragon.dragonsmod.DragonsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, DragonsMod.MOD_ID);

    public static final RegistryObject<Item> DRAGON_EGG = ITEMS.register("dragon_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRAGON_TAB)));

    public static final RegistryObject<Item> DRAGON_SCALE = ITEMS.register("dragon_scale",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRAGON_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
