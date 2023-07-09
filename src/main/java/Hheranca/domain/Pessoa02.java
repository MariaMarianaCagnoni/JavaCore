package Hheranca.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Pessoa02 {
    protected String nome;
    protected String cpf;

    @Override
    public String toString() {
        return "Pessoa02{" +
                "nome='" + nome + '\'' +
                '}';
    }

    static {
        System.out.println("dentro do bloco de inicialização estatico de pessoa");
    }

    {
        System.out.println("dentro do bloco de inicialização de pessoa");
    }

    public Pessoa02(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("Dentro do construtor Pessoa02");
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println();
    }
}
