package azure.runecircuit.blocks

import net.minecraft.block.AmethystClusterBlock
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView

open class CrystalCluster(settings: Settings) : AmethystClusterBlock(7.0f, 0.0f,
    settings.nonOpaque()
) {
    override fun getOutlineShape(
        state: BlockState?,
        world: BlockView?,
        pos: BlockPos?,
        context: ShapeContext?
    ): VoxelShape? {
        return createCuboidShape(3.0, 0.0, 3.0, 13.0, 7.0, 13.0)

    }

    override fun getCollisionShape(
        state: BlockState?,
        world: BlockView?,
        pos: BlockPos?,
        context: ShapeContext?
    ): VoxelShape? {
        return super.getCollisionShape(state, world, pos, context)
    }
}