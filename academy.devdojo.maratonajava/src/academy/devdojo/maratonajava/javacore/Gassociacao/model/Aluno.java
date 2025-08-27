package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Aluno {

    private String nome;
    private int idade;
    private Seminiario seminiario;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Seminiario getSeminiario() {
        return seminiario;
    }
    public void setSeminiario(Seminiario seminiario) {
        this.seminiario = seminiario;
    }


}
