package introducao;

import java.util.Arrays;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula07Arrays02 {

    public static void main(String[] args) {


        int[] numeros = new int[3];
        String[] nomes = {"Maria", "João", "José"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        System.out.println("------------------------------------");
        for (String nome : nomes) {
            System.out.println(nome.toUpperCase());
        }
        System.out.println("------------------------------------");

        System.out.println(Arrays.toString(nomes));
        System.out.println(Arrays.binarySearch(nomes,0,2, "vegeta"));


        System.out.println("------------------------------------");

        boolean[] arrayBoolean = new boolean[3];
        arrayBoolean[0] = true;
        arrayBoolean[1] = false;

        System.out.println(arrayBoolean[1]);
    }

}
