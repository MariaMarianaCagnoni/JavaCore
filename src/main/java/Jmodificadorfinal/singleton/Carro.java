package Jmodificadorfinal.singleton;

/**
 * @author mariana
 * @Project: javacore
 */
public class Carro {
    private static Carro INSTANCE;

     private Carro() {
    }

    public static Carro getInstance() {
        if (INSTANCE == null) {
            synchronized (Carro.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Carro();
                }
            }

        }
        return INSTANCE;
    }
}
