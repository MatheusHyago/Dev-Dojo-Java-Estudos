package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.model;


/**
 *Blocos de inicialização
 *
 * declarado o começo antes dos contrutores e depois dos atributos
 *
 *
 *
 *
 * */
public class Anime {
    private String nome;
    private int [] episodios;
    //bloco de inicialização
    //executado antes e sempre que o objeto for criado
    //executado antes do construtor
    //diferente do construtor que so é executado quando o objeto é criado
    //pode ter varios blocos de inicialização
    //utilizado para inicializar atributos
    //quando ahá codigo ex do episodios que se repete em todos os construtores
    //jogo para o bloco de inicialização e assim reaproveito o codigo

    //ex bloco nao estatico = bloco de instancia executado toda vez que cria obj
    {

        //1 alocado espaço em memoria para o obj
        //seguindo cada atributo de classe e criado e inicializado com valores default ou o que for passado
        //por ultimo bloco e executado e em seguida o construtor
        System.out.println("Bloco de inicialização 1");
        //sempre que criar um objeto de anime
        //o array de episodios sera criado com 100 posicoes
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }



    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        //inicializa o array com 100 posicoes diretamente no construtor

        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
