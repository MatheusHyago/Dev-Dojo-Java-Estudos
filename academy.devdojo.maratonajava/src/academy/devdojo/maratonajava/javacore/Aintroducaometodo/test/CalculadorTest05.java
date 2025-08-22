package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Calculadora;

public class CalculadorTest05 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int [] numeros = {1, 2, 3, 4, 5};
        //aqui o metodo recebe um array de numeros
        //vantagem podese passar a lista de numeros sem precisar criar variaveis
        //os 3 pontos nao podem vir depois de outro parametro
        calculadora.somavarArgs( 1, 2, 3, 4, 5,6, 7);


     }

}
