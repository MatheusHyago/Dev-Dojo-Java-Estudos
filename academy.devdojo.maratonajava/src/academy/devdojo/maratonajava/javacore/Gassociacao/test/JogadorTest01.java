package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {
        // cria 3 objetos do tipo jogador
        // cada objeto representa um jogador diferente
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Zidane");

        // cria array de jogadores 3 posições faz referência aos objetos criados 3 diferentes
        //associacao cria mais de uma referencia a variavel instaciada
        Jogador [] jogadores = new Jogador [] {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
