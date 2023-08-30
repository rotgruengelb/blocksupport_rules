package net.rotgruengelb.blocksupport_rules.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallSignBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import net.rotgruengelb.blocksupport_rules.BlockSupportRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(WallSignBlock.class)
public class WallSignBlockMixin {

    @ModifyReturnValue(
            method = "canPlaceAt",
            at = @At(value = "RETURN", ordinal = 0))
    private boolean modify(boolean original, BlockState state, WorldView world, BlockPos pos) {
        return original || BlockSupportRules.world.get().getGameRules().getBoolean(BlockSupportRules.FLOATING_WALL_SIGN_BLOCKS);
    }


}
