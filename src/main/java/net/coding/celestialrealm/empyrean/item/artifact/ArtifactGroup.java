package net.coding.celestialrealm.empyrean.item.artifact;

import net.coding.celestialrealm.empyrean.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ArtifactGroup extends ItemGroup {

    public ArtifactGroup() {
        super("artifact_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.whaleMitten.get());
    }
}
