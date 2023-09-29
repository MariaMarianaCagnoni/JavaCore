package Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class GenericsTest01 {
    public static void main(String[] args) {

        //antes do Generics
        List lista = new ArrayList();

        lista.add("mariana");
        lista.add(34456);
        lista.add(true);
        lista.add('Q');

        for (Object list : lista) {
            if(list instanceof String){
                System.out.println(lista);
            }
            if(list instanceof Double){
                System.out.println(lista);
            }
            if (list instanceof Boolean){
                System.out.println(lista);
            }
            if (list instanceof Character){
                System.out.println(lista);
            }
        }
        //Com generics
        List<String> lista2 = new ArrayList<>();
        lista2.add("beeru");
        lista2.add("Whiz");

        //verifica em tempo de compilação
        //type erasure (apaga o tipo depois que o código é compilado

    }
}
