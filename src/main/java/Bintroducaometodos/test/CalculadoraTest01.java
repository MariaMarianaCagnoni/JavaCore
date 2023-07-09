package Bintroducaometodos.test;

import Bintroducaometodos.domain.Calculadora;

/**
 * @author mariana
 * @Project: javacore
 */
public class CalculadoraTest01 {
    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(12, 3);
        calculadora.divideDoisNumeros(20, 0);
        double result = calculadora.divideDoisNumeros2(50, 2);
        System.out.println(result);

        System.out.println("-------------------");
        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("--------------------------");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("--------------------------");


        calculadora.somaArray(new int[]{1,2,3,4,5});
        calculadora.somaVarArgs(1,2,3,4,5);
        //calculadora.somaTresValores(null);




    }
}
