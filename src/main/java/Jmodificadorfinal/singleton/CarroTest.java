package Jmodificadorfinal.singleton;

/**
 * @author mariana
 * @Project: javacore
 */
public class CarroTest {
    public static void main(String[] args) {


        Carro carroSingleton = Carro.getInstance();
        Carro carroSingleton2 = Carro.getInstance();
        Carro carroSingleton3 = Carro.getInstance();
        System.out.println(carroSingleton);
        System.out.println(carroSingleton2);
        System.out.println(carroSingleton3);

        //mesma intancia,variaveis de referencia diferentes


    }


}
