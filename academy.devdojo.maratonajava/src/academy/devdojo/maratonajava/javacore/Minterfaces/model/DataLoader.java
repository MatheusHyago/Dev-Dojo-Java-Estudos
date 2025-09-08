package academy.devdojo.maratonajava.javacore.Minterfaces.model;
/**
 * Interface - contrato
 * uma classe pode implementar multiplas interfaces
 * uma interface pode extender multiplas interfaces
 * todos os metodos de uma interface sao publicos e abstratos
 * uma interface nao pode ser instanciada
 * uma interface pode ter atributos, porem esses atributos sao publicos, estaticos e finais
 *
 * importante: uma interface nao pode ter construtores
 *
 * Uma interface é um contrato que define um conjunto de métodos que uma classe deve implementar.
 *
 * padrao metodos publicos e abstratos e caso nao for abstrato deve ser default ou static mas ainda sera public padrao
 *
 * não existe objeto de interface pois não pode ser instanciada
 *
 * Ao trabalhar com interfaces e importante lembrar sobre os modificadores de acesso
 * um metodo de interface é sempre public e abstract, mesmo que nao seja declarado explicitamente
 * os atributos de uma interface são sempre public, static e final
 *
 * Uma interface pode conter metodos default e static com implementações
 *
 * Uma interface pode extender outras interfaces, permitindo a criação de hierarquias de interfaces
 *
 * nunca pode ser private quando trabalhamos com interface ou abstrata só protected ou public
 *
 * Interface desacopla o codigo e faz alto uso do polimorfismo melhora qualidade e facilidade de manutenção
 *
 * */
public interface DataLoader {
    //default = public abstract
    //atributo de interface é sempre public, static e final e sao constantes

    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    //default method - metodo que permite implementação dentro da interface
    //private-> default -> protected -> public

    default void checkPermission(){
        System.out.println("Verificando permissões");
    };

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da interface: " + MAX_DATA_SIZE);
    };

}
