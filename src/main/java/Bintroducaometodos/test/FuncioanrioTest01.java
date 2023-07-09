package Bintroducaometodos.test;

import Bintroducaometodos.domain.Funcionario;

/**
 * @author mariana
 * @Project: javacore
 */
public class FuncioanrioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Maria";
        funcionario.idade = 30;
        funcionario.salarios = new double[]{1000, 2000, 5000};
        funcionario.imprimirDados();


    }
}
