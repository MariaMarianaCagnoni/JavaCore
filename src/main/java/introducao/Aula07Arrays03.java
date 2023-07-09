package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula07Arrays03 {

    public static void main(String[] args) {


        int[] arrays = new int[3];
        arrays = new int[]{1, 2, 3};

        for (int numeros : arrays
        ) {
            System.out.println(numeros);
        }

        String[] nomes = new String[]{"Mariana", "João", "Marcos"};
        //ele dinamicamente ja aloca o número de posições

        for (String nome : nomes) {
            System.out.println(nome.toUpperCase());
        }
    }
}
