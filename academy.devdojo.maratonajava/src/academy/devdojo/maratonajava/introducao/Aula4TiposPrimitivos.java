package academy.devdojo.maratonajava.introducao;

/**
 * Tipos primitivos e tamanho de memória:
 *
 * <pre>
 *  STRING NÃO É TIPO PRIMITIVO É TIPO DE REFERENCIA
 *
 *
 *  String = classe
 *  dif entre char e string são as aspas " "
 *
 * </pre>
 *
 *
 */


public class Aula4TiposPrimitivos {
    public static void main(String[] args) {


            int idade = 10;
            long numeroGrande = 100000;
            double salarioDouble = 2500;
            float salarioFloat =3000;
            byte idadeByte = 80;
            short idadeShort = 12;
            boolean falso = false;
            /**modelo unicode*/
            char caracter = '\u0041';

            String nome = "Grande texto";

        System.out.println("meu nome é " + nome + "/" + idade);
    }
}
