package me.kryz.mylib.logger;

import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.jetbrains.annotations.NotNull;

public final class Logger {
    @Getter @NotNull
    private static final org.apache.logging.log4j.Logger logger = LogManager
            .getLogger(Logger.class);
}
