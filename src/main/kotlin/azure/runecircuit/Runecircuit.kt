package azure.runecircuit

import azure.runecircuit.blocks.aquamarine_block.ModBlocks
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory


class Runecircuit : ModInitializer {



    override fun onInitialize() {
        //val world = configuredWorld{}

        RuneCircuit.onInitialize();
    }
}
