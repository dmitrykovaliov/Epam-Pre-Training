package task5.controller;

import task5.func.Calculator;
import task5.model.*;
import task5.view.View;
import task6.exception.EmptySetException;
import task6.exception.OutIndexException;

public class Test {

    public static void main(String[] args) {


        try {
            VesselCreator vesselCreator = new VesselCreator();

            Fleet fleet1 = new Fleet("AtlanticLadies", vesselCreator);

            Vessel vessel1 = fleet1.includeVessel(VesselTypes.BULKER, "Hemus", "Maltese", 25000 );
            Vessel vessel2 = fleet1.includeVessel(VesselTypes.BULKER, "Danube Ocean", "Barbados", 23000 );

            fleet1.getContainer().add(vessel1);
            fleet1.getContainer().add(vessel2);


            Fleet fleet2 = new Fleet("PacificLadies", vesselCreator);

            Vessel vessel3 = fleet2.includeVessel(VesselTypes.TANKER, "Blue Space", "Panama", 80000 );
            Vessel vessel4 = fleet2.includeVessel(VesselTypes.TANKER, "St. Nicholas", "Panama", 85000 );
            Vessel vessel5 = fleet2.includeVessel(VesselTypes.BULKER, "Big Creator", "Turkey", 18000 );

            fleet2.getContainer().add(vessel3);
            fleet2.getContainer().add(vessel4);
            fleet2.getContainer().add(vessel5);

            Fleet fleet3 = new Fleet("ProjectLadies", vesselCreator);

            View.print(fleet1.getContainer().toString().toString());
            View.print(fleet2.getContainer().toString().toString());
            View.print(fleet3.getContainer().toString().toString());

            View.print("Total capacity: " + fleet1.getName());
            View.print(Calculator.calculateTotalCapacity(fleet1.getContainer()));
            View.print("Total capacity: " + fleet2.getName());
            View.print(Calculator.calculateTotalCapacity(fleet2.getContainer()));

            View.print("Total capacity: " + fleet3.getName());
            View.print(Calculator.calculateTotalCapacity(fleet3.getContainer()));
        } catch (OutIndexException e) {
            e.printStackTrace();
        } catch (EmptySetException e) {
            e.printStackTrace();
        }

    }
}
