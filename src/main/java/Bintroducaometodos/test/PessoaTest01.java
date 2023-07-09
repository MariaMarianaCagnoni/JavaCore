package Bintroducaometodos.test;

import Bintroducaometodos.domain.Pessoa;

/**
 * @author mariana
 * @Project: javacore
 */
public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mariana");
        pessoa.setIdade(10);
        pessoa.imprime();
    }
}
