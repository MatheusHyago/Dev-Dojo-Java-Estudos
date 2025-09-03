package academy.devdojo.maratonajava.javacore.Kenum.model;
/**
 *
 * Classe enum - enumeração
 * Funciona de forma semelhante a uma classe
 * Pode ter atributos, construtores e métodos
 *
 * todos atributos são constantes
 * */
public enum TipoCliente {

    PESSOA_FISICA("PESSOA_FISICA"),
    PESSOA_JURIDICA("PESSOA_JURIDICA"); //separar por virgula e finalizar com ponto e virgula

    private String tipo;

    //construtor
    TipoCliente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
