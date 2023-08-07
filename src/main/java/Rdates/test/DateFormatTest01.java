package Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * @author mariana
 * @Project: javacore
 */
public class DateFormatTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getTimeInstance();
        df[4] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[5] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[6] = DateFormat.getDateInstance(DateFormat.LONG);

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
