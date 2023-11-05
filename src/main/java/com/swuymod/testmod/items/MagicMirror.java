package com.swuymod.testmod.items;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class MagicMirror extends Item
{

    public MagicMirror(Properties properties)
    {
        super(properties);
    }

    @NotNull
    @Override
    public  InteractionResultHolder<ItemStack> use(Level level, @NotNull Player player, @NotNull InteractionHand useHand)
    {
        if (level.isClientSide()) {
            return super.use(level, player, useHand);
        } // 判断是否在客户端层面, 如果不在客户端则返回"必须在客户端操作"


        ServerPlayer serverPlayer = (ServerPlayer) player; // 强制转型

        BlockPos respawnPos = serverPlayer.getRespawnPosition(); // 获取到Respawn position

        assert respawnPos != null; // 插入断言 判断如果这个 position 是不是为空, 如果是则返回报错
        player.teleportTo(respawnPos.getX(), respawnPos.getY(), respawnPos.getZ()); // 将玩家传送到指定位置


        return InteractionResultHolder.success(player.getItemInHand(useHand));
    }
}
