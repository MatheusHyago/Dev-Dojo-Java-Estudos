package academy.devdojo.maratonajava.javacore.Aintroducaometodo.model;

/**
 * Classe responsável por imprimir os dados de um objeto Estudante.
 * <p>
 * Demonstra o conceito de coesão, mantendo a responsabilidade de impressão
 * centralizada nesta classe.
 */
public class ImpressoraEstudante {

    /**
     * Imprime os dados do estudante recebido como argumento.
     * <p>
     * Como o parâmetro é uma referência ao objeto original, qualquer alteração
     * feita nos atributos dentro deste método irá modificar o objeto fora do método.
     *
     * @param estudante objeto Estudante cujos dados serão impressos e alterados
     */
    public void imprime(Estudante estudante) {
        // Exibe os atributos do estudante
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        // Modifica o nome do estudante, afetando o objeto original
        estudante.nome = "Goku";
    }
}