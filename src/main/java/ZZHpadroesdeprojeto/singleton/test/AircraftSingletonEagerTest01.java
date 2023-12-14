package ZZHpadroesdeprojeto.singleton.test;

import ZZHpadroesdeprojeto.singleton.domain.AircraftSingletonEager;

/**
 * @author mariana
 * @Project: javacore
 */
public  class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A"); //false
    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSingletonEager.seats(seat));
        System.out.println(aircraftSingletonEager);

    }


}
