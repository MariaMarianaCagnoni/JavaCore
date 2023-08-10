package Sformatacao.test;

import java.text.ParseException;
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

        SimpleDateFormat sf2 = new SimpleDateFormat("'Brasil- dia: 'dd 'de' MMMM 'de ' yyyy");
        System.out.println(sf2.format(new Date()));

        //parse
        try{
            System.out.println(sf2.parse("Brasil- dia: 10 de agosto de  2023"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
