package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula07Arrays {

    public static void main(String[] args) {

        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("----------------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length + i; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}


