package com.inrtu.datadomain.domain.model

import com.google.gson.annotations.SerializedName

data class Participation(
    val id: Int?,
    @SerializedName("updated_at") val updatedAt: String?,
    @SerializedName("created_at") val createdAt: String?,
    val priority: Int?,
    val review: String?,
    @SerializedName("project_id") val projectId: Int?,
    @SerializedName("candidate_id") val candidateId: Int?,
    @SerializedName("state_id") val stateId: Int?
)
