package Hheranca.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Funcionario02 extends Pessoa02 {
    protected String cargo;


    static{
        System.out.println("dentro do bloco de inicialização estatico de funcionario");
    }
    {
        System.out.println("dentro do bloco de inicialização de funcionario");
    }
    public Funcionario02(String nome, String cpf) {
        super(nome, cpf);
        this.cargo = "Gerente";
        System.out.println("dentro do construtor de funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("cargo: " + this.cargo);
    }


    public void relatorioPagamento() {

        System.out.println(this.cpf);
        System.out.println(this.nome);
    }
}

