package db

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Anime(
    @SerialName("anime_id") val id: String, // PK TODO(Confirm Data)
    val title: String,
    val type: Enums.Type,
    val genre: String,
    val studio_id: String? = null, // TODO(FK)
    val episode: Int,
    val description: String? = null,
    val rating: Enums.Rating
)

