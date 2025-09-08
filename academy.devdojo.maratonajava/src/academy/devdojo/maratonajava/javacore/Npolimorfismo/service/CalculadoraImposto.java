package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Tomate;

public class CalculadoraImposto {

    public static void CalculadoraImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Nome: " + computador.getNome());
        System.out.println("Preço: " + computador.getPreco());
        System.out.println("Imposto a ser pago: " + computador.calcularImposto());
        System.out.println("------------------------------");
    }
    public static void CalculadoraImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Nome: " + tomate.getNome());
        System.out.println("Preço: " + tomate.getPreco());
        System.out.println("Imposto a ser pago: " + tomate.calcularImposto());
        System.out.println("------------------------------");
    }

}
