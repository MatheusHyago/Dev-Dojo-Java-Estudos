package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Professor {
    private String nome;

    private String especialidade;

    private Seminiario [] seminiarios;



    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminiario[] seminiarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminiarios = seminiarios;
    }

    public void imprime() {

        System.out.println("------------------");
        System.out.println("Nome: " + this.nome);
        if (seminiarios == null) return;
        System.out.println("##Seminarios Cadastrados##");
        for (Seminiario seminiario : this.seminiarios) {
            System.out.println(seminiario.getTitulo());
            System.out.println(seminiario.getLocal().getEndereco());
            System.out.println("**Alunos Inscritos**");
            if (seminiario.getAlunos() == null || seminiario.getAlunos().length == 0) continue;
            for (Aluno aluno : seminiario.getAlunos()) {
                System.out.println("Aluno" + aluno.getNome() + " Idade: " + aluno.getIdade());
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminiario[] getSeminiarios() {
        return seminiarios;
    }


    public void setSeminiarios(Seminiario[] seminiarios) {
        this.seminiarios = seminiarios;
    }
}
