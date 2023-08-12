package Rdates.test.TIME;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author mariana
 * @Project: javacore
 */
public class PeriodTest01 {

    public static void main(String[] args) {
        Period period = Period.between(LocalDate.now(),LocalDate.now().minusYears(3));
        System.out.println(period);
    //aceita somente LocalDate
        Period p1 = Period.ofDays(10);
        Period p2 = Period.ofMonths(12);
        Period p3 = Period.ofWeeks(45);
        Period p4 = Period.ofMonths(12);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
