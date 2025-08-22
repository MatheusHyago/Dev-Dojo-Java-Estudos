package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario.nome = "Goku";
        funcionario.idade = 50;
        funcionario.salario = new double [] {1450, 2500, 3000};

        funcionario02.nome = "Vegeta";
        funcionario02.idade = 48;
        funcionario02.salario = new double [] {3800, 2500, 3000};

        funcionario03.nome = "Gohan";
        funcionario03.idade = 30;
        funcionario03.salario = new double [] {5000, 7500, 7000};

        funcionario.imprimeDadosFuncionario();
        funcionario02.imprimeDadosFuncionario();
        funcionario03.imprimeDadosFuncionario();
    }
}
