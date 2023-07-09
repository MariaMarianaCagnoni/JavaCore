package Gassociacao.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Estudante {

    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void estudantePrint(){
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        if(seminario != null){
            System.out.println("Seminario: " + this.seminario.getTitulo());
        }
    }

    public Estudante(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
