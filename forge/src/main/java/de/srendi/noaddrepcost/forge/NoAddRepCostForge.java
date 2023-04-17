package de.srendi.noaddrepcost.forge;

import de.srendi.noaddrepcost.NoAddRepCost;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(NoAddRepCost.MOD_ID)
public class NoAddRepCostForge {
    public NoAddRepCostForge() {
        MinecraftForge.EVENT_BUS.register(this);

        NoAddRepCost.init();
    }
}