package Vio.test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class FileReaderTest02 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("outroTeste.txt");
            int i;
            while((i=fr.read()) != -1){
                System.out.print((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //o read() quando chega no final do arquivo retorna -1
    }


}
