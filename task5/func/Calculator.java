package task5.func;

import task5.model.Vessel;
import task6.exception.EmptySetException;
import task6.exception.OutIndexException;
import task6.util.array.UniList;

public class Calculator {



    public static double calculateTotalCapacity(UniList<Vessel> container) throws EmptySetException, OutIndexException {

        double totalCapacity = 0;

        for (int i = 0; i < container.size(); i++) {
            Vessel vessel = container.get(i);
            totalCapacity += vessel.getCapacity();
        }

        return totalCapacity;
    }

}
