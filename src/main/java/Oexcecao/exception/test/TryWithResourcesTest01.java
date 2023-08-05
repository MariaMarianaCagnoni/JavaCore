package Oexcecao.exception.test;

import java.io.*;
import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class TryWithResourcesTest01 {
    public static void main(String[] args) {


    }

    public static void lerArquivo() {

        //try-with-resources é uma forma de criar um recurso que será fechado automaticamente
        //pois o Reader implementa a classe closeable(que extende a classe autocloaseable)
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
            //então,como o java vai fechar pra mim,eu não preciso implementar o .close dentro de um finally
            //pois o java vai fazer isso automaticamente

        } catch (IOException e) { //pode ser retinado,porem vai precisar do throws na assinatura do método
            e.printStackTrace();

        }
        {

        }
    }

    private static void readFile() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) { //reader pode ser null ,o que causaria NullPointerException
                    reader.close(); // close gera um IOException
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
