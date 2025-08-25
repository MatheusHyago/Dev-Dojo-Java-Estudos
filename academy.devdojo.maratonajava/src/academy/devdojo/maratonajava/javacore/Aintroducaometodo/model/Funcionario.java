package academy.devdojo.maratonajava.javacore.Aintroducaometodo.model;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salario;


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

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
