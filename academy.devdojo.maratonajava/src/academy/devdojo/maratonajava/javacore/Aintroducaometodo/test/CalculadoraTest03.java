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

        System.out.println("-----------------");

        //nao se coloca metodo com retorno dentro de outro metodo
        //pois o metodo com retorno deve ser chamado e o valor retornado deve ser armazenado
        //apenas deve se chamar o metodo + o parametro e definir os valores pois a execução por se tratar de ser void
        //sera feito lá
        calculadora.imprimeDivisao(87, 0);

    }
}
