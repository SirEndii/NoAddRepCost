package de.srendi.noaddrepcost.forge;

import dev.architectury.platform.forge.EventBuses;
import de.srendi.noaddrepcost.NoAddRepCost;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NoAddRepCost.MOD_ID)
public class NoAddRepCostForge {
    public NoAddRepCostForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(NoAddRepCost.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        NoAddRepCost.init();
    }
}