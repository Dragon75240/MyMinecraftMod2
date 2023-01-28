package com.dragon.dragonsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DRAGON_TAB = new CreativeModeTab("dragontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DRAGON_SCALE.get());
        }
    };
}
