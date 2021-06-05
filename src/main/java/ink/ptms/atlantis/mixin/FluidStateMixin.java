package ink.ptms.atlantis.mixin;

import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FluidState.class)
public class FluidStateMixin {

	@Inject(method = "method_15756", at = @At("HEAD"), cancellable = true)
	private void method_15756(BlockView r, BlockPos p, CallbackInfoReturnable<Boolean> c) {
		if (p.getY() >= 127) {
			c.setReturnValue(false);
		}
	}
}
