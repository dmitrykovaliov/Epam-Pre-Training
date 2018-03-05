package task5.model;

import task5.util.Container;
import task6.util.array.UniList;


public class Fleet {

    private String name;
    private UniList<Vessel> container;
    private VesselCreator vesselCreator;

    public Fleet() {
        this.container = new Container<>();
    }

    public Fleet(String name, VesselCreator vesselCreator) {
        this.name = name;
        this.container = new Container<>();
        this.vesselCreator = vesselCreator;
    }

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

    public UniList<Vessel> getContainer() {
        return container;
    }



    public Vessel includeVessel(VesselTypes type, String name, String flag, double capacity) {
        return vesselCreator.createVessel(type, name, flag, capacity);
    }
}