package de.srendi.noaddrepcost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NoAddRepCost {
    public static final String MOD_ID = "noaddrepcost";
    public static final Logger LOGGER = LogManager.getLogger();

    public static void init() {
        LOGGER.info("You're now additional repair costs free <3");
    }
}