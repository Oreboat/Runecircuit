package azure.runecircuit.items

import azure.runecircuit.RuneCircuit
import azure.runecircuit.tools.CrystalStaff
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {
    private fun addItem(name: String, item: Item){
        Registry.register(Registries.ITEM, Identifier.of(RuneCircuit.MOD_ID, name), item)
    }

    val RawPyrite = Item(Item.Settings())
    val PyriteCrystal = Item(Item.Settings())

    val AmberShard = Item(Item.Settings())
    val AquamarineShard = Item(Item.Settings())
    val GarnetShard = Item(Item.Settings())
    val TopazShard = Item(Item.Settings())
    val CrystalStaff = Item(Item.Settings())
    val PureManaBucket = PureManaBucket()

    fun initialize(){
        addItem("raw_pyrite", RawPyrite)
        addItem("pyrite_crystal", PyriteCrystal)
        addItem("amber_shard", AmberShard)
        addItem("aquamarine_shard", AquamarineShard)
        addItem("garnet_shard", GarnetShard)
        addItem("topaz_shard", TopazShard)
        addItem("crystal_staff", CrystalStaff)
        addItem("pure_mana_bucket", PureManaBucket)
    }
}