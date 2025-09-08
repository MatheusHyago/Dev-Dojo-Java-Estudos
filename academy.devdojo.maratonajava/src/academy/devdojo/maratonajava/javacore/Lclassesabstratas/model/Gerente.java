package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //ao extender de uma classe abstrata tornase obrigatorio implementar os metodos abstratos definidos da superclasse
    //mesmo que seja vazio {} é obrigatorio implementar na subclasse de funcionario
    @Override
    public void calculaBonus() {
        this.salario = this.salario + (this.salario * 0.1);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

}
