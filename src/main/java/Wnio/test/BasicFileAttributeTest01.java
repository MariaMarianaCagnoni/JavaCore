package Wnio.test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributeTest01 {
    //BasicFileAttributes,PosixFileAttributes,DosFileAttributes
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(10);
        File file = new File("folder/teste02.md");
        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println(isFileCreated);
            boolean isFileModified = file.setLastModified(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
            System.out.println(isFileModified);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path path = Paths.get("folder/teste03.md");
        if (!Files.exists(path)) {
            try {
                Path file1 = Files.createFile(path);
                FileTime fileTime01 = FileTime.from(localDateTime.toInstant(ZoneOffset.UTC));
                Path path1 = Files.setLastModifiedTime(file1, fileTime01);
                System.out.println(path1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        boolean isDirectory = Files.isDirectory(path);
        boolean isRegular = Files.isRegularFile(path);
        boolean isExecutable = Files.isExecutable(path);
        boolean isReadable = Files.isReadable(path);
        boolean isWritable = Files.isWritable(path);

        System.out.println("is the file readable?: "+isReadable);
        System.out.println("is the file executable?:"+isExecutable);
        System.out.println("is a directory? :"+isDirectory);
        System.out.println("is the file regular? : "+isRegular);
        System.out.println("is the file writable?: "+isWritable);

    }
}
