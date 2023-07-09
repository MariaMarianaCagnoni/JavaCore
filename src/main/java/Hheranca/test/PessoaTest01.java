package Hheranca.test;

import Hheranca.domain.Funcionario;
import Hheranca.domain.Pessoa;

/**
 * @author mariana
 * @Project: javacore
 */
public class PessoaTest01 {
    public static void main(String[] args) {

        //Pessoa pessoa =  new Pessoa("rua doutor francisco arrura roso","347856","mariana","37463785");

        //pessoa.imprime();
        Funcionario funcionario = new Funcionario("rua doutor francisco arrura roso","347856","mariana","37463785","vendedor");

        funcionario.imprime();


        //herança causa alto acoplamento

    }
}
