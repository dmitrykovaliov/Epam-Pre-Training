package task5.model;

public class VesselCreator {

    public Vessel createVessel(VesselTypes type, String name, String flag, double capacity) {
        Vessel vessel = null;

        if (type.equals(VesselTypes.BULKER)) {
            vessel = new Bulker(name, flag, capacity);
        } else if (type.equals(VesselTypes.TANKER)) {
            vessel = new Tanker(name, flag, capacity);
        }

        return vessel;
    }
}
