package com.oneswitch.features.addAttendence.api.leavetytpeapi

import com.oneswitch.app.Pref
import com.oneswitch.base.BaseResponse
import com.oneswitch.features.addAttendence.model.ApprovalLeaveResponseModel
import com.oneswitch.features.addAttendence.model.LeaveTypeResponseModel
import com.oneswitch.features.leaveapplynew.model.ApprovalRejectReqModel
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeRepo(val apiService: LeaveTypeApi) {
    fun getLeaveTypeList(): Observable<LeaveTypeResponseModel> {
        return apiService.getLeaveTypeList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getApprovalLeaveList(userId:String): Observable<ApprovalLeaveResponseModel> {
        return apiService.getApprovalLeaveList(Pref.session_token!!,userId)
    }

    fun postApprovalRejectclick(ApprovalRejectReqModel: ApprovalRejectReqModel): Observable<BaseResponse> {
        return apiService.postApprovalRejectclick(ApprovalRejectReqModel)
    }
}