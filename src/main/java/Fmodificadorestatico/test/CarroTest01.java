package Fmodificadorestatico.test;

import Fmodificadorestatico.domain.Carro;

/**
 * @author mariana
 * @Project: javacore
 */
public class CarroTest01 {

    public static void main(String[] args) {

        Carro.setLimiteMaximo(500);

        Carro carro1 = new Carro("BMW", "audi",300,1996);
        System.out.println(carro1);
        Carro carro2 = new Carro("BMW", "audi",300,2023);
        System.out.println(carro2);
        System.out.println(carro1);


        System.out.println(Carro.getLimiteMaximo());

    }


}
