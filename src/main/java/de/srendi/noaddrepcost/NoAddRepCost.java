package de.srendi.noaddrepcost;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NoAddRepCost.MODID)
public class NoAddRepCost {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "noaddrepcost";

    public NoAddRepCost() {
        LOGGER.info("No additional repair cost for you <3");
    }

}
