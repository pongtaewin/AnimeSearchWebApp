package db

import kotlinx.serialization.Serializable

@Serializable
data class LicensingContract(
    val license_id:String,
    val publisher_id:String? = null, // TODO(Link to Publisher)
    val anime_id: String? = null, // TODO(Link to Anime)
    val region_id:String? = null, // TODO(Link to Region)
    val upfront_fee:Double,
    val start_time:DateTime,
    val end_time:DateTime,
    val detail:String? = null
)
