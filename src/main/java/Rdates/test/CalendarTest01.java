package Rdates.test;

import java.util.Calendar;

/**
 * @author mariana
 * @Project: javacore
 */
public class CalendarTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana pois estou no brasil");
        }else{
            System.out.println("Segunda é o primeiro dia da semana não domingo");
        }


        calendar.getCalendarType(); //tipo de calendario


        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.ERA));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

    }
}
