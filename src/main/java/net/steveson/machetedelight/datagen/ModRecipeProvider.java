package net.steveson.machetedelight.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.steveson.machetedelight.item.ModItems;
import net.steveson.machetedelight.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        registerMacheteCraftingRecipe(Items.GOLD_INGOT, ModItems.GOLDEN_MACHETE, recipeOutput);
        registerMacheteCraftingRecipe(Items.IRON_INGOT, ModItems.IRON_MACHETE, recipeOutput);
        registerMacheteCraftingRecipe(Items.DIAMOND, ModItems.DIAMOND_MACHETE, recipeOutput);


    }

    private static void registerMacheteCraftingRecipe(ItemLike input, DeferredItem<?> output, RecipeOutput recipeOutput){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output.get())
                .pattern("  #")
                .pattern(" # ")
                .pattern("S  ")
                .define('#', input)
                .define('S', ModTags.Items.STICKS)
                .unlockedBy(getHasName(input), has(input))
                .save(recipeOutput);
    }

}
