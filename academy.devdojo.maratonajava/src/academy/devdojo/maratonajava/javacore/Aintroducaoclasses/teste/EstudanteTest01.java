package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Estudante;

/**
 * Classe para testar a classe Pessoa.
 */
public class EstudanteTest01 {

    public static void main(String[] args) {

        //variavel de referencia tipo estudante que aponta para um objeto do tipo estudante
        //variavel de referencia é um espaço na memoria que aponta para um objeto
        //objeto é uma instancia de uma classe, ou seja, é um espaço na memoria
        //que possui os atributos e métodos da classe.

        //no caso de estudante o que for atribuido a estudante será new
        //Estudante estudante = new Estudante();
        //new Estudante() cria um novo objeto do tipo Estudante na memoria
        //e atribui a variavel estudante, que é uma referencia para o objeto Estud

        //atribui valores aos atributos do objeto estudante
        //os atributos sao os definidos na classe Estudante
        //por convenção, os atributos são declarados como private
        //mas os atributos sao Strinf, int e char, que são tipos primitivos
        //e podem ser acessados diretamente, pois são publicos
        Estudante estudante = new Estudante();
        estudante.nome = "Goku";
        estudante.idade = 30;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


    }
}
