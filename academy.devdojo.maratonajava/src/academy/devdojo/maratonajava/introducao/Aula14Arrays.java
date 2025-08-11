package academy.devdojo.maratonajava.introducao;

/**
 *
 * para valores em arrays segue valores de tipos primitivos
 *
 * byte, short, int, long, float, double = 0
 *
 * char = '\u0000' (caractere nulo)
 *
 * boolean = false
 *
 * string = null
 *
 * new so pode utilizar direto com arrays
 *
 * */


public class Aula14Arrays {

    public static void main(String[] args) {

        int[] idades = new int[3];
        idades[0] = (int)10F; // ex de casting convertendo float para int
        idades[1] = 20;
        idades[2] = 30;

        System.out.println(idades[2]);



    }
}
