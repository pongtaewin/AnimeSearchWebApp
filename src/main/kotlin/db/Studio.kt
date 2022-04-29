package db

import kotlinx.serialization.Serializable

@Serializable
data class Studio(
    val studio_id: String, // PK
    val name: String,
    val nationality: String
)
