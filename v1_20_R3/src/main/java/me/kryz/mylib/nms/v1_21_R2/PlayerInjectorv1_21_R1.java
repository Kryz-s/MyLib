package me.kryz.mylib.nms.v1_21_R2;

import io.netty.channel.Channel;
import me.kryz.mylib.common.injector.PlayerInjector;
import net.minecraft.network.Connection;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import org.apache.logging.log4j.Logger;
import org.bukkit.craftbukkit.v1_20_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PlayerInjectorv1_21_R1 implements PlayerInjector {
    @Override
    public void inject(Player player, Logger logger) {
        final ServerGamePacketListenerImpl connection = ((CraftPlayer) player).getHandle().connection;
        final Connection networkManager = connection.connection;
        final Channel channel = networkManager.channel;

        if (channel.pipeline().get("packet_listener") == null) {
            channel.pipeline().addBefore("packet_handler", "packet_listener",
                    new PacketDispatcherv1_21_R1(logger, player.getUniqueId(), player.getName()));
        }
    }
}
