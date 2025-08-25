package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("jujutsu kaisen");

        System.out.println("Nome do anime: " + anime.getNome());
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");

        }

    }
}
