package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //retorno
        //no que vai receber criase uma variavel com valor a ser retornado
        //exemplo: double resultado = calculadora.divideDoisNumeros(20, 2);
        double resultado = calculadora.divideDoisNumeros(20, 2);

        //aqui o resultado é o valor que foi retornado pelo metodo divideDoisNumeros
        //e que foi armazenado na variavel resultado
        //se o metodo nao tiver retorno, nao é possivel armazenar o valor retornado
        System.out.println(resultado);

    }
}
