package com.oneswitch.features.viewAllOrder.interf

import com.oneswitch.app.domain.NewOrderGenderEntity
import com.oneswitch.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}