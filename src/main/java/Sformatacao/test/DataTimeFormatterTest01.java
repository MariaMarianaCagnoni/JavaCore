package Sformatacao.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author mariana
 * @Project: javacore
 */
public class DataTimeFormatterTest01 {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        String string1 = time.format(DateTimeFormatter.ISO_DATE_TIME);
        String string2 = time.format(DateTimeFormatter.ISO_DATE);
        String string3 = time.format(DateTimeFormatter.ISO_TIME);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

    }

}
