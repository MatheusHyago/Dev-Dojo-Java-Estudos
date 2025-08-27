package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Seminiario;

public class SeminarioTest01 {

    public static void main(String[] args) {

        Local local = new Local("Bangu 2");
        Aluno aluno1 = new Aluno("Gojo", 2121);
        Aluno aluno2 = new Aluno("Akabane", 3232);
        Aluno aluno3 = new Aluno("Kakashi", 4545);
        Professor professor = new Professor("Asuma", "Ninjutsu");
        Aluno[] alunosSeminario = {aluno1, aluno2, aluno3};
        Seminiario seminiario = new Seminiario("Jutsus de Vento", alunosSeminario, local, professor);
        Seminiario [] seminarioDisponiveis = {seminiario};

        professor.setSeminiarios(seminarioDisponiveis);

        professor.imprime();
    }
}
