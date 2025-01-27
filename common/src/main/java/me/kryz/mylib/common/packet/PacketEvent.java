package me.kryz.mylib.common.packet;

public final class PacketEvent<T>{
    private T packet;
    private boolean cancelled;

    public PacketEvent(T packet) {
        this.packet = packet;
    }

    public T getPacket() {
        return packet;
    }

    public void setPacket(T packet) {
        this.packet = packet;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
