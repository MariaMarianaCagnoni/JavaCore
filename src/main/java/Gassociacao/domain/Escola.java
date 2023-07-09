package Gassociacao.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Escola {
    private String nome;

    private Professor[] professor;

    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void imprimir() {
        System.out.println(this.nome);
        if (professor != null) {
            for (Professor prof : professor) {
                System.out.println(prof.getNome());
            }
        }
    }
    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
