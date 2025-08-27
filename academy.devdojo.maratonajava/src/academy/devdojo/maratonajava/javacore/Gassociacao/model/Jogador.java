package academy.devdojo.maratonajava.javacore.Gassociacao.model;


/**
 * associacao cria mais de uma referencia a variavel instaciada
 *
 * associacao relaciona uma classe com outra
 * unidirecional = relacionamento de dois objetos um pra um jogador tem um time
 * bidirecional = relacionamento de dois objetos um para muitos jogador tem varios times
 *
 */
public class Jogador {

    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {

        System.out.println("Nome: " + this.nome);

        if(time != null) {
            System.out.println("Time: " + getTime().getNome());
        } else {
            System.out.println("O jogador não tem time");
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
