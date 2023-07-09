package Hheranca.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Pessoa extends Endereco{
    private String nome;
    private String cpf;

    public Pessoa(String rua, String cep,String nome, String cpf) {
        super(rua, cep);
        this.nome = nome;
        this.cpf = cpf;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   public void imprime(){
       System.out.println(this.nome);
       System.out.println(this.cpf);
       System.out.println(this.getRua());
       System.out.println(this.getCep());


   }
}
