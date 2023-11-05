package com.swuymod.testmod.registry;

import com.swuymod.testmod.SwuYMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SwuYMod.MODID);

    public static final RegistryObject<Item> XN_BOX = ITEMS.register("xnbox",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> xn_box_block = ITEMS.register("xnblock",
            () -> new BlockItem(RegistryBlocks.XN_BOX_nether_block.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

}
