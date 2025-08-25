package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.model.Carro;

public class CarroTest01 {
    //nao se cria ou referencia objeto em metodo static
    //ante de do main pois ainda nao foi criado o objeto
    //metodo statico publico que recebe um array de String como parametro / argumento
    public static void main(String[] args) {


        Carro carro1 = new Carro("Bmw", 280);
        Carro carro2 = new Carro("Mercedes", 300);
        Carro carro3 = new Carro("Audi", 290);

        //alterando o valor do atributo estatico
        //quando delcara static ele passa a pertencer a classe
        //alterar o valor em um objeto altera para todos

//       carro1.setVelocidadeLimite(180);

        //Alterando valor direto na classe estatica
        //afeta todos objetos em instancia daquela classe
        Carro.setVelocidadeLimite(180);









        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
