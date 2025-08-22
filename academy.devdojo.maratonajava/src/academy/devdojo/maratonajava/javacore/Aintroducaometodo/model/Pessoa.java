package academy.devdojo.maratonajava.javacore.Aintroducaometodo.model;
/**
 *Acoplamento o quanto uma classe se conecta a outra
 * 
 *Modificadores private = baixo acopalhamento
 *
 * private = estes atributos so podem ser acessados dentro da propria classe / OBJ
 *
 *
 *Toda vez quee cria um metodo para colocar um valor num atributo dentro de um valor começa com set
 * Toda vez que cria um metodo para pegar um valor num atributo dentro de um valor começa com get
 *
 *
 * Alto acoplamento é quando uma classe depende de outra classe para funcionar
 * Baixo acoplamento é quando uma classe não depende de outra classe para funcionar
 *
 * Alto acoplamento é ruim
 * Baixo acoplamento é bom
 *
 * Coesão é o quão focada e especializada uma classe está em realizar uma única tarefa ou um conjunto de tarefas relacionadas.
 *
 * Alta coesão e bom
 * Baixa coesão ruim
 *
 * This metodo depotente
 * pois não importa quantas vezes chamarmos o metodo imprimeDadosPessoa
 * ele nao altera os atributos nome e idade
 * */
public class Pessoa {

    // Atributos
    private String nome;
    private int idade;

    // Métodos
    //this.nome e getNome são usados para acessar o atributo nome tem a mesma função
    //    public void imprimeDadosPessoa() {
    //        System.out.println("Nome: " + this.nome);
    //        System.out.println("Idade: " + this.idade);
    //    }

    //define os metodos set e get para os atributos nome e idade
    //que são privados e permitem que seus valores sejam acessados e modificados
    public void setNome( String nome) {
        this.nome = nome;
    }
    //ex baixo acoplamento implementa camada entre o acesso ao atributo que caso nescessite alteração so importa a chamada
    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Idade inválida, não pode ser negativa.");
            return;
        }
        this.idade = idade;
    }

    //Get sempre será public para outra variavel
    //sem parametro acesso apenas valor em memoria
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }


}
