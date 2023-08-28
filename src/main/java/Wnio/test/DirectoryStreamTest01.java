package Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        //trabalha com diretorios

        Path dir = Paths.get("."); //pego tudo do diretorio atual
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                System.out.println(path.getFileName()); //imprime todos os arquivos,incluindo os ocultos
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

