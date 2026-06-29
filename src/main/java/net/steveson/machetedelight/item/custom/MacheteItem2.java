package net.steveson.machetedelight.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.steveson.machetedelight.util.ModTags;

import java.util.List;

public class MacheteItem2 extends SwordItem {
    public MacheteItem2(Tier tier, Properties properties) {
        super(tier, properties.component(DataComponents.TOOL, tier.createToolProperties(ModTags.Blocks.MINEABLE_MACHETE)));
    }

}
