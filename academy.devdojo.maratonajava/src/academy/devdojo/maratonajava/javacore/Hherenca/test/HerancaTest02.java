package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.model.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // em herança a ordem de execução é

        //primeiro a superclasse
        //depois a subclasse
        //blocos de inicialização estáticos são executados na ordem que aparecem
        Funcionario funcionario = new Funcionario("Gustavo");

    }
}
