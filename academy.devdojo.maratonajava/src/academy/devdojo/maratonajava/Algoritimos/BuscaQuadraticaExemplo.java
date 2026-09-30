package academy.devdojo.maratonajava.Algoritimos;

public class BuscaQuadraticaExemplo {

    public static void main(String[] args) {

        String[] nomes = {
                "Ana",
                "Bruno",
                "Carlos",
                "Daniela",
                "Eduardo"
        };

//        BuscaQuadraticaExemplo busca = new BuscaQuadraticaExemplo();
//        busca.compararNomes(nomes);
//        BuscaQuadraticaExemplo matriz = new BuscaQuadraticaExemplo();
//        matriz.somaMatriz();
//        BuscaQuadraticaExemplo polinomo = new BuscaQuadraticaExemplo();
//        polinomo.polimonoExemplo();
        BuscaQuadraticaExemplo polinomo = new BuscaQuadraticaExemplo();
        polinomo.exemploMatrizOde3();

    }

    public void compararNomes(String[] nomes) {

        int etapas = 0;


    //pra cada iteração deste for
        for (int i = 0; i < nomes.length; i++) {

    //este percorre todos os itens do vetor[]
            for (int j = 0; j < nomes.length; j++) {

                etapas++;

                System.out.println(
                        nomes[i] + " x " + nomes[j]
                );
            }
        }

        System.out.println("\nTotal de etapas: " + etapas);
    }

    public void somaMatriz() {

        int [][]vet =  {{1,2},
                        {4,5}};

        int etapas = 0;
        int count = 0;
        //pra cada iteração deste for
        for (int i = 0; i < vet.length; i++) {

            // Percorre as colunas
            for (int j = 0; j < vet[i].length; j++) {

                etapas++;
                count += vet[i][j];
            }
        }
        System.out.println("Soma: " + count);
    }

    public void polimonoExemplo(){
        //I Entrada
        int [] num1 = {1,2,3,4};
        //J Iteracoes a cada entrada
        int [] num2 = {1,2,3,5,6,7,8};

        int etapa = 0;
        // passos calculados com base no N de entrada X QTD de iteração por entrada
        int count = 0;
        for( int i=0; i < num1.length; i++){
            //matriz ou vetor de entrada
            etapa++;
            for(int j=-0; j < num2.length; j++){
            //iteracoes por entrada
                count++;
                System.out.println(num1[i] + " " + num2[j]);
            }
        }
        System.out.println("passos");
        System.out.println(count);

    }


    //ex O(3³)
    public void exemploMatrizOde3() {

        int[] nums = {1, 2, 3, 4};
        String senha = "114";
        boolean stop = false;

        int count = 0;

        for (int i = 0; i < nums.length && !stop; i++) {

            for (int j = 0; j < nums.length && !stop; j++) {

                for (int k = 0; k < nums.length && !stop; k++) {

                    String res = String.valueOf(nums[i]) + nums[j] + nums[k];

                    if (senha.equals(res)) {
                        stop = true;
                        System.out.println("Senha encontrada!");
                        break;
                    }

                    count++;

                    System.out.println(
                            nums[i] + " " + nums[j] + " " + nums[k]
                    );
                }
            }

            System.out.println("passos");
            System.out.println(count);
        }
    }


}

