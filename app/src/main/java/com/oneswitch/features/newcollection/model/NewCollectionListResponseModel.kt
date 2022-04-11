package com.oneswitch.features.newcollection.model

import com.oneswitch.app.domain.CollectionDetailsEntity
import com.oneswitch.base.BaseResponse
import com.oneswitch.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}