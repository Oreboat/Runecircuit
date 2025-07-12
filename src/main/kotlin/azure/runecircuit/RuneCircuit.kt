package azure.runecircuit

import azure.runecircuit.blocks.ModBlocks
import azure.runecircuit.items.ModItemGroups
import azure.runecircuit.items.ModItems

object RuneCircuit {

    const val MOD_ID: String = "rune_circuit"

    fun onInitialize(){
        ModBlocks.initialize()
        ModItems.initialize()
        ModItemGroups.initialize()
    }
}