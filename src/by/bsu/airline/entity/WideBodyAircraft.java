package by.bsu.airline.entity;

public class WideBodyAircraft extends Airliner {

    private int businessClass;
    private int economyClass;
    private int carrying;

    public int getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(int businessClass) {
        this.businessClass = businessClass;
    }

    public int getEconomyClass() {
        return economyClass;
    }

    public void setEconomyClass(int economyClass) {
        this.economyClass = economyClass;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "WideBodyAircraft{" +
                "businessClass=" + businessClass +
                ", economyClass=" + economyClass +
                ", carrying=" + carrying +

                '}';
    }
}
