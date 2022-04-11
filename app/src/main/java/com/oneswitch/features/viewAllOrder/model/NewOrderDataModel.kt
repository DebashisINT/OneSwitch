package com.oneswitch.features.viewAllOrder.model

import com.oneswitch.app.domain.NewOrderColorEntity
import com.oneswitch.app.domain.NewOrderGenderEntity
import com.oneswitch.app.domain.NewOrderProductEntity
import com.oneswitch.app.domain.NewOrderSizeEntity
import com.oneswitch.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

