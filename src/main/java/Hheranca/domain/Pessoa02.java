package Hheranca.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Pessoa02 {
    protected String nome;
    protected String cpf;

    public Pessoa02(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println();
    }
}
