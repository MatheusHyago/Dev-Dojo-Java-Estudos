package academy.devdojo.maratonajava.introducao;

/**
 *  Exemplo ternario Java
 * */
public class Aula8 {
    public static void main(String[] args) {

        // Patrocinar if salario caro

        double salario = 6000;
        String mensagemDoar = "General Mahoraga";
        String naoDoar = "Subuxa";
        // condicao ? verdadeiro : falso
        String result = salario > 5000 ? "General Mahoraga" : "Subuxa";

        System.out.println(result);

        //ex dentro do println
        System.out.println(salario < 5000 ? mensagemDoar: naoDoar);



        //ex boolean
        boolean possoDoar = salario > 5000;
        System.out.println(possoDoar);
    }





    }
