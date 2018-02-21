package task5.model;

public class Tanker extends Vessel implements Oil {

    public Tanker(String name, String flag, double capacity) {
        super(name, flag, capacity);
    }

    @Override
    public boolean oilTransfer() {
        return true;
    }

    @Override
    public String load() {
        return "Loading with hoses";
    }

    @Override
    public String discharge() {
        return "Discharging with hoses";
    }
}
