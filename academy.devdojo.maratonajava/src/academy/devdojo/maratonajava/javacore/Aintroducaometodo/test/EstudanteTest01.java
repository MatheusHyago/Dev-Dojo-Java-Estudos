package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Estudante;
import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.ImpressoraEstudante;

public class EstudanteTest01 {


    public static void main(String[] args) {

        //cada um  faz ref a um objeto diferente na memoria
        //ou seja, cada um tem seu proprio espaço na memoria


        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante  impressora = new ImpressoraEstudante();

        //1 obj
        estudante01.nome = "kokushibo";
        estudante01.idade = 1000;
        estudante01.sexo = 'M';

        //2 obj
        estudante02.nome = "Tanjiro";
        estudante02.idade = 16;
        estudante02.sexo = 'M';


        // quando feito desta forma o metodo imprime recebe uma copia do valor
        //e nao altera o objeto original na memoria

        //obj vem na chamada do metodo como argumento
        //assim faz copia da referencia do objeto estudante01


        //variaveis fazem referencia a um objeto na memoria
        //e quando o metodo imprime recebe o objeto estudante01, ele recebe uma copia da referencia
        //ou seja, o metodo imprime recebe uma copia do objeto estudante01
        //e nao altera o objeto original na memoria

        //nao tem limite de variveis fazem referencia ao mesmo objeto na memoria
        System.out.println("copias");
        impressora.imprime(estudante01);
        System.out.println("copias");
        impressora.imprime(estudante02);


        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);

        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);

    }
}
