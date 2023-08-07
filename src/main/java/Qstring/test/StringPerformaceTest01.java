package Qstring.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class StringPerformaceTest01 {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_00);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar a String " + (fim - inicio) + "ms");
        //QUANDO TEMPO VAI DEMORAR PARA REALIZAR ITERAÇÕES

        System.out.println("--------------------------------------------\n");
        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim =System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar a String " + (fim - inicio) + "ms");



    }

    private static void concatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i; //00,01,02,03

        }


    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }

    //stringBuffer foi criada pra ambientes que trabalham com multi thread. Syncronized significa que a uma thread só pode  acessar o metodo por vez
    //StringBuilder não,portanto pode ter erro de concorrência.
}
