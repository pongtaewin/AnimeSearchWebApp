package db

import kotlinx.serialization.Serializable

@Serializable
data class StreamingPlatform(
    val platform_id: String, // PK
    val name: String // U
)
