package Rdates.test.TIME;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author mariana
 * @Project: javacore
 */
public class ResourceBundleTest01 {
    public static void main(String[] args) {
        Locale aDefault = Locale.getDefault();
        System.out.println(aDefault);
        ResourceBundle bundle = ResourceBundle.getBundle("messages",aDefault);
        boolean sasa = bundle.containsKey("hello"); //verifica se existe tal chave no .properties
        System.out.println(sasa);


        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("messages",new Locale
                .Builder()
                .setLanguage("pt").setRegion("BR").build());

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi")); //fallback
    }
}
