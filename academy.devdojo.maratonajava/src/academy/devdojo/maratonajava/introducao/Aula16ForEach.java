package academy.devdojo.maratonajava.introducao;
/**
 *
 *
 *
 *
 * */
public class Aula16ForEach {
    public static void main(String[] args) {

        int [] numeros = new int[4];
        int [] numeros2 = {1,2,3,4}; //incializa o array com valores

        int [] numeros3 = new int[] {1,2,3,4,5,6}; //inicializa o array com tamanho dinamico

        // for each percorre o array sem precisar do indice
        // percorre todos os valores do array

        for(int i = 0; i< numeros2.length; i++){
            System.out.println("/++/++/" + numeros3[i] );
        }

        //syntaxe for Each primeiro declara tipo
        for(int num : numeros3){
            System.out.println(num);
        }
    }
}
