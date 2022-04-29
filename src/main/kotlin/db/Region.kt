package db

import kotlinx.serialization.Serializable

@Serializable
data class Region(
    val region_id:String, // PK
    val region_name:String
)
