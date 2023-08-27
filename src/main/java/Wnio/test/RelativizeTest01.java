package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        //dado dois paths,como chegar no path1 através do path2

        Path dir = Paths.get("/home/mariana");
        Path clazz = Paths.get("/home/mariana/devdojo/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute01 = Paths.get("/home/mariana");
        Path absolute02 = Paths.get("/usr/local");
        Path absolute03 = Paths.get("/home/mariana/devdojo/OlaMundo.java");
        Path relativo01 = Paths.get("temp");
        Path relativo02 = Paths.get("temp/temp2");

        System.out.println("1 -"+ absolute01.relativize(absolute03));
        System.out.println("2 -"+ absolute03.relativize(absolute01));
        System.out.println("3 -"+ absolute01.relativize(absolute02));
        System.out.println("4 -"+ relativo01.relativize(relativo02));
        System.out.println("5 -"+ relativo02.relativize(relativo01));
//        System.out.println("6 -"+ absolute01.relativize(relativo01)); lanã exceção,o java nao consegue chegar na pasta





    }
}
