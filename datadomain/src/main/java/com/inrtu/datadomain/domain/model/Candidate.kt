package com.inrtu.datadomain.domain.model

import com.google.gson.annotations.SerializedName

data class Candidate(
    val id: Int?,
    val fio: String?,
    val about: String?,
    val email: String?,
    val numz: String?,
    val phone: String?,
    val course: Int?,
    @SerializedName("training_group") val group: String?
)
