package me.kryz.mylib.version;

import lombok.Getter;
import me.kryz.mylib.server.ServerChecker;
import org.bukkit.Bukkit;

public final class VersionManager {
    @Getter
    private static String version;
    @Getter
    private static final String minecraftVersion;

    static {
        minecraftVersion = Bukkit.getServer().getMinecraftVersion();
        try {
            version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
        } catch (Exception e) {
            version = ServerChecker.isPaper() ? "paper" : "unknown-server";
        }
    }

    public static String getRev() {
        return getVersion();
    }

    public static boolean isValidVersionSet() {
        return minecraftVersion != null;
    }

    public static int getNumberVersion(){
        return Integer.parseInt(getMinecraftVersion().replace(".", ""));
    }
}