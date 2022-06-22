package com.inrtu.datadomain.domain.model

import com.google.gson.annotations.SerializedName

data class Skill(
    val id: Int?,
    val name: String?,
    @SerializedName("skillCategory_id") val skillCategoryId: Int?
)
