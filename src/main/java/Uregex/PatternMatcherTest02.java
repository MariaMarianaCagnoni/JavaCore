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
        // \w = tudo de a-zA-Z,dígitos,_
        // \W = tudo que não for o \w
        // [] caracter de RANGE


        //encontra padrẽs no texto através de meta-characteres
        String regex2 = "[ABCabc]";
        //exemplo2: [a-zA-C] retorna tudo de a a z e de A a C
        String regex1 = "\\s";
        String texto = "jdsbfv6g4\t582r hbvffbjwkr";
        String texto2 = "ABRACOabra";

        //precisam ser compiladas
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
        int hexaDecimal = 0x69F86A;
        //números exadecimais no java começam com 0x sempre

        System.out.println("\n"+ hexaDecimal);


    }

}
