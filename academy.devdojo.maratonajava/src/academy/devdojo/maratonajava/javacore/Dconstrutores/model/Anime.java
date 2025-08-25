package academy.devdojo.maratonajava.javacore.Dconstrutores.model;
/**

 * Construtores nao tem tipo de retorno = nao pode retornar
 * precisa de motivo para existir e o nome da classe
 *
 * construtor nao tem retorno se tiver vira metodo nao segue convenção
 * inicializador dos objetos
 *
 * força a seguir regras = padronização e passar parametros para criação do objeto
 * */
public class Anime {

    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    //Construtores dão origens a objetos
    //define o que nescessario para criar o objeto
    //executado antes de qualquer metodo presente na classe
    public Anime(String tipo, int episodios, String nome, String genero){

        //chama construtor sem parametros
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    //sobre carga de construtores
    //cria outro construtor com mesmo nome sem retorno cria sem, paramentros
    public Anime(){
        System.out.println("Dentro do construtor sem parametros");
    }

    public Anime(String tipo, int episodios, String nome, String genero, String estudio){
        //deve ser a primeira linha do construtor
        //chama o construtor com 4 parametros
        this(tipo, episodios, nome, genero);
        this.estudio = estudio;
    }



    public void imprime(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Estudio: " + this.estudio);
    }

    //setados para o final por motivo de importancia e hierarquia de atributos
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public  String getTipo() {
        return tipo;
    }
    public int getEpisodios() {
        return episodios;
    }
    public String getNome() {
        return nome;
    }

}
