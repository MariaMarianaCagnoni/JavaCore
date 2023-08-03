package Oexcecao.exception.test;

import java.io.File;
import java.io.IOException;

import static java.rmi.server.LogStream.log;

/**
 * @author mariana
 * @Project: javacore
 */
public class Exceptiontest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }
    private static void criarNovoArquivo(){
        File file = new File("");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch(IOException e ){
        //não deixar esse bloco em branco
            e.printStackTrace();

        }
    }
}
