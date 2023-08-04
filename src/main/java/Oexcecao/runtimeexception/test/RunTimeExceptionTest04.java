package Oexcecao.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * @author mariana
 * @Project: javacore
 */
public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
        //a exceção mais generica(runtimeexception) tem que ser a ultima pela regra do polimorfismo
        //se for a primeira os demais catches são ignorados


        try {
            talvezLanceException();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //a regra tambem funciona para as classes filhas de Exception

    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

}


