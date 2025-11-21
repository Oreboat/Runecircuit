package azure.runecircuit.blocks.fluids

import azure.runecircuit.RuneCircuit
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Blocks
import net.minecraft.block.FluidBlock
import net.minecraft.fluid.FlowableFluid
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier


object ModFluids {

    lateinit var FLOWING_PURE_MANA: FlowableFluid
    lateinit var STILL_PURE_MANA: FlowableFluid
    lateinit var PURE_MANA: FluidBlock
    fun registerFluid(name: String, fluid: FlowableFluid): FlowableFluid {
        return Registry.register(Registries.FLUID, Identifier.of(RuneCircuit.MOD_ID, name), fluid)
    }

    fun initialize(){

        FLOWING_PURE_MANA = registerFluid("flowing_pure_mana", PureMana.Flowing)
        STILL_PURE_MANA = registerFluid("still_pure_mana", PureMana.Still)
        PURE_MANA = Registry.register(Registries.BLOCK, Identifier.of(RuneCircuit.MOD_ID, "pure_mana"), FluidBlock(FLOWING_PURE_MANA,
            FabricBlockSettings.copy(Blocks.WATER)))

    }
}