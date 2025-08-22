package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {

        Pessoa pessoa = pessoa = new Pessoa();

        pessoa.setNome ("Goku");
        pessoa.setIdade(0);

        pessoa.imprimeDadosPessoa();

        System.out.println("------------------------------");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());



     }
}
