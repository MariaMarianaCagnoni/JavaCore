package Oexcecao.exception.domain;

import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class Test01 {

    public static void main(String[] args) {
        lerArquivo3();
    }
    public static void lerArquivo3() {

        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {
            //como é uma pilha,ele fecha de maneria invertida

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
