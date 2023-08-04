package Oexcecao.exception.test;

import java.io.File;
import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class Exceptiontest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }
    private static void criarNovoArquivo() throws IOException {
        File file = new File("");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch(IOException e ){
        //não deixar esse bloco em branco
            e.printStackTrace();
            throw e;
            //relança a exceção

        }
    }


}
