package academy.devdojo.maratonajava.javacore.Aintroducaometodo.model;
/**
 *
 * metodos são ações que a classe pode realizar, ou seja, os comportamentos
 *
 * precisa de modificadores de acesso
 * segunda parte retorno do metodo
 *
 *
 * retorno != diferente de saida do metodo
 *ex metodo que recebe dois numeros e retorna a soma
 * * public int soma(int a, int b) {
 * *     return a + b;
 * * }
 * * o retorno é o valor que o metodo retorna, ou seja, o resultado da ação
 * * que ele realiza. No caso do exemplo, o retorno é a soma dos dois numeros
 * * recebidos como parametros.
 * * parametros são os valores que o metodo recebe para realizar a ação
 *
 *
 *
 * */

public class Calculadora {
    // nao retorna nada, ou seja, nao tem retorno mas tem saida
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10 - 5);
    }
}
