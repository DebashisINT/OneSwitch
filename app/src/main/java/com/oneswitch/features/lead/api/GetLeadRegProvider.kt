package com.oneswitch.features.lead.api

import com.oneswitch.features.NewQuotation.api.GetQuotListRegRepository
import com.oneswitch.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}