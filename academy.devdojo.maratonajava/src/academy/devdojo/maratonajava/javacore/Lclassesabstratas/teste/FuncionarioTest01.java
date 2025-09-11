package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

  //      Funcionario funcionario = new Funcionario("Akaza", 1500);
        Gerente gerente = new Gerente("Kokushibo", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Muzan", 12000);

   //     System.out.println(funcionario);
        gerente.imprime();
        System.out.println(gerente);
        desenvolvedor.imprime();
        System.out.println(desenvolvedor);

    }
}
