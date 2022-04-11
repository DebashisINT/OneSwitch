package com.oneswitch.features.nearbyuserlist.api

import com.oneswitch.app.Pref
import com.oneswitch.features.nearbyuserlist.model.NearbyUserResponseModel
import com.oneswitch.features.newcollection.model.NewCollectionListResponseModel
import com.oneswitch.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}