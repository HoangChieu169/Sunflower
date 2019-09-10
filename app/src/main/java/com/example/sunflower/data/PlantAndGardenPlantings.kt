package com.example.sunflower.data

import androidx.room.Embedded
import androidx.room.Relation
import com.google.samples.apps.sunflower.data.GardenPlanting
import com.google.samples.apps.sunflower.data.Plant as Plant

class PlantAndGardenPlantings(@Embedded val plant: Plant) {
    @Relation(parentColumn = "",entityColumn = "plant_id")
            val gardenPlantings:List<GardenPlanting> = emptyList()
}
