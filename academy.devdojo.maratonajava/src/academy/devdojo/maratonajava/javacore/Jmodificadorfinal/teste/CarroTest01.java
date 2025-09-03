package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;


import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        //variavel do tipo referece nao altera referença para o objeto mas e possivel alterar o valor do objeto


        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Gustavo");

        System.out.println(carro.COMPRADOR);
        System.out.println(Carro.VELOCIDADE_LIMITE);


    }
}
