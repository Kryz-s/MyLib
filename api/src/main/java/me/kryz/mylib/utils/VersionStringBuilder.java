package me.kryz.mylib.utils;

import me.kryz.mylib.version.MinecraftVersion;
import org.jetbrains.annotations.NotNull;

public final class VersionStringBuilder {

    @NotNull
    public static String getVersionString(){
        final var stringBuilder = new StringBuilder();
        for(final var ver : MinecraftVersion.values()){
            stringBuilder.append(ver.getVersion()).append(", ");
        }
        if (!stringBuilder.isEmpty()) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        return stringBuilder.toString();
    }
}
