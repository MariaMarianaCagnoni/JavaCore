package Rdates.test;

import java.util.Locale;

/**
 * @author mariana
 * @Project: javacore
 */
public class LocaleTes02 {

    public static void main(String[] args) {

        //maneira mais moderna de usar é com o Builder !
        Locale locale = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());


        Locale local2 = new Locale.Builder()
                .setLanguage("jp")
                .setRegion("JP")
                .build();
        System.out.println(local2.getCountry());
        System.out.println(local2.getLanguage());


    }
}
