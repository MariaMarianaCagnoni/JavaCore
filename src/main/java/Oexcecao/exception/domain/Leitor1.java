package Oexcecao.exception.domain;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

/**
 * @author mariana
 * @Project: javacore
 */
public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("fechando leitor 1");
    }
}
