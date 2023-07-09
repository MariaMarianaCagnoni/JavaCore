package Jmodificadorfinal.singleton;

/**
 * @author mariana
 * @Project: javacore
 */
public class Carro {

    private static Carro INSTANCE;


    public static Carro getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Carro();
        }
        return INSTANCE;
    }
}
