package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Calculadora;

public class CalculadoraTest04 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //ex de quando se passa valor pra um metodo void o valor original nao é alterado
        //faz uma copia do valor e passa pro metodo nao altera referencia do obj em memoria

        //variavies tipo primitivo sempre enviam uma copia do valor

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumero(num1, num2);
        System.out.println(num1 + " " + num2);
        System.out.println("Depois de alterar os numeros");



    }
}
