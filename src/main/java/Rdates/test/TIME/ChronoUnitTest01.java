package Rdates.test.TIME;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author mariana
 * @Project: javacore
 */
public class ChronoUnitTest01 {
    public static void main(String[] args) {


        System.out.println("------------------------------------------------");
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2023, 8, 12);

        long daysBetween = ChronoUnit.DAYS.between(start, end);
        System.out.println("Days between: " + daysBetween);

        long monthsBetween = ChronoUnit.MONTHS.between(start, end);
        System.out.println("Months between: " + monthsBetween);

        long yearsBetween = ChronoUnit.YEARS.between(start, end);
        System.out.println("Years between: " + yearsBetween);


    }
}

