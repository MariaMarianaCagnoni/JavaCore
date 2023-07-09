package Gassociacao.test;

import Gassociacao.domain.Escola;
import Gassociacao.domain.Professor;

/**
 * @author mariana
 * @Project: javacore
 */
public class EscolaTest {
    public static void main(String[] args) {
        Professor prof = new Professor("Luan");
        Professor prof2 = new Professor("Ricardo");

        Professor[] professores = {prof, prof2};
        Escola escola = new Escola("Dom joao nery",professores);
        escola.imprimir();


    }
}
