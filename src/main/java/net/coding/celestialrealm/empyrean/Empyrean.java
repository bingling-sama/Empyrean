package net.coding.celestialrealm.empyrean;

import net.coding.celestialrealm.empyrean.item.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("empyrean")
public class Empyrean {
    public Empyrean() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
