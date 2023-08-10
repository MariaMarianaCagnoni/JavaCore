package Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author mariana
 * @Project: javacore
 */
public class NumberFormat01 {
    public static void main(String[] args) {

        NumberFormat instance = NumberFormat.getInstance(Locale.JAPANESE);
        System.out.println(instance.format(564367.453));
    }
}
