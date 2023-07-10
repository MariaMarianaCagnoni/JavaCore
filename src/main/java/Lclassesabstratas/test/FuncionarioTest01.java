package Lclassesabstratas.test;

import Lclassesabstratas.domain.Desenvolvedor;
import Lclassesabstratas.domain.Gerente;

/**
 * @author mariana
 * @Project: javacore
 */
public class FuncionarioTest01 {
    public static void main(String[] args) {




//    Funcionario funcionario = new Funcionario();
//funcionario é abstrato portanto não pode ser instanciado

    Gerente gerente = new Gerente("chichi",6000);
        System.out.println(gerente);

        Desenvolvedor dev = new Desenvolvedor("chichi",6000,"java");
        System.out.println(dev);

    }

}
