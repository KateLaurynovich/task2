package by.bsu.airline.entity;

import by.bsu.airline.entity.Aircraft;

public class CargoAircraft extends Aircraft {
    private int carrying;


    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargoAircraft that = (CargoAircraft) o;

        return carrying == that.carrying;
    }

    @Override
    public int hashCode() {
        return carrying;
    }

    @Override
    public String toString() {
        return "CargoAircraft{" +
                "carrying=" + carrying +
                '}';
    }
}
