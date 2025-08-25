package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.model;
/**
 * Modificador static
 *
 * pertence a classe e nao ao objeto
 * se alterar o valor do atributo em um objeto todos os outros objetos serao afetados
 * economiza memoria
 *
 * pode ser usado em atributos e metodos
 *
 * metodos estaticos so podem acessar atributos estaticos
 * metodos estaticos nao podem usar o this ou super
 *
 * atributos estaticos sao inicializados quando a classe é carregada
 * atributos de instancia sao inicializados quando o objeto é criado
 *
 * classes internas so podem ser static se forem internas a uma classe estatica
 *
 * faz o atributo pertencer a classe e nao ao objeto
 * e todos objetos compartilham mesmo valor
 *
 * quando utiliza static existe a possibilidade de ao existir o obj em memoria
 * ao se pode utilizar em static variaveis que nao sao static obj so é criado depois do static ser inicializado
 *
 * recomendado quando metodos nao acessam variaveis ou atributos da instancia
 *
 * ex: metodos de utilidade que fazem calculos matematicos
 *  ex: metodos de conversao
 *  ex: metodos de validacao
 *
 * */
public class Carro {

    private String nome;
    private double velocidadeMaxima;
   //inicaliza o valor direto no atributo
    //pode ser alterado em qualquer lugar

    //atributo estatico
    // pertence a classe
    // se alterar o valor do atributo em um objeto todos os outros objetos serao afetados

    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + this.velocidadeLimite);
    }

    //set atributo statico
    //nao recomendado começar com static por conveção
    public static void setVelocidadeLimite(double velocidadeLimite) {
        //precisa referenciar a variavel local da classe para diferenciar
        Carro.velocidadeLimite = velocidadeLimite;

//        this.velocidadeLimite = velocidadeLimite; //errado, nao pode usar this em metodo static
    }

    public static double getVelocidadeLimiteStatic() {
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

}
