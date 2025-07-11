package azure.runecircuit

import azure.runecircuit.blocks.aquamarine_block.ModBlocks

object RuneCircuit {

    val MOD_ID: String = "rune_circuit"

    fun onInitialize(){
        ModBlocks.initialize()
    }
}