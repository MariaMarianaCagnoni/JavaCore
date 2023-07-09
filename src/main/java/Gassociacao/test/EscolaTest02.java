package Gassociacao.test;

import Gassociacao.domain.*;

/**
 * @author mariana
 * @Project: javacore
 */
public class EscolaTest02 {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Java");
        Seminario[] seminarios = {seminario};

        Local local = new Local("Rua das Flores");
        Estudante estudante = new Estudante("Maria", 37, seminario);

        Professor02 professor = new Professor02("José", "matematica", seminarios);

        estudante.estudantePrint();

        System.out.println("-----------------------");
        professor.professorPrint();
    }
}
