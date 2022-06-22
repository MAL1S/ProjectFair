package com.inrtu.datadomain.domain.model

import com.google.gson.annotations.SerializedName

data class Specialty(
    val id: Int?,
    val name: String?,
    @SerializedName("institute_id") val instituteId: Int?
)
