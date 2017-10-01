package by.bsu.airline.entity;



public class Airliner extends by.bsu.airline.entity.Aircraft {
    private int seating;

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Airliner airliner = (Airliner) o;

        return seating == airliner.seating;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + seating;
        return result;
    }

    @Override
    public String toString() {
        return "Airliner{" +
                "seating=" + seating +
                '}';
    }
}
