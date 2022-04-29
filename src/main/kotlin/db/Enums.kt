package db

import kotlinx.serialization.Serializable

class Enums {
    @Serializable
    enum class Type { TV, Movie }

    @Serializable
    enum class Rating { G, PG, PG13, R, NC17 }
}