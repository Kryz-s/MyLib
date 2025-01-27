package me.kryz.mylib.common.injector;

import org.apache.logging.log4j.Logger;
import org.bukkit.entity.Player;

public interface PlayerInjector {
     void inject(Player player, Logger plugin);
}
