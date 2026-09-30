package academy.devdojo.maratonajava.Algoritimos;

public class BuscaConstanteExemplo0DE1 {

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

        BuscaConstanteExemplo0DE1 busca = new BuscaConstanteExemplo0DE1();

        busca.buscarNome(nomes, 5);
    }

    public void buscarNome(String[] nomes, int indice) {
        String nome = nomes[indice];
        System.out.println("Nome encontrado: " + nome);
    }
}
