package Oexcecao.runtimeexception.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class RunTimeExceptionTest02 {

    public static void main(String[] args) {

        System.out.println(divide(1, 0));

        try {
            divide2(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("o programa continua pq apesar de lançado a execeção pro main " +
                "nos tratamos tambem o método main");

        divide(1, 0);

        System.out.println(idade(-1));
    }


    /**
     * @param a
     * @param b cannot be zero.
     * @return
     */
    private static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }
        return 0;
    }

    private static int divide2(int a, int b) throws IllegalArgumentException {
        //colocar na assinatura do metodo avisa o metodo chamado que pode lançar uma exceção.
        //no caso de exções checked não é necessario!

        if (b == 0) {
            throw new IllegalArgumentException("Argumento invalido");
        } else {
            return a / b;
        }

    }

    /**
     * @param idade cannot be less than zero
     * @return
     */
    private static int idade(int idade) {

        if (idade < 0) {
            throw new IllegalArgumentException("Idade invalida");
        }
        return idade;
    }
}