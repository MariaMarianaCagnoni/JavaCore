package Qstring.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class StringTest01 {
    public static void main(String[] args) {
        //String no java são imutaveis
        String nome = "Mariana"; //String constant pool
        String nome2 = "Mariana";

        System.out.println(nome == nome2); //true pois mesmo endereço de memoria

        System.out.println(nome.concat(" Ferreira"));
        System.out.println(nome == nome2); //continua dando true por conta da imutablidade.Continua dando "Mariana"

        nome = nome.concat(" Ferreira");
        System.out.println(nome); //aqui eu mudei a referencia antiga para uma nova referencia

        String nome3 = new String("Mariana");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); //comparo com o conteudo da variavel internamente.





        //   == compara a referencia de memoria(ENDEREÇO)
        //   .equals compara o conteudo da variável.

    }
}
