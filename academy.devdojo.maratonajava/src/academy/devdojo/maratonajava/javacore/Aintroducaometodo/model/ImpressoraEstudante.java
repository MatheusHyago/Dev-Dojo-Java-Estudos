package academy.devdojo.maratonajava.javacore.Aintroducaometodo.model;
/**
 * Coesão:
 * * É o grau de responsabilidade que uma classe tem em relação a si mesma.
 *
 *
 *
 *
 * */
public class ImpressoraEstudante {

    public void imprime(Estudante estudante) {

        //faz referencia ao objeto estudante01 que foi passado como argumento
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        System.out.println("-------------------");

    }


}
