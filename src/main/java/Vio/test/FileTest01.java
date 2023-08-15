package Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;

/**
 * @author mariana
 * @Project: javacore
 */
public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/mariana/Documents/java_core/javacore/arquivo/file.txt");
        try {
            boolean exists = file.exists();
            if (exists) {
                boolean delete = file.delete();
                System.out.println("path: " + file.getPath());
                System.out.println("path absolute: " + file.getAbsolutePath());

                System.out.println("arquivo deletado ?:" + delete);
            } else {
                boolean newFile = file.createNewFile();
                System.out.println("arquivo criado? :" + newFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("is Directory ? "+ file.isDirectory());
            System.out.println("is file ?  "+ file.isFile());
            System.out.println("is file hidden ?  "+ file.isHidden());
            System.out.println("last modified?  "+ Instant.ofEpochMilli(file.lastModified())
                    .atZone(ZoneId.systemDefault()).toLocalDateTime());
        }
    }

}
