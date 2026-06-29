package net.steveson.machetedelight.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.steveson.machetedelight.MacheteDelightMod;
import net.steveson.machetedelight.item.ModItems;
import net.steveson.machetedelight.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MacheteDelightMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.PIGLIN_LOVED)
                .add(ModItems.GOLDEN_MACHETE.get());


        tag(ModTags.Items.MY_MACHETE)
                .add(ModItems.GOLDEN_MACHETE.get())
                .add(ModItems.IRON_MACHETE.get())
                .add(ModItems.DIAMOND_MACHETE.get())
                .add(ModItems.NETHERITE_MACHETE.get());

        tag(ModTags.Items.C_MACHETE)
                .add(ModItems.GOLDEN_MACHETE.get())
                .add(ModItems.IRON_MACHETE.get())
                .add(ModItems.DIAMOND_MACHETE.get())
                .add(ModItems.NETHERITE_MACHETE.get());

        tag(ModTags.Items.MELEE)
                .add(ModItems.GOLDEN_MACHETE.get())
                .add(ModItems.IRON_MACHETE.get())
                .add(ModItems.DIAMOND_MACHETE.get())
                .add(ModItems.NETHERITE_MACHETE.get());


        tag(ModTags.Items.FD_KNIFE)
                .addTag(ModTags.Items.MY_MACHETE);

        tag(ItemTags.MINING_ENCHANTABLE)
                .remove(ModTags.Items.MY_MACHETE);
        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                .remove(ModTags.Items.MY_MACHETE);

//        tag(ModTags.Items.DEPLOYER_HANDHELD)
//                .add(ModItems.GOLDEN_MACHETE.get())
//                .add(ModItems.IRON_MACHETE.get())
//                .add(ModItems.DIAMOND_MACHETE.get())
//                .add(ModItems.NETHERITE_MACHETE.get());
    }
}
