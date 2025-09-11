package academy.devdojo.maratonajava.javacore.Kenum.model;
/**
 *
 * Classe enum - enumeração
 * Funciona de forma semelhante a uma classe
 * Pode ter atributos, construtores e métodos
 *
 * todos atributos são constantes
 *
 * criando enum chama construtor privado
 * */
public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Fisica"), //separar por virgula
    PESSOA_JURIDICA(2, "Pessoa Juridica"); //separar por virgula e finalizar com ponto e virgula

    //valor ou varivavel nao pode vir antes das enumerações sempre depois
        public final int VALOR;
        private String nomeRelatorio;

    TipoCliente(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }

    //valueOf manual
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        //percorre o metodo retornando um array de todas as enumerações
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    //apenas get sem set
    //pois nao pode ser alterado
    public int getValor() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
