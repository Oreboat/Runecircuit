package azure.runecircuit.blocks.fluids

import net.minecraft.block.BlockState
import net.minecraft.fluid.FlowableFluid
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.item.Item

abstract class ModFluids: FlowableFluid() {
    override fun getStill(): Fluid? {
        TODO("Not yet implemented")
    }

    override fun getFlowing(): Fluid? {
        TODO("Not yet implemented")
    }

    override fun getBucketItem(): Item? {
        TODO("Not yet implemented")
    }

    override fun toBlockState(state: FluidState?): BlockState? {
        TODO("Not yet implemented")
    }

    protected override fun getBlastResistance(): Float {
        return 100.0f
    }
}