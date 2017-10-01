package by.bsu.airline.entity;

public class NarrowBodyAircraft extends Airliner {

    private int businessClass;
    private int firstClass;
    private int economyClass;
    private int carrying;



    public int getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(int businessClass) {
        this.businessClass = businessClass;
    }

    public int getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(int firstClass) {
        this.firstClass = firstClass;
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
}
