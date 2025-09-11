package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.model.Funcionario;

import java.util.*;
import java.util.function.Predicate;

public class TestLAmbda {
    public static void main(String[] args) {
        // Criando lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario f1 = new Funcionario("Ana");
        f1.setSalario(2500);

        Funcionario f2 = new Funcionario("Bruno");
        f2.setSalario(4000);

        Funcionario f3 = new Funcionario("Carla");
        f3.setSalario(1500);

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        // 🔹 1. Usando lambda para filtrar (Predicate)
        Predicate<Funcionario> salarioMaiorQue2000 = f -> f.getSalario() > 2000;

        System.out.println("Funcionários com salário > 2000:");
        funcionarios.stream()
                .filter(salarioMaiorQue2000)
                .forEach(f -> System.out.println(f.getNome() + " - " + f.getSalario()));

        // 🔹 2. Usando lambda direto na ordenação
        funcionarios.sort((a, b) -> Double.compare(a.getSalario(), b.getSalario()));

        System.out.println("\nFuncionários ordenados por salário:");
        funcionarios.forEach(f -> System.out.println(f.getNome() + " - " + f.getSalario()));
    }
}
