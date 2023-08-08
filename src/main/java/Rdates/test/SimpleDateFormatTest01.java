package Rdates.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mariana
 * @Project: javacore
 */
public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "\"yyyy.MM.dd G 'at' HH:mm:ss z\"";
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        //trabalha como uma formatação de datas mais simples que DateFormat
        System.out.println(sf.format(new Date()));
    }
}
