package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model;

/**
 * Classes são uma estrutura um template que contem atributos e métodos.
 * Classes de dominio nao tem o metodo main
 *
 * Classe um template que da origem a objetos.
 * Possui comportamentos (métodos) e estados (atributos).
 *
 * main entrada para executar as classes
 *
 *
 * Model é classe de dominio representa um objeto do mundo real.
 * Exemplo: Pessoa, Carro, Produto, Cliente, etc.
 * Model é uma classe que representa um objeto do mundo real, com atributos e métodos
 * e que e exportado para o banco de dados.
 * */
public class Estudante {
    //modificadores de acesso
    //public, private, protected, default (nenhum modificador)
    //public: acessível de qualquer lugar
    //private: acessível apenas dentro da própria classe
    //protected: acessível dentro da própria classe e subclasses
    //default: acessível apenas dentro do mesmo pacote
    //Atributos são as características de uma classe, ou seja, os estados que ela
    //possui. São representados por variáveis dentro da classe.
    //Métodos são as ações que a classe pode realizar, ou seja, os comportamentos
    //que ela possui. São representados por funções dentro da classe.
    //Atributos são as características de uma classe, ou seja, os estados que ela

    //por convenção, os atributos são declarados como private
    //para garantir o encapsulamento, e os métodos são públicos para permitir o acesso
    //aos atributos de forma controlada.
    // e por convenção são declarados com a primeira letra minúscula
    //e os métodos com a primeira letra maiúscula.

    //Não se dá valor diretamete aqui, pois os metodos que metodos que vao utilizar manipular
    //vao receber um valor default nao e boa pratica
    public String nome;
    public int idade;
    public char sexo;





}
