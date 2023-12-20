package ZZHpadroesdeprojeto.singleton.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mariana
 * @Project: javacore
 */
public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats;


    AircraftSingletonEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");
    }

    public synchronized boolean seats(String seats) {
        return availableSeats.remove(seats);
    }
}
