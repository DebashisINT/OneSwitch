package com.oneswitch.features.viewAllOrder.interf

import com.oneswitch.app.domain.NewOrderProductEntity
import com.oneswitch.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}