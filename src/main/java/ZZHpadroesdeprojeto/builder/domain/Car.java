package ZZHpadroesdeprojeto.builder.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Car {
    private final int seats;
    private final CarType carType;
    private double fuel = 0;
    private final TripComputer tripComputer;

    private final Transmission transmission;

    private final GPSNavigator gpsNavigator;

    private final Engine engine;

    public Car(int seats, CarType carType, double fuel, TripComputer tripComputer, Transmission transmission, GPSNavigator gpsNavigator, Engine engine) {
        this.seats = seats;
        this.carType = carType;
        this.fuel = fuel;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public Engine getEngine() {
        return engine;
    }
}
