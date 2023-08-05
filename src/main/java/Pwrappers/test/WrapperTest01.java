package Pwrappers.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class WrapperTest01 {
    public static void main(String[] args) {

        short shortp = 1;
        byte bytep = 10;
        int integerp = 1;
        long longp = 10000L;
        float floatp = 1000F;
        double doublep = 1000D;
        boolean booleantp = true;
        char characterp = '@';

        Short shortr = 1;
        Byte byter = 10;
        Integer integerr = 1; //autoboxing
        Long longr = 10000L;
        Float floatr = 1000F;
        Double doubler = 1000D;
        Boolean booleantr = true;
        Character characterr = '@';

        //Wrapper classes encapsula o tipo primitivo e transforma em objeto.

        int i = integerr; //unboxing quando faço um casting de um objeto para um tipo primitivo.
        Integer integer = Integer.parseInt("4"); //converte uma String para um Integer
        System.out.println(integer);
    }
}
