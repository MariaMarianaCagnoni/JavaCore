package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author mariana
 * @Project: javacore
 */
public class PathTest02 {
    public static void main(String[] args) throws IOException {

        Path pastaPath = Paths.get("pasta");

        if (!Files.exists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
            //cria uma vez mas se tentar de novo lança exceção
        }
        Path subPasta = Paths.get("pasta/subpasta/subsubpasta");
        Path directories = Files.createDirectories(subPasta);
        boolean exists = Files.exists(directories);
        System.out.println(exists);


        Path filePath = Paths.get(subPasta.toString(), "file.txt");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        } else {
            System.out.println("arquivo já existe");
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.md");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
