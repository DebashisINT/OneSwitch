package com.oneswitch.features.dashboard.presentation.api.dayStartEnd

import com.oneswitch.app.Pref
import com.oneswitch.base.BaseResponse
import com.oneswitch.features.dashboard.presentation.model.DaystartDayendRequest
import com.oneswitch.features.dashboard.presentation.model.StatusDayStartEnd
import com.oneswitch.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.oneswitch.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}