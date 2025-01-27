package me.kryz.mylib.common.packet;

import org.bukkit.entity.Player;

public abstract class PacketListener<T>{
    private final Class<T> packetClass;

    protected PacketListener(Class<T> packetClass) {
        this.packetClass = packetClass;
    }

    /**
     * Intercepts a packet send by the client (player).
     *
     * @param player The player sender
     * @param event  The packet received
     */
    public void read(Player player, PacketEvent<T> event) {
    }

    /**
     * Intercepts a packet send by the server.
     *
     * @param player The player to send
     * @param event  The packet sender
     */
    public void write(Player player, PacketEvent<T> event) {
    }

    /**
     * An auxiliary method to obtain packet class
     * @return packet class
     */
    public Class<?> getPacketClass(){
        return packetClass;
    };
}
