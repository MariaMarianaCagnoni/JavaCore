package Qstring.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //com StringBuilder deixa-se de existir o conceito de String imutável.

        StringBuilder sb = new StringBuilder();
        //sem passar a capacidade, ele cria a de default 16 caracteres
        //StringBuilder e String são coisas diferentes

        sb.append(""); //a maneira de add uma string é usando o metodo append e não mais o "="
        sb.append("mariana");
        System.out.println(sb);
        sb.append(" cagnoni");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);


    }
}
