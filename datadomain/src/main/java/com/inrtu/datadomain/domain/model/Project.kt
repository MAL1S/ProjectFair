package com.inrtu.datadomain.domain.model

import com.google.gson.annotations.SerializedName

data class Project(
    val id: Int?,
    val title: String?,
    val places: Int?,
    val goal: String?,
    val description: String?,
    val difficulty: Int?,
    @SerializedName("date_start") val dateStart: String?,
    @SerializedName("date_end") val dateEnd: String?,
    val customer: String?,
    @SerializedName("product_result") val productResult: String?,
    @SerializedName("study_result") val studyResult: String?,
    val supervisors: String?,
    val skills: List<Skill>?,
    val specialities: List<Specialty>?,
    val type: Type?,
    val state: State?,
    val participations: List<Participation>?
)
