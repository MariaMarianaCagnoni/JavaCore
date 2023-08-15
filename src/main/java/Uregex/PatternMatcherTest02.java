package Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mariana
 * @Project: javacore
 */
public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo que nao for digito
        // \s = todos os espaços em branco  \t \f \n \r
        // \S = todos os caracteres excluindo os brancos
        // \w = tudo de a-zA-Z,digitos,_
        // \W = tudo que não for o \w



        //encontra padrẽs no texto através de meta-characteres
        String regex = "\\D";
        String regex1 = "\\s";
        String texto = "jdsbfv6g4\t582r hbvffbjwkr";

        //precisam ser compiladas
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
