package academy.devdojo.maratonajava.introducao;

/**
 * <pre>
 *     While, do While, For
 *
 *     Obrigatorio Count
 * </pre>
 *
 * */

public class Aula12While {

    public static void main(String[] args) {


        // obrigatorio ser boolean ex count < 1
        // ctrl + f2 stopa
        int count = 0;

        while (count < 10) {
            System.out.println(count);
            // imprime sem incrementar
            System.out.println(++count);
            //incrementa 1 a cada impressao e stopa quando for menor que o definido
        }
    }

}
