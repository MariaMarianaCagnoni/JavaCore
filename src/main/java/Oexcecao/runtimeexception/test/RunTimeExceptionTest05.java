package Oexcecao.runtimeexception.test;

import java.sql.SQLException;

/**
 * @author mariana
 * @Project: javacore
 */
public class RunTimeExceptionTest05 {
    public static void main(String[] args) {
        //multicach em linha

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
            //nao podem ter mais de um catch com a mesma exceção
            //nao podem ter um catch com a exceção filha e a exceção pai
        }

        try {
            talvezLanceException();
        } catch (SQLException | RuntimeException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, RuntimeException {

    }


}


