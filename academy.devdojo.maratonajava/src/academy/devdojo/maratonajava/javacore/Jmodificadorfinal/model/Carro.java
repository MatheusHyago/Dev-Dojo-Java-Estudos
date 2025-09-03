package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model;

/***
 * final = não pode ser alterado
 *
 * Modificador final em classes = a classe não pode ser estendida
 *
 * FInal trabalha com singletown = unica instancia
 * Modificador final em atributos = o atributo não pode ser alterado
 *
 * definir classe como final faz com que nao permita que a classe   seja estendida
 * ex com a classe String
 */
public  class Carro {
    private String nome;

    //constante deve ser inicializada com valor  e por convençao deve ser tudo maiusculo separado por _ undercase
    //aliada ao metodo static
    public static final double VELOCIDADE_LIMITE;
    //private Final singletown
    //referencia nunca podera ser alterada para este objeto
    public final Comprador COMPRADOR =  new Comprador();
    //outra forma de inicializar
    static {
        VELOCIDADE_LIMITE = 250;
    }
    //ou construtor

    public final void  imprime(){
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Limite: " + VELOCIDADE_LIMITE);
        System.out.println("Comprador: " + COMPRADOR);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
