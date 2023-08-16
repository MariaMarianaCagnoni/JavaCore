package Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) {

        File file = new File("bufferedExemplo.txt");
        try (FileWriter fr = new FileWriter(file);
             BufferedWriter bf = new BufferedWriter(fr)) {
            bf.write(" testando buffered writer\n");
            bf.newLine();
            bf.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
        //bufferedWriter encapsula a FileWriter e proporciona uma maior velocidade
    }
}
