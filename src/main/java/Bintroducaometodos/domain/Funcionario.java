package Bintroducaometodos.domain;

import org.jetbrains.annotations.NotNull;

/**
 * @author mariana
 * @Project: javacore
 */
public class Funcionario {

    public String nome = null;
    public int idade = 0;
    public double[] salarios = null;


    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.print("salarios: ");
        for (double sal : salarios) {
            System.out.print(sal + ", ");
        }

        calcMediaSalarial();
    }

    public void calcMediaSalarial() {
        double media = 0;
        if (salarios != null) {
            for (double sal : salarios) {
                media += sal;
            }
            media /= salarios.length;
            System.out.printf("\nresultado da media salarial: %.2f",media);
        }
    }


}
