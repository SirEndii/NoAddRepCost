package de.srendi.noaddrepcost.fabric;

import de.srendi.noaddrepcost.NoAddRepCost;
import net.fabricmc.api.ModInitializer;

public class NoAddRepCostFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        NoAddRepCost.init();
    }
}