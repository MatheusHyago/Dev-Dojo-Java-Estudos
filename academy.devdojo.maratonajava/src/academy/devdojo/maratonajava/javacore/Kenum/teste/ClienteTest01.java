package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.model.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.model.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.model.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("DevDojo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("PESSOA_FISICA2");

            //ex objeto invalido

    //        Cliente cliente3 = new Cliente("Teste", "PESSOA_X");
    //        Cliente cliente4 = new Cliente("azodeoa", "PESSOA_FISIA");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("------------------");
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));


        //ex valueOf - converte string para enum
        // nao retorna no tipo baseado no nome
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        System.out.println(tipoCliente2);






    }

}
