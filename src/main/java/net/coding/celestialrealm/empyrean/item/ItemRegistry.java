package net.coding.celestialrealm.empyrean.item;

import net.coding.celestialrealm.empyrean.item.artifact.WhaleMitten;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "empyrean");

    public static RegistryObject<Item> whaleMitten = ITEMS.register("whale_mitten", () -> {
        return new WhaleMitten();
    });
}
