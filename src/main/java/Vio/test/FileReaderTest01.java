package Vio.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("outroTeste.txt");
            char[] in = new char[500]; //crio uma especie de buffered em memoria dentor de um array
            fr.read(in);
            for (char i : in) {
                System.out.print(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //o read() quando chega no final do arquivo retorna -1
    }


}
