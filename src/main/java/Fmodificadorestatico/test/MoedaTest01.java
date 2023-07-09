package Fmodificadorestatico.test;

import Fmodificadorestatico.domain.Moeda;

/**
 * @author mariana
 * @Project: javacore
 */
public class MoedaTest01 {

    public static void main(String[] args) {

        Moeda moeda = new Moeda("mariana",20.0);
        Moeda moeda2 = new Moeda("paulo",30.0);
        Moeda moeda3 = new Moeda("paula",50);

        System.out.println(moeda);
        System.out.println(moeda2);
        System.out.println(moeda3);



    }
}
