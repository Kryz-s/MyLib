package me.kryz.mylib.nms;

import lombok.Getter;
import me.kryz.mylib.common.injector.PlayerInjector;
import me.kryz.mylib.nms.v1_21_R2.PlayerInjectorv1_21_R2;
import me.kryz.mylib.version.VersionManager;

import java.me.kryz.mylib.nms.v1_21_R2.PlayerInjectorv1_21_R1;

public final class PlayerInjectorImpl {

    @Getter
    private static PlayerInjector injector;
    private static final int version = VersionManager.getNumberVersion();

    public void load(){
        if(version == 1213 || version == 1212){
            injector = new PlayerInjectorv1_21_R2();
        }
        else if (version == 1211 || version == 1210) {
            injector = new PlayerInjectorv1_21_R1();
        }
    }
}
