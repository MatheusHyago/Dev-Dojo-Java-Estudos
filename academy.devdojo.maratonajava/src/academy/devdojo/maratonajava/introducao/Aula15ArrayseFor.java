package academy.devdojo.maratonajava.introducao;

/**
 * arrays tipo reference = objetos que armazenam dados
 *
 * por serem deste tipo possuem metodos e atributos ex
 * length, clone, toString, equals, hashCode metodos que armazenam tamnho e posição na memoria
 * */


public class Aula15ArrayseFor {

    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Bencio Pirulito";
        nomes[1] = "Bencio chiclete";
        nomes[2] = "tunga veia";
        nomes [3] = "Bencio bala de goma";

        //valor deve ser equivalente a o tamanho do arrays neste ex 3
        // valores nao sao dinamicos
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]); //imprime buscando o valor pelo indice
        }

        // sobrescreve o antigo / nao recupera o valor antigo
        // se quiser manter o valor antigo precisa criar outro array
        // ou utilizar o clone para copiar os valores
        // clone cria uma copia do array original
        //pois desta forma atualiza o array original
        nomes = new String[3]; //recria o array com tamanho 3, perde os valores anteriores
        nomes[0] = "Bencio Pirulito";
        nomes[1] = "Bencio chiclete";
        nomes[2] = "Bencio bala de goma";




    }
}
