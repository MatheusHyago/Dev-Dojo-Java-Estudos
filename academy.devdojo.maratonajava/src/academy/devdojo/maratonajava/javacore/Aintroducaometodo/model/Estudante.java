package academy.devdojo.maratonajava.javacore.Aintroducaometodo.model;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    //passando o metodo para imprimir os dados do estudante

    /**
     * Imprime os dados do estudante no console.
     * Utiliza 'this' para acessar os atributos do objeto atual.
     */

    // this referencia o objeto atual instanciado dentro da classe para acessar as vairaveis /
    // atributos locais da classe
    public void imprime() {
        System.out.println("------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}
