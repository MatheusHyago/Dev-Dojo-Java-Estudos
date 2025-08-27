package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Seminiario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminiario(String titulo, Aluno[] alunos, Local local, Professor professor) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
