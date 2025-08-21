package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Calculadora;
/**
 * Diferença entre atributos e métodos:
 *  Atributos são as características de uma classe, ou seja, os estados que ela
 *  possui. São representados por variáveis dentro da classe.
 *  Métodos são as ações que a classe pode realizar, ou seja, os comportamentos
 *  que ela possui. São representados por funções dentro da classe.
 *
 * */
public class CalculadoraTest01 {


    //metodos são ações que a classe pode realizar, ou seja, os comportamentos
     //retorno != diferente de saida do metodo
    //ex metodo que recebe dois numeros e retorna a soma

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        System.out.println("-----------------");
        //tem saida mas nao tem retorno pra quem chama no caso calculadora01
        calculadora.subtraiDoisNumeros();
    }
}
