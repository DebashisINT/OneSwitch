package com.oneswitch.features.dashboard.presentation.api.dayStartEnd

import com.oneswitch.features.stockCompetetorStock.api.AddCompStockApi
import com.oneswitch.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}