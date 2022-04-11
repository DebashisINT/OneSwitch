package com.oneswitch.features.orderList.model

import com.oneswitch.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}