package Hheranca.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Funcionario extends Pessoa{
    public String cargo;


    @Override
    public void imprime() {
        super.imprime();
        System.out.println("cargo: " + this.cargo);
    }

    public Funcionario(String rua, String cep, String nome, String cpf, String cargo) {
        super(rua, cep, nome, cpf);
        this.cargo = cargo;




    }
}
