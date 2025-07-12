package azure.runecircuit.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Debug(export = true)
@Mixin(Block.class)
public class EmeraldBlockMixin {
    @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true)
    private static AbstractBlock.Settings modifySettings(AbstractBlock.Settings value) {

        return value.luminance(state -> 15);
    }
}