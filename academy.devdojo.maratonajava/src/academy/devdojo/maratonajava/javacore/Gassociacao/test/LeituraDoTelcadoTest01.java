package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTelcadoTest01 {

    public static void main(String[] args) {
        //java utils + Arg system.in
        Scanner input = new Scanner(System.in);

        //define o que vai ser lido default é String
        //le apenas a primeira palavra se quiser ler a linha toda usa nextLine

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        System.out.println("Digite a sua altura: ");
        double altura = input.nextDouble();
        System.out.println("Nome: " + nome + " Idade: " + idade + " Altura: " + altura);

    }
}
