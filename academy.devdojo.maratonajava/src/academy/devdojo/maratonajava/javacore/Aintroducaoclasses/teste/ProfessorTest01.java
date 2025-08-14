package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 500;
        professor.sexo = 'M';

        System.out.println(professor.nome + " "  + professor.idade + " " + professor.sexo);

    }
}
