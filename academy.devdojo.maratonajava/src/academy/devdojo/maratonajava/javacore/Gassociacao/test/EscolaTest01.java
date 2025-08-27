package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor("Mahoraga", "Matemática");

        Professor [] professores = {professor};
        Escola escola = new Escola("Sombras", professores);

        escola.imprime();
    }
}
