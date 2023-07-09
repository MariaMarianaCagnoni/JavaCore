package Gassociacao.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author mariana
 * @Project: javacore
 */
public class LeituraTeclado01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = true;


        while (flag) {


            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine().trim();

            System.out.println("digite sua idade: ");
            int idade = sc.nextInt();
            while (idade < 0 || idade > 150) {
                System.out.println(("idade invalida"));
                idade = sc.nextInt();
            }
            System.out.println("Nome digitado: " + nome + "\nidade digitada:" + idade);

            System.out.println("está correto ?  y/n");
            char decision = sc.next().charAt(0);
            if (decision == 'y') {
                break;
            }
        }
        sc.close();
    }
}
