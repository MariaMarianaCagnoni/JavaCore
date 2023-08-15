package Uregex;

import java.util.Scanner;

/**
 * @author mariana
 * @Project: javacore
 */
public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Goku,Vegeta,Trunks,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
