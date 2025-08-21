package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        //parametro vira argumento quando passado ex int num1, int num2
        //argumento é o valor que é passado para o metodo quando ele é chamado
        //exemplo: calculadora.multiplicaDoisNumeros(10, 20);
        //aqui o 10 é o argumento que vai ser passado para o parametro num1
        //e o 20 é o argumento que vai ser passado para o parametro num2
        calculadora.multiplicaDoisNumeros(10, 20);
    }
}
