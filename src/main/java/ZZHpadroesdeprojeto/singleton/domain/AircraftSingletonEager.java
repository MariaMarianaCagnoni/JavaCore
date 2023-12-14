package ZZHpadroesdeprojeto.singleton.domain;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mariana
 * @Project: javacore
 */
public final class AircraftSingletonEager {
    private final String model;
    private AircraftSingletonEager(String model) {
        this.model = model;
    }



    @Getter
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
        availableSeats.add("1C");
    }

    public boolean seats(String seats) {
        return availableSeats.remove(seats);
    }

    @Override
    public String toString() {
        return "AircraftSingletonEager{" +
                "model='" + model + '\'' +
                ", availableSeats=" + availableSeats +
                '}';
    }
}



