package Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("outroTeste.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            //o boleano habilita o append(se não vai apagar tudo e reescrever)
            //Try-with-resources pq implementa o Closeable.
            fw.write("Estudar java é bom demais !!!");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // a classe File é bem simples e baixo nivel.
        //quando trabalhamos com uso de recursos do sistema operacional,precisamos fechar o uso do recurso
    }
}
