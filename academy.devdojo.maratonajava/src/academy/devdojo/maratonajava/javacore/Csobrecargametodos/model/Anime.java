package academy.devdojo.maratonajava.javacore.Csobrecargametodos.model;
/**
 *
 *Sobrecarga de metodos
 *
 *Possui metodo com mesmo nome porem o tipo ou quantidade de parametros são diferentes
 *não pode existir ambiguidade em sobrecarga de metosdos para não haver conflito de qual metodo chamar
 *
 *
 * Construtores nao tem tipo de retorno = nao pode retornar
 * precisa de motivo para existir e o nome da classe
 * */
public class Anime {

    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    //sobrecarga de metodos
    //mesmo nome, porem com parametros diferentes
    //diferencas podem ser na quantidade de parametros ou no tipo de parametro

    //dentro do objeto reconhece tudo instanciado localmente

    //guarda em memoria o que for passado
    public void init(String tipo, int episodios, String nome){
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
    }

    //nao precisa ser init2 porque por padrao possuem nome e atributos iguais
    //sobrecarga apenas nome quantidade ou tipo de parametros
    public void init(String tipo, int episodios, String nome, String genero){

        //se declara desta forma o metodo init é chamado para inicializar os 3 atributos do anterior
        this.init(tipo, episodios, nome);
        this.genero = genero;
    }
    public void imprime(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
    }


    //Construtores dão origens a objetos
    //se nao definir o java faz isso no meio da compilacao
    public Anime(){

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
