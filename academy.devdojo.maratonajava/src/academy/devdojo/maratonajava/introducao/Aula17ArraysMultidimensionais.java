package academy.devdojo.maratonajava.introducao;

/**
 * Exemplo de uso de arrays multidimensionais (matrizes) em Java.
 * Arrays multidimensionais permitem armazenar dados em formato de tabela (linhas e colunas).
 */
public class Aula17ArraysMultidimensionais {
    public static void main(String[] args) {

        // Declaração e inicialização de uma matriz de inteiros com 3 linhas e 3 colunas.
        // O primeiro índice representa a linha, o segundo representa a coluna.
        int[][] dias = new int[3][3];

        // Preenchendo manualmente os valores das duas primeiras linhas.
        dias[0][0] = 31; // Linha 0, Coluna 0
        dias[0][1] = 30; // Linha 0, Coluna 1
        dias[0][2] = 28; // Linha 0, Coluna 2

        dias[1][0] = 31; // Linha 1, Coluna 0
        dias[1][1] = 30; // Linha 1, Coluna 1
        dias[1][2] = 28; // Linha 1, Coluna 2

        // A terceira linha (índice 2) permanece com valores padrão (0).

        // Percorrendo todas as linhas da matriz com o primeiro laço for (i)
        for (int i = 0; i < dias.length; i++) {
            // Para cada linha, percorre todas as colunas com o segundo laço for (j)
            for (int j = 0; j < dias[i].length; j++) {
                // Acessa e imprime o valor armazenado na posição [i][j]
                System.out.println("Linha " + i + ", Coluna " + j + " = " + dias[i][j]);
            }
        }
    }
}