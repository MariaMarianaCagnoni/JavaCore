package ZZDoptional.test;

import ZZDoptional.domain.Manga;
import ZZDoptional.repository.MangaRepository;

import java.util.Optional;

/**
 * @author mariana
 * @Project: javacore
 */
public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);
        //retorna empty se não encontrar

        Manga mangaByid = MangaRepository.findById(3L).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaByid);

        Manga manga = MangaRepository.findByTitle("Drifeters").orElse(new Manga(5L, "Drifeters", 3000));
        System.out.println(manga);

        Manga newManga = MangaRepository.findByTitle("Drifeters").orElseGet(() -> new Manga(5L, "Drifeters", 3000));
        System.out.println(manga); //mesma coisa que o de cima,porem passando uma lambda

        System.out.println(newManga);


    }
}
