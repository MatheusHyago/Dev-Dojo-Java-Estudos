package academy.devdojo.maratonajava.introducao;

/**
 *
 * <pre>
 *     switch
 *
 * </pre>
 * */


public class Aula10 {

        public static void main(String[] args) {
            // Stack (Variáveis do tipo primitivo)

            // Exemplo da Stack abaixo:
            // NOME_VARIAVEL | VALOR_VARIAVEL
            // numero        | 5

            int numero = 5;

            System.out.println(numero);

            // Heap (Variáveis do tipo de referência - Instâncias de classes / Objetos)

            // Exemplo do Heap abaixo:
            // NOME_VARIAVEL | VALOR_VARIAVEL
            // pessoa        | academy.devdojo.maratonajava.introducao.Aula10$Pessoa@63961c42

            Pessoa pessoa = new Pessoa();
            pessoa.nome = "Pedro";

            System.out.println(pessoa);

        }

        public static class Pessoa extends Object {
            String nome;

            @Override
            public String toString() {
                return this.nome;
            }
        }
}
