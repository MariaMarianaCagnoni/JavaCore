package Vio.test;

import java.io.*;

/**
 * @author mariana
 * @Project: javacore
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {

        File file = new File("file2.txt");
        boolean exists = file.exists();
        System.out.println(exists);

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
