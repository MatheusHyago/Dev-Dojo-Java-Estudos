package academy.devdojo.maratonajava.javacore.Kenum.model;

/**
 * Enum - enumeração
 *
 *tratando exeção
 *comparacao string equals case sensitive (considera maiusculo e minusculo)
 * */
public class Cliente {


    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoCliente=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
