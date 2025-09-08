package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.model.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.model.Cliente.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.model.TipoCliente;



public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("DevDojo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
            //ex objeto invalido

    //        Cliente cliente3 = new Cliente("Teste", "PESSOA_X");
    //        Cliente cliente4 = new Cliente("azodeoa", "PESSOA_FISIA");

        System.out.println(cliente1);
        System.out.println(cliente2);





    }

}
