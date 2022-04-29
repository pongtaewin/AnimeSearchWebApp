package db

import kotlinx.serialization.Serializable

@Serializable
data class Performance(
    val performance_id: String, // PK
    val anime_id: String?, // TODO(FK)
    val region_id: String?, // TODO(FK)
    val view_count: Int,
    val score: Double,
    val cost: Double,
    val revenue: Double
)
