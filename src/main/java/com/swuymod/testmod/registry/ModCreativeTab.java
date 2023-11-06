package com.swuymod.testmod.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab SWUY_MOD_TAB = new CreativeModeTab("swuY_mod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryItems.MAGIC_MIRROR.get());
        }
    };
}
