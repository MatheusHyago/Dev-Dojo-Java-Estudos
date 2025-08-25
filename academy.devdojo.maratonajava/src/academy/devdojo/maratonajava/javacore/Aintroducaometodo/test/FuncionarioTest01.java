package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario.setNome("Goku");
        funcionario.setIdade(50);
        funcionario.setSalario(new double [] {1450, 2500, 3000});

        funcionario02.setNome("Vegeta");
        funcionario02.setIdade(48);
        funcionario02.setSalario(new double [] {3800, 2500, 3000});

        funcionario03.setNome("Gohan");
        funcionario03.setIdade(30);
        funcionario03.setSalario(new double [] {5000, 7500, 7000});

        funcionario.imprimeDadosFuncionario();
        funcionario02.imprimeDadosFuncionario();
        funcionario03.imprimeDadosFuncionario();
    }
}
