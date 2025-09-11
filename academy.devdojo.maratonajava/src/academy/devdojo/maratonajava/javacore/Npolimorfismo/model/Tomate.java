package academy.devdojo.maratonajava.javacore.Npolimorfismo.model;

/**
 *
 * */
public class Tomate extends Produto {

    public static final double IMPOSTO_PORCENTAGEM = 0.06;
    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");

        return this.preco * IMPOSTO_PORCENTAGEM;
    }
}
