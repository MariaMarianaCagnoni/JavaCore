package Rdates.test;

import java.util.Date;

/**
 * @author mariana
 * @Project: javacore
 */
public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000);
        // Mon Jan 12 10:46:40 BRT 1970
        //classe praticamente depreciada
        //Date trabalha em millisegundos
        System.out.println(date);

        Date date2 = new Date();
        System.out.println(date2.getTime());  //pegou a data e tranferiu para milisegundos -> 1691427243726
    //para add uma hora
        date2.setTime(date2.getTime() + 3_600_000 );
        System.out.println(date2);
    }
}