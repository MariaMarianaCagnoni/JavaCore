package Uregex;

/**
 * @author mariana
 * @Project: javacore
 */
public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo que nao for digito
        // \s = todos os espaços em branco  \t \f \n \r
        // \S = todos os caracteres excluindo os brancos
        // \w = tudo de a-zA-Z,dígitos,_
        // \W = tudo que não for o \w
        // [] caracter de RANGE
        // ? = zero ou uma
        //* = zero ou mais
        // +  = uma ou mais ocorrencias
        //{n,m} = de n até m numero de ocorrencias
        // () = agrupamento
        // | = 'ou'
        // $ = fim da linha
        // ^ = anchor

        String textoHexa = "h 567 jh 0x1 0x1652FA";
        String regex4 = "0[xX]([0-9a-fA-F])+(\\s|$)";

    }

}
