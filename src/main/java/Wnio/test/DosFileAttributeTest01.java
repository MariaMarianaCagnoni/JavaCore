package Wnio.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("folder/txt.txt");
        if (Files.notExists(path)) {
            Path file01 = Files.createFile(path);
            Files.setAttribute(file01, "dos:hidden", true);
            Files.setAttribute(file01, "dos:readonly", true); //readOnly nao funciona
            DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dosFileAttributes.isHidden());

        }

    }
}
