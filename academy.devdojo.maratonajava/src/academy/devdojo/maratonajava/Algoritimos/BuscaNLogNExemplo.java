package academy.devdojo.maratonajava.Algoritimos;

public class BuscaNLogNExemplo {

    public static void main(String[] args) {

        String[] nomes = {
                "Ana",
                "Bruno",
                "Carlos",
                "Daniela",
                "Eduardo",
                "Fernanda",
                "Gabriel",
                "Helena"
        };

        BuscaNLogNExemplo busca = new BuscaNLogNExemplo();

        busca.exemplo(nomes);
    }

    public void exemplo(String[] nomes) {

        int tamanho = nomes.length;

        int etapasLog = 0;

        while (tamanho > 1) {

            etapasLog++;

            System.out.println("\nEtapa log: " + etapasLog);

            for (int i = 0; i < nomes.length; i++) {

                System.out.println(
                        "Processando: " + nomes[i]
                );
            }

            tamanho = tamanho / 2;
        }
    }
}

