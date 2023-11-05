package com.swuymod.testmod.registry;

import net.minecraftforge.eventbus.api.IEventBus;

public class RegistryHandler
{

    public static void registry(IEventBus modEventBus)
    {
        RegistryItems.ITEMS.register(modEventBus);
        RegistryBlocks.BLOCKS.register(modEventBus);
    }
}
