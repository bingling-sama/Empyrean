package net.coding.celestialrealm.empyrean.item.artifact;

import net.coding.celestialrealm.empyrean.item.EmpyreanItemGroup;
import net.minecraft.item.Item;

public class WhaleMitten extends SwordItem {
    public static IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUse() {
            return 5000;
        }
        @Override
        public float getEfficiency() {
            return 10.0F;
        }
        @Override
        public float getAttackDamage() {
            return 20.0F;
        }
        @Override
        public int getHarvestLevel() {
            return 3;
        }
        @Override
        public int getEnchantability() {
            return 30;
        }
        @Override
        public Ingredient getRepairMaterrial() {
            return Ingredient.fromItems(ItemRegistry.whaleBone.get());
        }
    };

    public WhaleMitten() {
        super(iItemTier, 3, -2.4F, new Item.Properties().group(ItemGroup.ArtifactGroup));
    }
}
