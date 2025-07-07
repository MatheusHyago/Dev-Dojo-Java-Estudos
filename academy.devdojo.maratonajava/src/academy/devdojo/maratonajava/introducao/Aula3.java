package academy.devdojo.maratonajava.introducao;

/**
 * Tipos primitivos e tamanho de memória:
 *
 * <pre>
 *  byte    = 1 byte  de memória
 *  short   = 2 bytes de memória
 *  int     = 4 bytes de memória
 *  long    = 8 bytes de memória
 *  float   = 4 bytes de memória
 *  double  = 8 bytes de memória
 *  boolean = 1 byte  de memória
 *  char    = 2 bytes de memória
 * </pre>
 *
 * Valores padrão:
 * <ul>
 *   <li>Numéricos: 0</li>
 *   <li>boolean: false</li>
 * </ul>
 */


public class Aula3 {
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

        System.out.println(falso);

        /**char traduz para tabela ascii*/
        System.out.println("char " + caracter);

    }






}


