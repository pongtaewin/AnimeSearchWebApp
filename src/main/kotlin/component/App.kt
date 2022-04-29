package component

import db.Anime
import db.Enums
import react.FC
import react.Props
import react.dom.html.ReactHTML.h3
import react.useState

val App = FC<Props>{
    // similiar useState keyword defined in React
    // is a kotlin delegated property
    var selection: Anime? by useState(null)
    h3{
        +"Trending Anime"
    }
    AnimeList{
        animeList = trendingAnime
        selectedAnime = selection
        onSelection = { anime ->
            selection = anime
        }
    }
    h3{
        +"Random Anime"
    }
    AnimeList{
        animeList = randomAnime
        selectedAnime = selection
        onSelection = { anime ->
            selection = anime
        }
    }
}
val trendingAnime = listOf(
    Anime(
        "1", "To LOVE-Ru", Enums.Type.TV, "Comedy, Romance, Sci-Fi, Ecchi",
        null, 26, "", Enums.Rating.R
    ),
    Anime(
        "2", "Motto To LOVE-Ru", Enums.Type.TV, "Comedy, Sci-Fi, Ecchi",
        null, 12, "", Enums.Rating.PG13
    ),
    Anime(
        "3", "To LOVE-Ru Darkness", Enums.Type.TV, "Comedy, Romance, Sci-Fi, Ecchi",
        null, 12, "", Enums.Rating.PG13
    )
)

val randomAnime = listOf(
    Anime("7","Yuru Camp", Enums.Type.TV,"Comedy, Slice of Life",
        null,12,null, Enums.Rating.PG13),
    Anime("99","Laid-Back Camp", Enums.Type.TV,"Comedy, Slice of Life",
        null,12,null, Enums.Rating.PG13)
)