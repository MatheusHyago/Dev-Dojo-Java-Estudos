package academy.devdojo.maratonajava.Isobrescrita.model;


/**
 * ToString = representação de um objeto em forma de String
 *
 * Sempre que tentar imprimir um objeto ele vai chamar o metodo toString
 * que está na classe object
 *
 * Sobrescrita do metodo toString
 *
 * Sempre que criar uma classe nova, crie o metodo toString
 *
 *
 * Regras da sobrescrita
 *
 * Nome exatamente igual ao da superclasse
 * Quantidade de parametros igual ao da superclasse
 * Tipo de covariance (retorno) igual ou subtipos do retorno da superclasse
 * Mesmo nível de visibilidade ou mais visível que o da superclasse
 * Modificadores de acesso - não pode diminuir a visibilidade do metodo da superclasse
 * */
public class Anime extends Object {

    private String nome;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
