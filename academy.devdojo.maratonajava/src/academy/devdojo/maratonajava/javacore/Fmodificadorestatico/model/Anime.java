package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.model;


/**
 *Blocos de inicialização
 *
 * declarado o começo antes dos contrutores e depois dos atributos
 *
 * quando a mais de um static de inicialização executa na ordem que foi declarado
 *
 *blocos de instancia são executados após os blocos static e antes do construtor
 * */
public class Anime {
    private String nome;
    private static int [] episodios;
    //bloco de inicialização é executado quando a jvm carrega a classe
    ;;
    //declara static antes do bloco de inicialização para executar apenas uma vez quando a classe for carregada pela jvm
     static    {
        System.out.println("Bloco de inicialização 1");

        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static   {
        System.out.println("Bloco de inicialização 2");
    }
    static   {
        System.out.println("Bloco de inicialização 3");
    }
    //bloco nao estatico
    {
        System.out.println("Bloco de inicialização de instancia" );
    }



    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        //inicializa o array com 100 posicoes diretamente no construtor

        for (int episodio : Anime.episodios) {
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
