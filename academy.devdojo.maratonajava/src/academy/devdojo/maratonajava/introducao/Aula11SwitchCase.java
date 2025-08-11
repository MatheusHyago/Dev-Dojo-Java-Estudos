package academy.devdojo.maratonajava.introducao;


/**
 * <pre>
 *     ex de switch case
 *
 *     houveram mudanças
 * </pre>
 *
 *
 * <ul>tipos que aceita
 *     <li>char</li>
 *     <li>byte</li>
 *     <li>short</li>
 *     <li>enum</li>
 *     <li>string</li>
 * </ul>
 */
public class Aula11SwitchCase {

    public static void main(String[] args) {

        byte dia = 99;

        // ex switch
        // crtl  + alt + l formata

        //toda vez que entra no case executa break sai
        //utilizar default toda vez que trabalhar com switch porque o valor inserido ex pode ser invalido
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
                break;
            // não importa posição break obrigatorio
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;

                //pode se inserir bloco de codigo com chaves {}
            // e o tipo muda de acordo com que declara ex string com aspas duplas e char aspas simples
        }
    }

}
