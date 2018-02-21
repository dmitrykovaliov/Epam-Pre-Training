package task5.model;

import task5.util.ArList;
import task5.util.Container;

public abstract class Fleet {

    private String name;
    private Container<Vessel> container;
    private VesselCreator vesselCreator;


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

    public Container<Vessel> getContainer() {
        return container;
    }

    public Fleet() {
    }

    public Fleet(String name, VesselCreator vesselCreator) {
        this.name = name;
        this.container = new ArList<>();
        this.vesselCreator = vesselCreator;
    }

    public Vessel includeVessel(VesselTypes type, String name, String flag, double capacity) {
        return vesselCreator.createVessel(type, name, flag, capacity);
    }
}