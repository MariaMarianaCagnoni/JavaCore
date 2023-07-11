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
        gerente.ferias();

        System.out.println("---------------------------");

        Desenvolvedor dev = new Desenvolvedor("joao",6000,"java");
        System.out.println(dev);
        dev.ferias();
        System.out.println("----------------------------------");

        Gerente gerente2 = new Gerente("ricardo",2300.56);

        System.out.println("salario inicial  "+ gerente2.getSalario() + " bonus gerente"+ gerente2.calculoBonus());
        System.out.println("----------------------------------");
        System.out.println("salario inicial  "+ dev.getSalario() + " bonus dev:" +dev.calculoBonus());

        gerente2.setSalario(2300.56);


    }

}
