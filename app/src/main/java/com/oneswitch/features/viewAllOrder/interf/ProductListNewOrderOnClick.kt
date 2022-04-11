package com.oneswitch.features.viewAllOrder.interf

import com.oneswitch.app.domain.NewOrderGenderEntity
import com.oneswitch.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}