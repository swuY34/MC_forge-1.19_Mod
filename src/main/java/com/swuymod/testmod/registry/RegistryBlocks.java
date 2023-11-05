package com.swuymod.testmod.registry;

import com.swuymod.testmod.SwuYMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryBlocks
{

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SwuYMod.MODID);

    public static final RegistryObject<Block> XN_BOX_nether_block = BLOCKS.register("xnblock",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)));


}
