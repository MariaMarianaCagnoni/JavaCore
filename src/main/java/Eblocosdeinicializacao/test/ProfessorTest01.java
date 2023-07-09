package Eblocosdeinicializacao.test;

import Eblocosdeinicializacao.domain.Professor;

/**
 * @author mariana
 * @Project: javacore
 */
public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor prof = new Professor();
        System.out.println(prof.getSalario());
        Professor prof2 = new Professor("paulo","neurologista",32);
        System.out.println(prof2); //perceba que o salario foi incializado para todas as instancias



    }
}
