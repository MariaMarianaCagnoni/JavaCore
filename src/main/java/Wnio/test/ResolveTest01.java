package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        //resolve vai 'unir' caso você tenha dois paths separados

        Path dir = Paths.get("home/mariana");//a partir da onde eu estou,vá para o home/mariana
        Path arquivo = Paths.get("dev/arquivo.txt"); //ir do root do SO
        Path resolve01 = dir.resolve(arquivo);
        System.out.println(resolve01); //resolve junta os paths

        Path absoluto = Paths.get("/home/mariana");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");


        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+ absoluto.resolve(absoluto));
        System.out.println("3 "+ absoluto.resolve(file));
        System.out.println("4 "+ relativo.resolve(absoluto));
        System.out.println("5 "+ relativo.resolve(relativo));
        System.out.println("5 "+ relativo.resolve(file));
    }
}
