package academy.devdojo.maratonajava.javacore.Aintroducaometodo.model;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;


    public  double calculaMediaSalario(Funcionario funcionario) {
        double soma = 0;
        for (double salario : funcionario.salario) {
            soma += salario;
        }
        // soma armazena os salarios imputados e divide pelo tamanho dos salarios
        // para calcular a medis
        return soma/ funcionario.salario.length;
    }

    public void imprimeDadosFuncionario( ) {
        System.out.println("------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.printf("Media do Salario: %.2f%n", calculaMediaSalario(this));
    }


}
