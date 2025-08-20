// academy.devdojo.maratonajava/src/academy/devdojo/maratonajava/javacore/Aintroducaometodo/test/EstudanteTest01.java
package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Estudante;
import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.ImpressoraEstudante;

/**
 * Demonstra a criação de objetos, atribuição de valores e passagem de referência
 * para métodos em Java. Mostra que métodos recebem uma cópia da referência do objeto,
 * mas não alteram o objeto original, a menos que modifiquem seus atributos.
 */
public class EstudanteTest01 {

    /**
     * Método principal que instancia dois estudantes, imprime seus dados e
     * explica o conceito de referência de objetos na memória.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        // Cada variável estudante faz referência a um objeto diferente na memória.
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        // Impressora para exibir os dados dos estudantes.
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        // Inicializando atributos do primeiro estudante.
        estudante01.nome = "kokushibo";
        estudante01.idade = 1000;
        estudante01.sexo = 'M';

        // Inicializando atributos do segundo estudante.
        estudante02.nome = "Tanjiro";
        estudante02.idade = 16;
        estudante02.sexo = 'M';

        // Ao passar o objeto como argumento, o método recebe uma cópia da referência.
        // Isso significa que pode acessar e modificar os atributos do objeto original.
        System.out.println("Imprimindo estudante01:");
        impressora.imprime(estudante01);

        System.out.println("Imprimindo estudante02:");
        impressora.imprime(estudante02);

        System.out.println("-----------------");

        // Exibindo os dados diretamente, mostrando que os valores permanecem os mesmos.
        System.out.println("Dados estudante01:");
        System.out.println("Nome: " + estudante01.nome);
        System.out.println("Sexo: " + estudante01.sexo);
        System.out.println("Idade: " + estudante01.idade);

        System.out.println("Dados estudante02:");
        System.out.println("Nome: " + estudante02.nome);
        System.out.println("Sexo: " + estudante02.sexo);
        System.out.println("Idade: " + estudante02.idade);
    }
}