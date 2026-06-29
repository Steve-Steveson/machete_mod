package net.steveson.machetedelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.steveson.machetedelight.MacheteDelightMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MacheteDelightMod.MOD_ID);

    public static final DeferredItem<SwordItem> GOLDEN_MACHETE = ITEMS.register("golden_machete",
            ()-> new SwordItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, 2, -2.6f))));
    public static final DeferredItem<SwordItem> IRON_MACHETE = ITEMS.register("iron_machete",
            ()-> new SwordItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 2, -2.6f))));
    public static final DeferredItem<SwordItem> DIAMOND_MACHETE = ITEMS.register("diamond_machete",
            ()-> new SwordItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 2, -2.6f))));
    public static final DeferredItem<SwordItem> NETHERITE_MACHETE = ITEMS.register("netherite_machete",
            ()-> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 2, -2.6f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
