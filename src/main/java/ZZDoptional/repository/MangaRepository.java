package ZZDoptional.repository;

import ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author mariana
 * @Project: javacore
 */
public class MangaRepository {

    private static List<Manga> mangas = List.of(new Manga(1L, "Boku no hero", 300),
            new Manga(2L, "DragonBall Z", 1000),
            new Manga(3L, "Sekai hatsukoi", 30));

    public static Optional<Manga> findById(Long id) {
        return findBy(s -> s.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }


    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }

        }
        return Optional.ofNullable(found);
    }
}
