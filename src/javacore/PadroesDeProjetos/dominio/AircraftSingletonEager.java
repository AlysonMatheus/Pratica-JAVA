package javacore.PadroesDeProjetos.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats= new HashSet<>();
    private final String name;

   private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");

    }


    public static AircraftSingletonEager getINSTANCE(){
        return INSTANCE;
    }
    public String getName() {
        return name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
