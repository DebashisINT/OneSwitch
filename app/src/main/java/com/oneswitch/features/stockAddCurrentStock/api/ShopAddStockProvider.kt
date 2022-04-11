package com.oneswitch.features.stockAddCurrentStock.api

import com.oneswitch.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.oneswitch.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}