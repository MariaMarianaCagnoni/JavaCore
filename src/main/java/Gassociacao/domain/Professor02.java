package Gassociacao.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Professor02 {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor02(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor02() {
    }
    public  void professorPrint(){
        System.out.println("Professor: " + this.nome);
        System.out.println("Especializade: " + this.especialidade);
        if (seminarios == null) {
            for (Seminario seminario : seminarios) {
            System.out.print("seminário: "+seminario.getTitulo());
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
