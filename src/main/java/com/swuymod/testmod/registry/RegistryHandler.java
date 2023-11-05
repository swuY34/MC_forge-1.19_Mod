package com.swuymod.testmod.registry;

import com.swuymod.testmod.SwuYMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SwuYMod.MODID);

    public static final RegistryObject<Item> XN_BOX = ITEMS.register("xnbox",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SwuYMod.MODID);

    public static final RegistryObject<Block> XN_BOX_nether_block = BLOCKS.register("xnblock",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)));


    public static final RegistryObject<Item> xn_box_block = ITEMS.register("xnblock",
            () -> new BlockItem(XN_BOX_nether_block.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

}
