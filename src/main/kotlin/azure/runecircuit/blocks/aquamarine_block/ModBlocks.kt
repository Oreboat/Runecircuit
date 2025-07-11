package azure.runecircuit.blocks.aquamarine_block
import azure.runecircuit.RuneCircuit
import azure.runecircuit.Runecircuit
import net.minecraft.block.AbstractBlock
import net.minecraft.block.AmethystClusterBlock
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier

object ModBlocks {

    val CrystalSettings = AbstractBlock.Settings.create().luminance { 15 }.sounds(BlockSoundGroup.AMETHYST_BLOCK)

    val AquamarineBlock = Block(CrystalSettings)
    val AquamarineCluster = CrystalCluster(CrystalSettings)

    val EmeraldCluster = CrystalCluster(CrystalSettings)

    val TopazBlock = Block(CrystalSettings)
    val TopazCluster = CrystalCluster(CrystalSettings)

    val GarnetBlock = Block(CrystalSettings)
    val GarnetCluster = CrystalCluster(CrystalSettings)

    val AmberBlock = Block(CrystalSettings)
    val AmberCluster = CrystalCluster(CrystalSettings)


    private fun registerBlock(name: String, block: Block){
        Registry.register(Registries.BLOCK, Identifier.of(RuneCircuit.MOD_ID, name), block)
        Registry.register(Registries.ITEM, Identifier.of(RuneCircuit.MOD_ID, name), BlockItem(block, Item.Settings()))
    }
    fun initialize(){
        registerBlock("block_of_aquamarine", AquamarineBlock)
        registerBlock("aquamarine_cluster", AquamarineCluster)

        registerBlock("emerald_cluster", EmeraldCluster)

        registerBlock("block_of_topaz", TopazBlock)
        registerBlock("topaz_cluster", TopazCluster)

        registerBlock("block_of_garnet", GarnetBlock)
        registerBlock("garnet_cluster", GarnetCluster)

        registerBlock("block_of_amber", AmberBlock)
        registerBlock("amber_cluster", AmberCluster)

    }

}