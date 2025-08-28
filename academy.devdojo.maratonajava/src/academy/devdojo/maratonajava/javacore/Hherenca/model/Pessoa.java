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
 *
 * Não existe herança múltipla em java, ou seja, uma classe não pode herdar de mais de uma classe.
 * */

public class Pessoa {
    //da acesso direto a variavel e subclasses independente do pacote
    //todas do pacote teram acesso como se fosse public
    protected String nome;
    protected String cpf;
    protected Endereco endereco;



    //Construtores
    //Em herança todos os construtores das subclasses devem chamar um construtor da superclasse pois se baseiam nele
    //se a superclasse não tiver um construtor padrão (sem argumentos) a subclasse deve chamar um construtor específico da superclasse

    public Pessoa(String nome){
        this.nome = nome;
    }
    //Construtor sobrecarregado

    public Pessoa(String nome, String cpf){
        //primeira linha valida do construtor deve ser a chamada de outro construto
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + ", " + this.endereco.getCep());
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
