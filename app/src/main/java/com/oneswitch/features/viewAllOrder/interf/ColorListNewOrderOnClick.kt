package com.oneswitch.features.viewAllOrder.interf

import com.oneswitch.app.domain.NewOrderColorEntity
import com.oneswitch.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}