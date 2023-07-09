package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        if (false)
            System.out.println("dentro do if");


        System.out.println("fora do if");
        //

        if (true) {
            System.out.println("dentro do if");
        }
        var idade = 20;
        var isAutoriadoAComprarBebida = idade >= 21;

        if (isAutoriadoAComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        }
        if (idade == 12) {
            System.out.println("Tem 12 anos");
        }

    }
}

