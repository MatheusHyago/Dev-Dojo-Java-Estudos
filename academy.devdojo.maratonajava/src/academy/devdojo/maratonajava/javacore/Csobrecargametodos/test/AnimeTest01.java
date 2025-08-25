package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.model.Anime;

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
        Anime anime = new Anime();

        //passa os valores para o init armazenar em memoria
        anime.init("TV", 64, "Naruto");
        //sobrecarga de metodo sobrescreve o valor acima em memoria
        anime.init("TV", 64, "Naruto", "Acao");
        anime.imprime();
    }
}
