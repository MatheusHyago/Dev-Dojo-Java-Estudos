package academy.devdojo.maratonajava.javacore.Gassociacao.model;


/**
 * associacao cria mais de uma referencia a variavel instaciada
 *
 * associacao relaciona uma classe com outra // relacionamento de dois objetos um pra um
 */
public class Jogador {

    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }


    public void imprime() {
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
