package me.kryz.mylib.version;

import lombok.Getter;
import org.jetbrains.annotations.Nullable;

@Getter
public enum MinecraftVersion {
    v1_20_R3("1.20.3, 1.20.4", "v1_20_R3"),
    v1_21_R1("1.21.0, 1.21.1", "v1_21_R1"),
    v1_21_R2("1.21.2, 1.21.3", "v1_21_R2");

    private final String version;
    private final String formattedVersion;

    MinecraftVersion(final String version, final String formattedVersion){
        this.version = version;
        this.formattedVersion = formattedVersion;
    }

    @Nullable
    public static MinecraftVersion getEnumFromVersion(final String version){
        for (final MinecraftVersion ver : MinecraftVersion.values()){
            if(ver.getVersion().contains(version)){
                return ver;
            }
        }
        return null;
    }

    public static String getFormatted(final String version){
        final MinecraftVersion ver = getEnumFromVersion(version);
        return (ver != null) ? ver.getFormattedVersion() : "UNKNOWN_VERSION";
    }
}
