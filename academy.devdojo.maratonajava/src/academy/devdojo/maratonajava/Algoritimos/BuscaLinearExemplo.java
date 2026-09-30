package academy.devdojo.maratonajava.Algoritimos;

public class BuscaLinearExemplo {

    public static void main(String[] args) {

        String[] nomes = {
                "Ana",
                "Bruno",
                "Carlos",
                "Daniela",
                "Eduardo",
                "Fernanda",
                "Gabriel",
                "Helena",
                "Igor",
                "João"
        };

        BuscaLinearExemplo busca = new BuscaLinearExemplo();

        busca.buscarNome(nomes, "Fernanda");
    }

    public void buscarNome(String[] nomes, String nomeProcurado) {

        int etapas = 0;

        for (int i = 0; i < nomes.length; i++) {

            etapas++;

            System.out.println("Verificando: " + nomes[i]);

            if (nomes[i].equals(nomeProcurado)) {

                System.out.println("\nNome encontrado!");
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Índice: " + i);
                System.out.println("Etapas: " + etapas);

                return;
            }
        }

        System.out.println("\nNome não encontrado.");
        System.out.println("Etapas: " + etapas);
    }
}
