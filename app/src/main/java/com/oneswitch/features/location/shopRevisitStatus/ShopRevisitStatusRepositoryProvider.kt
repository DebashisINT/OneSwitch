package com.oneswitch.features.location.shopRevisitStatus

import com.oneswitch.features.location.shopdurationapi.ShopDurationApi
import com.oneswitch.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}