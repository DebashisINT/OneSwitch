package com.oneswitch.features.login.model.productlistmodel

import com.oneswitch.app.domain.ModelEntity
import com.oneswitch.app.domain.ProductListEntity
import com.oneswitch.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}