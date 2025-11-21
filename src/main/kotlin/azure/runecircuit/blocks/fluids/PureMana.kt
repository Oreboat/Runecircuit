package azure.runecircuit.blocks.fluids

import azure.runecircuit.items.ModItems
import azure.runecircuit.items.PureManaBucket
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
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties
import net.minecraft.util.math.Vec3d

abstract class PureMana: FlowableFluid() {
    override fun getStill(): Fluid? {
        return Still
    }

    override fun getFlowing(): Fluid? {
        return Flowing
    }

    override fun getBucketItem(): Item? {
        return ModItems.PureManaBucket
    }

    override fun toBlockState(state: FluidState?): BlockState? {
        return ModFluids.PURE_MANA.defaultState.with(Properties.LEVEL_15, getBlockStateLevel(state)) as BlockState?;
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

    protected override fun getMaxFlowDistance(world: WorldView?): Int {
        return 10
    }



    object Flowing: PureMana() {

        override fun appendProperties(builder: StateManager.Builder<Fluid?, FluidState?>?) {
            super.appendProperties(builder)
            builder?.add(LEVEL)
        }

        override fun getLevel(state: FluidState?): Int {
            return state?.get(LEVEL) ?: return 0
        }

        override fun isStill(state: FluidState?): Boolean {
            return false
        }

    }

    object Still: PureMana(){
        override fun getLevel(state: FluidState?): Int {
            return 8
        }

        override fun isStill(state: FluidState?): Boolean {
            return true
        }

    }

}