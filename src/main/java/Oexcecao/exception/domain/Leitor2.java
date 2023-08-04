package Oexcecao.exception.domain;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class Leitor2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2");
    }


}
