package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;
/**
 * Classes abstratas
 *
 * Uma classe abstrata é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar objetos dela.
 * Ela serve como um modelo para outras classes que irão herdar suas propriedades e métodos.
 *
 *
 * um exemplo  uma classe abstrata e um template para outras classes
 *
 * algo que nao faz sentido ser instanciado exemplo funcionario
 *   mas que tem atributos e comportamentos comuns a todas as classes que herdam dela
 *
 *   nao pode ser istanciada ex new Funcionario
 *
 *   Criado para ser superclasse
 *   nao pode ser final pois final impede que a classe seja herdada
 *
 *   Classe abstrata nao pode ser instanciada e metodo nao pode ter corpo
 *
 *   aqui podemos ter metodos concretos (nao abstratos) e metodos abstratos
 *
 *   porem nunca poderemos instanciar metodos abstratos em uma classe concreta
 * */

//vira um template para outras classes
public abstract class Funcionario extends Pessoa {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("imprimindo dados do funcionario");
    }
}
