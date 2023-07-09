package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        //while,do-while,for
        var count = 0;
        while (count < 10) {
            System.out.println(++count);

        }
        do {
            System.out.println("javacore/Aintroducao/teste" + count++);
        } while (count < 10);
    }
}

