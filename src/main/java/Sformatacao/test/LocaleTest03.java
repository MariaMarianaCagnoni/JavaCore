package Sformatacao.test;

import java.util.Locale;

/**
 * @author mariana
 * @Project: javacore
 */
public class LocaleTest03 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        String[] isoCountries = Locale.getISOCountries();
        for (String countries : isoCountries) {
            System.out.print(countries + " ");
        }
        System.out.println("\n");

        String[] isoLanguages = Locale.getISOLanguages();
        for (String languages:isoLanguages) {
            System.out.print(languages+ " ");
        }






    }
}
