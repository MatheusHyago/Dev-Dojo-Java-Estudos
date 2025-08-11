package academy.devdojo.maratonajava.introducao;

/**
 * Exemplo de uso de arrays multidimensionais (matrizes) em Java.
 * <p>
 * - Arrays multidimensionais permitem armazenar dados em formato de tabela (linhas e colunas).
 * - O primeiro índice representa a linha, o segundo representa a coluna: array[linha][coluna].
 * - O laço for tradicional permite acessar cada elemento informando os índices.
 * - O laço for-each percorre cada linha (array) e cada elemento dessa linha.
 * <p>
 * Observações importantes:
 * <ul>
 *   <li>Arrays multidimensionais são arrays de arrays.</li>
 *   <li>Os valores não inicializados assumem o valor padrão do tipo (0 para int).</li>
 *   <li>O acesso é feito sempre por linha, depois coluna.</li>
 * </ul>
 */
public class Aula18ArraysMultidimensionaisForEach {

    /**
     * Método principal que demonstra a declaração, inicialização, preenchimento e iteração
     * sobre uma matriz de inteiros usando laços for e for-each.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        // Declaração e inicialização de uma matriz 3x3 de inteiros.
        int[][] dias = new int[3][3];

        // Preenchendo manualmente as duas primeiras linhas.
        dias[0][0] = 31; // Linha 0, Coluna 0
        dias[0][1] = 30; // Linha 0, Coluna 1
        dias[0][2] = 28; // Linha 0, Coluna 2

        dias[1][0] = 31; // Linha 1, Coluna 0
        dias[1][1] = 30; // Linha 1, Coluna 1
        dias[1][2] = 28; // Linha 1, Coluna 2

        // A terceira linha permanece com valores padrão (0).

        // Percorrendo a matriz com for tradicional, mostrando índices e valores.
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Linha " + i + ", Coluna " + j + " = " + dias[i][j]);
            }
        }
        System.out.println("-----------------");

        // Para cada linha (array de inteiros) presente em 'dias'
        for (int[] arrayBase : dias) {
            // Para cada elemento inteiro presente na linha atual
            for (int num : arrayBase) {
                // Imprime o valor do elemento
                System.out.println(num);
            }
        }
    }
}