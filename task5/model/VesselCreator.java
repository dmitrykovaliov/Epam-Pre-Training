package task5.model;

public class VesselCreator {

    public Vessel createVessel(String type, String name, String flag, double capacity) {
        Vessel vessel = null;

        if (type.equals("bulker")) {
            vessel = new Bulker(name, flag, capacity);
        } else if (type.equals("tanker")) {
            vessel = new Tanker(name, flag, capacity);
        }

        return vessel;
    }
}
