package academy.devdojo.maratonajava.introducao;

/**
 * <pre>
 *
 *     arrays coleções de dados
 *
 *     funciona como uma lista
 *     é um tipo de dado que armazena uma coleção de dados do mesmo tipo
 *
 *     traabalha diretamente com a memória e utiliza variáveis de referência
 *     para acessar os dados armazenados.
 *
 *     modelo convençao de arrays
 *     tipo[] nome = new tipo[tamanho];
 *
 *
 *    modelos que array inicializa tipos primitivos iniciam com 0
 *    e tipos referenciais iniciam com null
 * </pre>
 *
 * <ul>
 *     <li>tipo Primitivo - var utilizada na declaração do tipo de dados</li>
 *     <li>Reference -  tipo da variavel que armazena os dados</li>
 * </ul>
 */

public class Aula13Arrays {

    public static void main(String[] args) {
        int[] idades = null;   //somente tipos de referência podem ser nulos

        //toda vez que for mexer com array precisa declarar o tamanho

        //Arrays são estruturas indexadas, ou seja, cada elemento é acessado por um índice numérico.

        String[] nomes = new String[3];

         nomes[0] = "Bencio Pirulito";
         nomes[1] = "Bencio chiclete";
         nomes[2] = "Bencio bala de goma";

        System.out.println(nomes[2]); //imprime buscando o valor pelo indice

    }
}


