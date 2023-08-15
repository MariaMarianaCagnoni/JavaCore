package Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mariana
 * @Project: javacore
 */
public class PatternMatcherTest01 {
    public static void main(String[] args) {
        //encontra padrẽs no texto através de meta-characteres
        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "ababababa";

        //precisam ser compiladas
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        Matcher matcher2 = pattern.matcher(texto2);
        System.out.println(matcher);
        while(matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
        System.out.println("------------");

        while(matcher2.find()){
            System.out.print(matcher2.start()+ " "+ matcher2.group()); //ele nao conta o mesmo índice duas vezes

        }
    }
}
