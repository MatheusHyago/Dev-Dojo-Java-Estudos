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
 * quando utiliza protected nao deixa acessar de outras classes fora do pacote
 *
 * */
public class Funcionario extends Pessoa {

    private double salario;

    //metodo de sobreescrita @Override
    //Escreve o com a mesma assinatura do metodo da superclasse / classe pai
    //regra da sobreescrita sempre importa todos os atributos da super classe
    public void imprime() {
        //chama o metodo da super classe
        //imprime os atributos da classe pessoa
        //e depois imprime o atributo da classe funcionario

        //super metodo generico e chama o metodo da super classe, tnt super quanto this
        //ele chama o metodo da super classe
        //depois imprime o atributo salario da classe funcionario específica
        super.imprime();
        System.out.println("Salario: " + this.salario);


    }

    //Construtor chamado da super classe
    public Funcionario(String nome) {
        //mesmo padrao do override chama o super construtor que traz o atributo nome do construtor da super classe
        //e depois disso posso passar os atributos especificos da classe funcionario

        //nunca esqueça de chamar o construtor da super classe
        //gera apenas com os campos visuais da classe funcionario
        //crtl + o da pra fazer a sobreescrita do construtor

        super(nome);
    }

    public void relatorioPagamento(){
        //Não é o ideal acessar atributos da super classe
        //recomenda-se usar o modificador protected
        //da acesso direto a variavel e subclasses independente do pacote  todas do pacote teram acesso
        System.out.println("Eu " + this.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    //especialização
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
