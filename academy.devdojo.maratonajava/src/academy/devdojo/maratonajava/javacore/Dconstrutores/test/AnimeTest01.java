package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.model.Anime;

/**
 *
 *
 *
 *
 *
 * */
public class AnimeTest01 {

    public static void main(String[] args) {

        //representa o construtor  da classe Anime
        //so vai criar o objeto se passar o parametro nome definido no construtor
        Anime anime = new Anime("TV", 37, "Death Note", "Terror");
        Anime anime2 = new Anime();
        anime.imprime();
        System.out.println("-------------------");
        anime2.imprime();
    }
}
