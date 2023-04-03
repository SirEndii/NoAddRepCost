package de.srendi.noaddrepcost.mixin;

import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ItemStack.class)
public class ItemStackMixin {

    /**
     * @author: Srendi
     * @reason: Sets the repair cost to zero
     */
    @Overwrite
    public int getBaseRepairCost() {
        return 0;
    }
}
