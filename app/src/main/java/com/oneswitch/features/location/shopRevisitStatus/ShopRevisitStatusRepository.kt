package com.oneswitch.features.location.shopRevisitStatus

import com.oneswitch.base.BaseResponse
import com.oneswitch.features.location.model.ShopDurationRequest
import com.oneswitch.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}