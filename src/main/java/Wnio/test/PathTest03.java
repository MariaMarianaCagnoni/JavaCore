package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author mariana
 * @Project: javacore
 */
public class PathTest03 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/mariana").normalize();//caminho absoluto
        Path path = Paths.get("home/mariana").normalize();//caminho relativo
        System.out.println(path);
        System.out.println(path1);
    }

}
