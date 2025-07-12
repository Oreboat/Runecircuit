package azure.runecircuit.items

import azure.runecircuit.RuneCircuit
import azure.runecircuit.Runecircuit
import azure.runecircuit.blocks.ModBlocks
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registries.ITEM_GROUP
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ModItemGroups {
    val rune_circuit_blocks =Registry.register(Registries.ITEM_GROUP, Identifier.of(RuneCircuit.MOD_ID, "rune_circuit_blocks"), FabricItemGroup.builder()
        .icon { ItemStack(ModBlocks.AquamarineCluster) }
        .displayName(Text.translatable("itemGroup.rune_circuit.rune_circuit_blocks"))
        .entries {
            context, entries ->
            entries.add(ModBlocks.AmberBlock)
            entries.add(ModBlocks.AmberCluster)
            entries.add(ModBlocks.AquamarineBlock)
            entries.add(ModBlocks.AquamarineCluster)
            entries.add(ModBlocks.GarnetBlock)
            entries.add(ModBlocks.GarnetCluster)
            entries.add(ModBlocks.TopazBlock)
            entries.add(ModBlocks.TopazCluster)
            entries.add(ModBlocks.PyriteOre)
            entries.add(ModBlocks.DeepslatePyriteOre)
            entries.add(ModBlocks.PyriteBlock)

        }
        .build())

    val RuneCircuitItems = Registry.register(Registries.ITEM_GROUP, Identifier.of(RuneCircuit.MOD_ID, "rune_circuit_items"), FabricItemGroup.builder()
        .icon { ItemStack(ModItems.AquamarineShard) }
        .displayName(Text.translatable("itemGroup.rune_circuit.rune_circuit_items"))
        .entries {
            context, entries ->
            entries.add(ModItems.AmberShard)
            entries.add(ModItems.AquamarineShard)
            entries.add(ModItems.GarnetShard)
            entries.add(ModItems.TopazShard)
            entries.add(ModItems.RawPyrite)
            entries.add(ModItems.PyriteCrystal)
        }
        .build())
    fun initialize(){

    }
}