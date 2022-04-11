package com.oneswitch.features.viewAllOrder.interf

import com.oneswitch.app.domain.NewOrderGenderEntity
import com.oneswitch.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}