package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.model.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // em herança a ordem de execução é


        //0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe superclasse
        //1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe subclasse
        //2 - Aloca espaço na memória para o objeto da superclasse
        //3 - Cada atributo de superclasse é inicializado com valores default ou que quer que tenha sido definido na classe
        //4 - Bloco de inicialização da superclasse é executado na ordem que aparece na classe
        //5 - Construtor da superclasse é executado
        //6 - Aloca espaço na memória para o objeto da subclasse
        //7 - Cada atributo de subclasse é inicializado com valores default ou que quer que tenha sido definido na classe
        //8 - Bloco de inicialização da subclasse é executado na ordem que aparece na classe
        //9 - Construtor da subclasse é executado
        Funcionario funcionario = new Funcionario("Gustavo");

    }
}
