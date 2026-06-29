package net.steveson.machetedelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.steveson.machetedelight.MacheteDelightMod;
import net.steveson.machetedelight.item.custom.MacheteItem;
import net.steveson.machetedelight.item.custom.MacheteItem1;
import net.steveson.machetedelight.item.custom.MacheteItem2;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MacheteDelightMod.MOD_ID);

    public static final DeferredItem<SwordItem> GOLDEN_MACHETE = ITEMS.register("golden_machete",
            ()-> new SwordItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, 2, -2.6f))));


    public static final DeferredItem<MacheteItem2> IRON_MACHETE = ITEMS.register("iron_machete",
            ()-> new MacheteItem2(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 2, -2.6f))));


    public static final DeferredItem<MacheteItem1> DIAMOND_MACHETE = ITEMS.register("diamond_machete",
            ()-> new MacheteItem1(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 2, -2.6f))));

    public static final DeferredItem<MacheteItem> NETHERITE_MACHETE = ITEMS.register("netherite_machete",
            ()-> new MacheteItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 2, -2.6f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
