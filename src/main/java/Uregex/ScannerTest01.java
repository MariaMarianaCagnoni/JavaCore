package Uregex;

/**
 * @author mariana
 * @Project: javacore
 */
public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Goku Vegeta Trunks";
        String[] split = texto.split("\\t");//delimitador é um espaço em branco
        for (String s : split) {
            System.out.println(s.trim()
                    //Tokens: Goku Vegeta Trunks
            );
        }

    }
}
