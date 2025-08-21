package academy.devdojo.maratonajava.javacore.Aintroducaometodo.model;
/**
 *
 * metodos são ações que a classe pode realizar, ou seja, os comportamentos
 *
 * precisa de modificadores de acesso
 * segunda parte retorno do metodo
 *
 *  metodo tipo void não retorna nada, ou seja, não tem retorno
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
 *parametros são variaveis locais presentes no metodo
 * */

public class Calculadora {
    // nao retorna nada, ou seja, nao tem retorno mas tem saida
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    //variavel + identificador = parametro
    //boas praticas funções ou metodos com mais de 3 argumentos devem ser evitdos deve ser dividido em metodo menor
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    //metodo com retorno
    // o retorno é o valor que o metodo retorna, ou seja, o resultado da ação]
    // retorno de um metodo se da a inicialização da variavel junto ao atributo
    //no que vai receber criase uma variavel com valor a ser retornado
    public double divideDoisNumeros(double num1, double num2) {
        //indica que quem chamar esse metodo vai ter retorno valor 0

        if (num2 == 0) {
            //return funciona como um break, ou seja, ele para a execução do metodo
            return 0; //retorna 0 se o segundo numero for zero

        } else {
            return num1 / num2;
        }
    }

    //return para void
    //nao retorna valor
    // break de void

    //return;
    public void imprimeDivisao(double num1, double num2) {
        //indica que quem chamar esse metodo vai ter retorno valor 0

        if (num2 == 0) {
            System.out.println("Não é possível dividir por zero.");
            return; //retorna 0 se o segundo numero for zero
        }
        System.out.println(num1/ num2);
    }

    //quando e passado envia uma copia do valor do argumento

    //variavies tipo primitivo sempre enviam uma copia do valor
    //exemplo int, double, float, char, boolean
    //variaveis do tipo referencia enviam o endereco de memoria do objeto
    //exemplo String, Arrays, Objetos
    //nesse caso o metodo pode alterar o objeto original

    //variaveis ti´po primitivo nunca alteram o valor original
    //pois enviam uma copia do valor
    public void alteraDoisNumero(int numero1, int numero2) {

        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);

    }
}
