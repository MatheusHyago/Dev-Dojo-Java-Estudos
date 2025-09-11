package academy.devdojo.maratonajava.javacore.Npolimorfismo.Teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Dell", 3000);
        Tomate tomate = new Tomate("Tomate", 10);

        CalculadoraImposto.CalculadoraImpostoComputador(computador);
        System.out.println("-------------------");
        CalculadoraImposto.CalculadoraImpostoTomate(tomate);

    }
}
