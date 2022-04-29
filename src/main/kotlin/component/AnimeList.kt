package component

import react.FC
import react.dom.html.ReactHTML.b
import react.dom.html.ReactHTML.p
import react.key

val AnimeList = FC<AnimeListProps> { props ->
    for (anime in props.animeList) {
        p {
            key = anime.id
            onClick = { props.onSelection(anime) }
            p {
                b {
                    if (anime == props.selectedAnime) +"▶ "
                    +anime.title
                }
            }
            p {
                +"${anime.type} / ${anime.episode} ep. / ${anime.genre}"
            }
        }
    }
}