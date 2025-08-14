package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.Exercicios.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.Exercicios.Exercicio1.Ex1Carro;

public class TesteCarro01 {

    public static void main(String[] args) {


        //Primeiro se inicializa por convenção cria o objeto variavel instancia apos isso
        //se define os atributos
        Ex1Carro carro = new Ex1Carro();
        Ex1Carro carro2 = new Ex1Carro();

        carro.modelo = "Gol";
        carro.fabricante = "Volkswagen";
        carro.ano = 2004;

        System.out.println(carro.modelo + " " + carro.fabricante + " " + carro.ano);
        System.out.println("---------------------");



        carro2.modelo = "Chevete";
        carro2.fabricante = "Chevrolet";
        carro2.ano = 1978;

        System.out.println(carro2.modelo + " " + carro2.fabricante + " " + carro2.ano);

    }
}
