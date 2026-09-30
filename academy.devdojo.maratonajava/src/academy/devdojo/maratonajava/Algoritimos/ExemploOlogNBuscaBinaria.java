package academy.devdojo.maratonajava.Algoritimos;

public class ExemploOlogNBuscaBinaria {

    public static void main(String[] args) {

        int[] lista = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
                101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
                111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
                121, 122, 123, 124, 125, 126, 127, 128
        };

        int numeroProcurado = 5;

        int posicao = bynarySearch(lista, numeroProcurado);

        System.out.println("\nElemento procurado: " + numeroProcurado);
        System.out.println("Posição encontrada: " + posicao);
    }

    private static int bynarySearch(int[] lista, int i) {

        int inicioLista = 0;
        int fimLista = lista.length - 1;
        int etapas = 0;

        while (inicioLista <= fimLista) {

            etapas++;

            int meioLista = (inicioLista + fimLista) / 2;
            int item = lista[meioLista];

            System.out.println("\n===== ETAPA " + etapas + " =====");

            for (int x = inicioLista; x <= fimLista; x++) {

                if (x == meioLista) {
                    System.out.println("[" + lista[x] + "] <-- MEIO");
                } else {
                    System.out.println(lista[x]);
                }
            }

            System.out.println("Início: " + inicioLista);
            System.out.println("Fim: " + fimLista);
            System.out.println("Meio: " + meioLista);

            if (item == i) {
                System.out.println("\nElemento encontrado!");
                System.out.println("Total de etapas: " + etapas);
                return meioLista;
            }

            if (item > i) {
                fimLista = meioLista - 1;
            } else {
                inicioLista = meioLista + 1;
            }
        }

        System.out.println("Elemento não encontrado.");
        System.out.println("Total de etapas: " + etapas);

        return -1;
    }

}
