package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    //Dado os valores de 1 a 7 imprima se e dia util ou final de semana considerando 1 como domingo
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        byte dia = scanner.nextByte();
        switch (dia) {
            case 1:
                System.out.println("Domingo - Final de Semana");
                break;
            case 2:
                System.out.println("Segunda - Dia Util");
                break;
            case 3:
                System.out.println("Terça - Dia Util");
                break;
            case 4:
                System.out.println("Quarta - Dia Util");
                break;
            case 5:
                System.out.println("Quinta - Dia Util");
                break;
            case 6:
                System.out.println("Sexta - Dia Util");
                break;
            case 7:
                System.out.println("Sabado - Final de Semana");
                break;
            default:
                System.out.println("Insira um valor de 1 a 7 para imprir caso dia util valores que ultapassem seao invalidos");
                break;
        }
        scanner.close();
    }
}
