package azure.runecircuit

import azure.runecircuit.blocks.ModBlocks
import azure.runecircuit.items.ModItemGroups
import azure.runecircuit.items.ModItems
import com.github.quillraven.fleks.configureWorld

object RuneCircuit {

    const val MOD_ID: String = "rune_circuit"
    val world = configureWorld {  }

    fun onInitialize(){
        ModBlocks.initialize()
        ModItems.initialize()
        ModItemGroups.initialize()
    }
}