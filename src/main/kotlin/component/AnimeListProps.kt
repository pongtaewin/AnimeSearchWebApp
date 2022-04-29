package component

import db.Anime
import react.Props

external interface AnimeListProps : Props {
    var animeList: List<Anime> // null-safe list
    var selectedAnime: Anime? // nullable data
    var onSelection: (Anime) -> Unit // null-safe no-return function
    // Unit is the default return value
    // instead of void keyword, Unit is a blank object type.
}