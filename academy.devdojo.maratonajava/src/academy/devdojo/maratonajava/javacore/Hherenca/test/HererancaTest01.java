package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.model.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.model.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.model.Pessoa;

public class HererancaTest01 {

    public static void main(String[] args) {
        //classe com menos relacionamento
        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos 2");
        endereco.setCep("00000-000");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mahoraga");
        pessoa.setCpf("123.222.312-00");
        pessoa.setEndereco(endereco);

        //herda todos os atributos e metodos da classe pessoa
        //e traz os atributos e metodos dela no caso salario
        //herança acopla fortemente as classes
        //estende e mantem o relacionamento das classes
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sukuna");
        funcionario.setCpf("321.222.312-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);


        pessoa.imprime();
        System.out.println("-------------------");
        funcionario.imprime();

      }
}
