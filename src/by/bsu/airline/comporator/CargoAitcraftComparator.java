package by.bsu.airline.comporator;

import by.bsu.airline.entity.CargoAircraft;

import java.util.Comparator;

public class CargoAitcraftComparator implements Comparator<CargoAircraft>{
    @Override
    public int compare(CargoAircraft firstCA, CargoAircraft secondCA) {
        return firstCA.getCarrying() < secondCA.getCarrying() ? 1: firstCA.getCarrying() > secondCA.getCarrying() ? -1 : 0;
    }
}
