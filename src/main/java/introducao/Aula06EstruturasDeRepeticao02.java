package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {


        //imprimir todos os números pares de 0 até 1000000

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //imprimir os 25 primeiros numeros de 50
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i <= 50; i++) {
            while (i <= 25) {
                System.out.println(i);
                break;
            }
        }
        for (int i = 0; i <= 50; i++) {
            if (i == 25) {
                System.out.println(i);
                break;
            }
        }
    }
}

