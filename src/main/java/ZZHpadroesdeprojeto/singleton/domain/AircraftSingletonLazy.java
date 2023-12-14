package ZZHpadroesdeprojeto.singleton.domain;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mariana
 * @Project: javacore
 */
public final class AircraftSingletonLazy {
    private final String model;
    private static AircraftSingletonLazy INSTANCE;

    private AircraftSingletonLazy(String model) {
        this.model = model;
    }


    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    private final Set<String> availableSeats = new HashSet<>();

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
        availableSeats.add("1C");
    }

    public boolean seats(String seats) {
        return availableSeats.remove(seats);
    }

}



