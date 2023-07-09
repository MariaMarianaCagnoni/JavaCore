package Isobrescrita.test;

import Hheranca.domain.Endereco02;
import Hheranca.domain.Funcionario02;

/**
 * @author mariana
 * @Project: javacore
 */
public class PessoaTest03 {

    public static void main(String[] args) {
        Endereco02 end = new Endereco02("ruweiruew", "47653");
        Funcionario02 funcionario = new Funcionario02("mariana","84735894");
         funcionario.imprime();
        end.imprimirEnd();


        System.out.println(funcionario);




    }
}
