package javacore.PadroesDeProjetos.Test;

import javacore.PadroesDeProjetos.dominio.AircraftSingletonEager;
import javacore.PadroesDeProjetos.dominio.AircraftSingletonEnum;
import javacore.PadroesDeProjetos.dominio.AircraftSingletonLazy;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraft.bookSeat(seat));
    }
}
