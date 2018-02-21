package task5.model;

import java.util.Objects;

public abstract class Vessel {
    private String name;
    private String flag;
    private double capacity;

    public Vessel() {
    }

    public Vessel(String name, String flag, double capacity) {
        this.name = name;
        this.flag = flag;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vessel)) return false;
        Vessel vessel = (Vessel) o;
        return Double.compare(vessel.capacity, capacity) == 0 &&
                Objects.equals(name, vessel.name) &&
                Objects.equals(flag, vessel.flag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, flag, capacity);
    }

    @Override
    public String toString() {
        return "Vessel{" +
                "name='" + name + '\'' +
                ", flag='" + flag + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public abstract String load();
    public abstract String discharge();
}




