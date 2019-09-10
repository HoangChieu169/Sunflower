package com.google.samples.apps.sunflower

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.sunflower.R
import kotlin.Int
import kotlin.String

class HomeViewPagerFragmentDirections private constructor() {
    private data class ActionViewPagerFragmentToPlantDetailFragment(val plantId: String) :
        NavDirections {
        override fun getActionId(): Int = R.id.action_view_pager_fragment_to_plant_detail_fragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("plantId", this.plantId)
            return result
        }
    }

    companion object {
        fun actionViewPagerFragmentToPlantDetailFragment(plantId: String): NavDirections =
            ActionViewPagerFragmentToPlantDetailFragment(plantId)
    }
}
