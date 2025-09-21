package azure.runecircuit.blocks.fluids

import net.minecraft.block.BlockState
import net.minecraft.fluid.FlowableFluid
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.item.Item
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView
import net.minecraft.world.World
import net.minecraft.world.WorldAccess
import net.minecraft.world.WorldView
import net.minecraft.block.Block
import net.minecraft.util.math.Vec3d

abstract class PureMana: FlowableFluid() {
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

    override fun getVelocity(world: BlockView?, pos: BlockPos?, state: FluidState?): Vec3d? {
        return super.getVelocity(world, pos, state)
    }

    override fun beforeBreakingBlock(world: WorldAccess?, pos: BlockPos?, state: BlockState?) {
        val blockEntity = if (state!!.hasBlockEntity()) world!!.getBlockEntity(pos) else null
        Block.dropStacks(state, world, pos, blockEntity)
    }

    override fun matchesType(fluid: Fluid?): Boolean {
        return super.matchesType(fluid)
    }
    protected override fun canBeReplacedWith(
        fluidState: FluidState,
        world: BlockView,
        blockPos: BlockPos,
        fluid: Fluid,
        direction: Direction
    ): Boolean {
        return false
    }




    override fun isInfinite(world: World?): Boolean {
        return true
    }

    override fun getTickRate(world: WorldView?): Int {
        return 5
    }

    protected override fun getBlastResistance(): Float {
        return 100.0f
    }

    protected override fun getLevelDecreasePerBlock(world: WorldView?): Int {
        return 1
    }

}