package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.model.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Lucas", "PESSOA_FISICA");
        Cliente cliente2 = new Cliente("DevDojo", "PESSOA_JURIDICA");
        //ex objeto invalido
        Cliente cliente3 = new Cliente("Teste", "PESSOA_X");
        Cliente cliente4 = new Cliente("azodeoa", "PESSOA_FISIA");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);



    }

}
