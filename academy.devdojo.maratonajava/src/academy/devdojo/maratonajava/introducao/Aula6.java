package academy.devdojo.maratonajava.introducao;

// logicos sempre retorna boolean < > <= >= == !=
public class Aula6 {
    //+ -/*
    public static void main(String[] args) {

        //bolean ex variaveis utilizam is convencao

        boolean isDezMaiorQueTrinta = 10 > 30;
        boolean isDezMenorQueTrinta = 10 < 30;
        boolean isDezMenorIguala = 10 <= 30;
        boolean isDezMaiorIguala = 10 >= 30;
        boolean isDezMenorIgualaTrinta = 10 == 30;
        boolean isDezMenorDiferenteTrinta = 10 != 30;

        System.out.println(isDezMaiorQueTrinta);
        System.out.println(isDezMenorQueTrinta);
        System.out.println(isDezMenorIguala);
        System.out.println(isDezMaiorIguala);
        System.out.println(isDezMenorIgualaTrinta);
        System.out.println(isDezMenorDiferenteTrinta);

        // Operador AND && ou || or !
        int idade = 22;
        float sal = 3500F;

        boolean isDentroDaLeiMaiorqueTrinta=  idade >= 30 && sal >= 4612;
        boolean isDentroDaLeiMenorqueTrinta=  idade < 30 && sal >= 3381;

        System.out.println(isDentroDaLeiMaiorqueTrinta);
        System.out.println(isDentroDaLeiMenorqueTrinta);

        // Operador AND && ou || or !

        double valorEmContaC =   200;
        double valorEmContaP =   10000;

        float valorPlay = 5000F;
        boolean isPlayCincoCompravel =  valorEmContaC > valorPlay || valorEmContaP > valorPlay;

        System.out.println(isPlayCincoCompravel);

        // Operadores de atribuição
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;

        System.out.println(bonus);


        // modelo count
        int contador = 0;
        contador += 1; // adiciona 1
        contador ++; // executa variavel primeiro
        contador --;
        ++ contador; // executa operador primeiro
        --  contador;

        System.out.println(contador);



    }
}
