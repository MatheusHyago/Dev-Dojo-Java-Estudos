package academy.devdojo.maratonajava.introducao;

/**
 * Demonstração de arrays multidimensionais irregulares (jagged arrays) em Java.
 * Mostra como inicializar, preencher e percorrer arrays onde cada linha pode ter tamanho diferente.
 */
public class Aula19ArrayMultidimensional {
    public static void main(String[] args) {

        // Criação de um array de 3 linhas, mas sem definir o tamanho das colunas ainda
        int[][] arrayInt = new int[3][];

        // Inicialização dinâmica: cada linha recebe um array de tamanho diferente
        arrayInt[0] = new int[2]; // Primeira linha com 2 colunas (valores padrão 0)
        arrayInt[1] = new int[]{1, 2, 3}; // Segunda linha com 3 colunas e valores definidos
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6}; // Terceira linha com 6 colunas e valores definidos

        // Percorrendo o array multidimensional e imprimindo seus valores
        System.out.println("ArrayInt (inicialização dinâmica):");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Linha " + i + ":");
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha do array
        }

        // Outra forma de inicializar um array multidimensional com linhas de tamanhos diferentes
        int[][] arrayInt2 = {
                {1, 2, 3},           // Linha 0 com 3 elementos
                {4, 5, 6, 9, 10},    // Linha 1 com 5 elementos
                {8, 9}               // Linha 2 com 2 elementos
        };

        // Percorrendo o segundo array multidimensional
        System.out.println("\nArrayInt2 (inicialização direta):");
        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.println("Linha " + i + ":");
            for (int j = 0; j < arrayInt2[i].length; j++) {
                System.out.print(arrayInt2[i][j] + " ");
            }
            System.out.println();
        }
    }
}