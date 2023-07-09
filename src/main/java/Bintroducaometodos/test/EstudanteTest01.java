package Bintroducaometodos.test;

import Bintroducaometodos.domain.Estudante;

/**
 * @author mariana
 * @Project: javacore
 */
public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        estudante01.nome = "Maria";
        estudante01.idade = 21;
        estudante01.sexo = 'F';

        estudante02.sexo = 'M';
        estudante02.idade = 41;
        estudante02.nome = "José";


        estudante01.imprime();
        System.out.println("---------------------");

        estudante02.imprime();

    }
}
