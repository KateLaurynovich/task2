package by.bsu.airline.comporator;

import by.bsu.airline.entity.Airliner;
import by.bsu.airline.entity.WideBodyAircraft;

import java.util.Comparator;

public class AircraftComparator implements Comparator<Airliner> {
    @Override
    public int compare(Airliner o1, Airliner o2) {
        return o1.getSeating() >o2.getSeating() ?  1 :o1.getSeating() < o2.getSeating() ? -1 :0;
    }
}
