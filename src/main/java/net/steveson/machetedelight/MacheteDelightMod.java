package net.steveson.machetedelight;

import net.minecraft.world.item.CreativeModeTabs;
import net.steveson.machetedelight.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MacheteDelightMod.MOD_ID)
public class MacheteDelightMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "machete_delight";

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MacheteDelightMod(IEventBus modEventBus, ModContainer modContainer) {

        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.IRON_MACHETE);
            event.accept(ModItems.GOLDEN_MACHETE);
            event.accept(ModItems.DIAMOND_MACHETE);
            event.accept(ModItems.NETHERITE_MACHETE);
        }
    }
}
