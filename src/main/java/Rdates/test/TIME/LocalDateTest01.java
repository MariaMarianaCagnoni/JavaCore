package Rdates.test.TIME;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/**
 * @author mariana
 * @Project: javacore
 */
public class LocalDateTest01 {
    //LocalDate só passa a data e não a hora.

    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate ld = LocalDate.of(2002,12,22);
        LocalDate ld2 = LocalDate.of(2023, Month.JULY, 30);
        System.out.println(ld);
        System.out.println(ld.getEra());
        System.out.println(ld.getChronology());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getMonth());
        System.out.println(ld.minusMonths(12)); //subtrai os meses passados


        System.out.println(ld2.isLeapYear());
    }
}
