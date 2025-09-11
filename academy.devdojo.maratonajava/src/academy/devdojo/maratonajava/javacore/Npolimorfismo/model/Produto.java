package academy.devdojo.maratonajava.javacore.Npolimorfismo.model;

/**
 *  Introdução ao Polimorfismo
 *  Polimorfismo é um dos pilares da programação orientada a objetos (POO) que permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum.
 *  O termo "polimorfismo" vem do grego e significa "muitas formas". Em Java, o polimorfismo é alcançado principalmente através de herança e interfaces.
 *
 * */
public abstract class Produto implements Taxavel {

    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
