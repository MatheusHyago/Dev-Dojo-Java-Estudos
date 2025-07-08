package academy.devdojo.maratonajava.introducao;


/**
 * Estrutura condicionais
 */
public class Aula7 {

    public static void main(String[] args) {

        // Syntaxe de if obrigatorio boolean so executa verdadeiro

        int idade = 20;

        boolean isAutorizado = idade > 23;
        //modelo bloco if
        if (isAutorizado) {
            System.out.println("dentro da evoque prata");
        }

        // operador de negacao ! se nao
        if (!isAutorizado) {

            System.out.println("fora da evoque prata");
        } else {
            System.out.println("MI bombo");

            
        }
    }
}
