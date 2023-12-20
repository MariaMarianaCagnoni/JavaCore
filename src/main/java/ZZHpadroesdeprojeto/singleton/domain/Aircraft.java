package ZZHpadroesdeprojeto.singleton.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mariana
 * @Project: javacore
 */

public final class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();

    public Set<String> getAvailableSeats() {
        return availableSeats;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
        availableSeats.add("1C");
    }

    public boolean seats(String seats) {
        return availableSeats.remove(seats);
    }
}
