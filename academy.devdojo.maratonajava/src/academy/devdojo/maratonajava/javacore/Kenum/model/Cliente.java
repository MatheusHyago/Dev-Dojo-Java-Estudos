package academy.devdojo.maratonajava.javacore.Kenum.model;

/**
 * Enum - enumeração
 * */
public class Cliente {

    private String nome;
    private String tipo;
    private TipoCliente tipoCliente;

    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";


    public Cliente(String nome, String tipoCliente) {
        //tratando exeção
        //comparacao string equals case sensitive (considera maiusculo e minusculo)
        if(!tipoCliente.equals(PESSOA_FISICA) && !tipoCliente.equals(PESSOA_JURIDICA)){
            return;
        }
        this.nome = nome;
        this.tipo = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCliente() {
        return tipo;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipo = tipoCliente;
    }
}
