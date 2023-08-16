package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author mariana
 * @Project: javacore
 */
public class PathTest01 {
    public static void main(String[] args) {

        Path p1 = Paths.get("/home/mariana/Documents/java_core/javacore/file2.txt");
        System.out.println(p1.getFileName());
        System.out.println(p1.getParent());

    }
}
