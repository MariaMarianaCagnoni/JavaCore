package Jmodificadorfinal.test;

import Jmodificadorfinal.domain.Carro;

/**
 * @author mariana
 * @Project: javacore
 */
public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro("Ferrari");
        carro.COMPRADOR.setNome("Mariana");

        carro.imprimir();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        Carro carro1 = new Carro("Fusca");
//       carro.COMPRADOR =  carro1.COMPRADOR;//não posso apontar pra outro objeto




    }


}
