package db

import kotlinx.serialization.Serializable

@Serializable
data class Publisher(
    val publisher_id: String, // PK
    val name: String,
    val nationality: String
)
