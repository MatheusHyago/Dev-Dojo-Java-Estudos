package academy.devdojo.maratonajava.javacore.Hherenca.model;
/**
 *
 * Herança - superclasse, subclasse, extends
 *
 * Herança é o mecanismo que permite que uma classe adquira os atributos e métodos de outra classe.
 * Semelhante ao acoplamento, a herança promove a reutilização de código e estabelece uma relação "é um" entre classes.
 * Exemplo: Uma classe "Cachorro" pode herdar de uma classe "Animal", pois um cachorro é um animal.
 *
 * crtl b direto pra classee
 *
 * herança acopla fortemente as classes estende e mantem o relacionamento das classes
 * qualquer alteração na superclasse afeta a subclasse
 *
 * superclasse - classe mãe, pai ou base = Pessoa
 * subclasse - classe filha ou derivada = Funcionario, Cliente
 *
 * herença é um - acoplamento forte
 * associação é tem um - acoplamento fraco
 *
 * */

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;



    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
