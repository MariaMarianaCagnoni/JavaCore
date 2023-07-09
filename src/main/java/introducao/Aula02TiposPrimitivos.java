package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = 30;
        String nome = "Mariana";
        double salario = 2000;
        float floater = 10.0F;
        char caracter = 'M';
        char caracter1 = 176;  //ascii
        char caracter2 = '\u0041';  //unicode
        boolean verdadeiroOuFalso = true;
        byte b = 127;
        short s = 32767;
        long l = 2147483647L;
        var  x = 10; //tipo inferido

        System.out.println(caracter1);


        //casting
        int i = (int) 10.876F;
        System.out.println(i);
        long j = (int) 1087568.9897D;
        System.out.println(j);



    }
}
