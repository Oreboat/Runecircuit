package azure.runecircuit.blocks
import azure.runecircuit.RuneCircuit
import azure.runecircuit.blocks.CrystalCluster
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.FlowerBlock
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier

object ModBlocks {

    val CrystalSettings: AbstractBlock.Settings = AbstractBlock.Settings.create().luminance { 15 }.hardness(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)

    val AquamarineBlock = Block(CrystalSettings)
    val AquamarineCluster = CrystalCluster(CrystalSettings)

    val EmeraldCluster = CrystalCluster(CrystalSettings)

    val TopazBlock = Block(CrystalSettings)
    val TopazCluster = CrystalCluster(CrystalSettings)

    val GarnetBlock = Block(CrystalSettings)
    val GarnetCluster = CrystalCluster(CrystalSettings)

    val AmberBlock = Block(CrystalSettings)
    val AmberCluster = CrystalCluster(CrystalSettings)

    val CorruptCrystalBlock = CorruptedCrystalBlock()
    val CorruptCrystalCluster = CorruptedCrystalCluster()

    val PyriteOre = Block(AbstractBlock.Settings.create().hardness(4.5f))
    val DeepslatePyriteOre = Block(AbstractBlock.Settings.create().hardness(4.5f))
    val PyriteBlock = Block(AbstractBlock.Settings.create().hardness(5f))


    private fun registerBlock(name: String, block: Block){
        Registry.register(Registries.BLOCK, Identifier.of(RuneCircuit.MOD_ID, name), block)
        Registry.register(Registries.ITEM, Identifier.of(RuneCircuit.MOD_ID, name), BlockItem(block, Item.Settings()))
    }
    fun initialize(){

        registerBlock("pyrite_ore", PyriteOre)
        registerBlock("deepslate_pyrite_ore", DeepslatePyriteOre)
        registerBlock("pyrite_block", PyriteBlock)

        registerBlock("block_of_aquamarine", AquamarineBlock)
        registerBlock("aquamarine_cluster", AquamarineCluster)

        registerBlock("emerald_cluster", EmeraldCluster)

        registerBlock("block_of_topaz", TopazBlock)
        registerBlock("topaz_cluster", TopazCluster)

        registerBlock("block_of_garnet", GarnetBlock)
        registerBlock("garnet_cluster", GarnetCluster)

        registerBlock("block_of_amber", AmberBlock)
        registerBlock("amber_cluster", AmberCluster)

        registerBlock("block_of_corrupted_crystal", CorruptCrystalBlock)
        registerBlock("corrupted_crystal_cluster", CorruptCrystalCluster)

    }

}