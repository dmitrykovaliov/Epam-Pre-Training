package task5.model;

import task5.util.ArList;

public abstract class Fleet {

    protected String name;
    private ArList<Vessel> container;
    private VesselCreator vesselCreator;
    private double totalCapacity;

    public VesselCreator getVesselCreator() {
        return vesselCreator;
    }

    public void setVesselCreator(VesselCreator vesselCreator) {
        this.vesselCreator = vesselCreator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArList<Vessel> getContainer() {
        return container;
    }

    public Fleet() {
    }

    public Fleet(String name, VesselCreator vesselCreator) {
        this.name = name;
        this.container = new ArList<>();
        this.vesselCreator = vesselCreator;
    }

    public Vessel includeVessel(String type, String name, String flag, double capacity) {
        Vessel vessel = vesselCreator.createVessel(type, name, flag, capacity);
        return vessel;
    }

    public double calculateTotalCapacity() {
        for (int i = 0; i < container.size(); i++) {
            Vessel vessel = (Vessel)container.get(i);
            totalCapacity += vessel.capacity;
        }
        return totalCapacity;
    }


}