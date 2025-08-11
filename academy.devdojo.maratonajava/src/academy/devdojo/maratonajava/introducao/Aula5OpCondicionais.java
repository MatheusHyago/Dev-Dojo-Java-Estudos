package academy.devdojo.maratonajava.introducao;

    // logicos sempre retorna boolean < > <= >= == !=
public class Aula5OpCondicionais {
    //+ -/*
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 123;

        int result = n1 + n2;

        System.out.println(result);

       // % operador resto divisao

        int resto = 20 % 2;


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
    }
}
