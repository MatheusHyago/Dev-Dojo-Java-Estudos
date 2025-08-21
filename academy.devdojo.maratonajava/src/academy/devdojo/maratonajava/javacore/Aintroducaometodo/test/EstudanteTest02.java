package academy.devdojo.maratonajava.javacore.Aintroducaometodo.test;

import academy.devdojo.maratonajava.javacore.Aintroducaometodo.model.Estudante;

/**
 * Método principal que demonstra a criação de objetos Estudante,
 * atribuição de valores e chamada de métodos de instância.
 *
 * @param  argumentos da linha de comando (não utilizados)
 */

public class EstudanteTest02 {

    public static void main(String[] args) {

        //var referencia controle remoto

        //nome
        //idade
        //sexo

        //sempre sera executado pelo objeto nao pela variavel de referencia
        //estudante01.imprime();

        //manda sinal para o objeto estudante executar sout com this
        // ex this.nome = kokushibo;
        //this tem acesso a tudo
        // Criação de dois objetos Estudante, cada um com sua própria referência
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        // Atribuição de valores aos atributos do primeiro estudante
        estudante01.nome = "kokushibo";
        estudante01.idade = 1000;
        estudante01.sexo = 'M';

        // Atribuição de valores ao segundo estudante
        estudante02.nome = "Tanjiro";
        estudante02.idade = 16;
        estudante02.sexo = 'M';

        // Chamada do método imprime diretamente pelo objeto
        // O método imprime acessa os atributos do próprio objeto usando 'this'
        estudante01.imprime();
        estudante02.imprime();
    }
}
