package by.bsu.airline.entity;

public abstract class Aircraft {
    private double langthAircraft;
    private double hightAircraft;
    private String nameAircraft;

    public double getLangthAircraft() {
        return langthAircraft;
    }

    public void setLangthAircraft(int langthAircraft) {
        this.langthAircraft = langthAircraft;
    }

    public double getHightAircraft() {
        return hightAircraft;
    }

    public void setHightAircraft(int hightAircraft) {
        this.hightAircraft = hightAircraft;
    }

    public String getNameAircraft() {
        return nameAircraft;
    }

    public void setNameAircraft(String nameAircraft) {
        this.nameAircraft = nameAircraft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aircraft aircraft = (Aircraft) o;

        if (Double.compare(aircraft.langthAircraft, langthAircraft) != 0) return false;
        if (Double.compare(aircraft.hightAircraft, hightAircraft) != 0) return false;
        return nameAircraft != null ? nameAircraft.equals(aircraft.nameAircraft) : aircraft.nameAircraft == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(langthAircraft);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hightAircraft);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (nameAircraft != null ? nameAircraft.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "langthAircraft=" + langthAircraft +
                ", hightAircraft=" + hightAircraft +
                ", nameAircraft='" + nameAircraft + '\'' +
                '}';
    }
}
