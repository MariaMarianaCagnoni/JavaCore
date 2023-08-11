package Rdates.test.TIME;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author mariana
 * @Project: javacore
 */
public class LocalDateTimeTest01 {
    //data e hora
    public static void main(String[] args) {

        DateTimeFormatter patter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy',' 'na hora:' HH:mm:ss ");
        LocalDateTime local = LocalDateTime.now();
        String format = local.format(patter);

        System.out.println(format);
    }

}
