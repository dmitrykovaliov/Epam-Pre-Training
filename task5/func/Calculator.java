package task5.func;

import task5.model.Vessel;
import task5.util.Container;

public class Calculator {



    public static double calculateTotalCapacity(Container<Vessel> container) {

        double totalCapacity = 0;

        for (int i = 0; i < container.size(); i++) {
            Vessel vessel = container.get(i);
            totalCapacity += vessel.getCapacity();
        }

        return totalCapacity;
    }

}
