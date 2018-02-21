package task5.model;

public class Bulker extends Vessel implements Bulk {

    public Bulker(String name, String flag, double capacity) {
        super(name, flag, capacity);
    }

    @Override
    public boolean bulkTransfer() {
        return true;
    }

    @Override
    public String load() {
        return "Loading with loader";
    }

    @Override
    public String discharge() {
        return "Discharging with grabbers";
    }
}
