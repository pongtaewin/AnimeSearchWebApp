package db

import kotlinx.serialization.Serializable

@Serializable
data class DistributionContract(
    val license_id:String, // PK
    val platform_id:String? = null, // TODO(FK)
    val anime_id:String? = null, // TODO(FK)
    val region_id:String? = null, // TODO(FK)
)
