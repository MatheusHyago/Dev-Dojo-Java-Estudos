package academy.devdojo.maratonajava.javacore.Hherenca.model;


/**
 * Termo tem há um relacionamento de "é um" com a classe que está herdando
 * então nesta linha o funcionario "é um" pessoa então funcionario herda de pessoa os atributos
 *
 * herança estende a classe pessoa estende a funcionalidade de pessoa
 * vai ter todos atributos e metodos de pessoa
 *
 * Herança = reaproveitamento de código
 *
 * especialização = classe mais baixa e específica da hierarquia
 * generalização = classe mais alta e genérica da hierarquia
 *
 *
 * */
public class Funcionario extends Pessoa {

    private double salario;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
