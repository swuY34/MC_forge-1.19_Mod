package com.swuymod.testmod.registry;

import com.swuymod.testmod.SwuYMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SwuYMod.MODID);

    public static final RegistryObject<Item> XN_BOX = ITEMS.register("xnbox",
            () -> new Item(new Item.Properties()));


}
