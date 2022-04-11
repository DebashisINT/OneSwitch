package com.oneswitch.features.stockAddCurrentStock.api

import com.oneswitch.base.BaseResponse
import com.oneswitch.features.location.model.ShopRevisitStatusRequest
import com.oneswitch.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.oneswitch.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.oneswitch.features.stockAddCurrentStock.model.CurrentStockGetData
import com.oneswitch.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}