package ZZHpadroesdeprojeto.builder.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Engine {
    private final double volume;
    private double mileage; //quilometragem
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;

    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

}
