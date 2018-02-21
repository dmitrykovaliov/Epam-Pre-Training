package task5.controller;

import task5.model.AtlanticFleet;
import task5.model.Fleet;
import task5.model.PacificFleet;
import task5.model.Vessel;
import task5.model.VesselCreator;
import task5.view.View;

public class Test {

    public static void main(String[] args) {

        VesselCreator vesselCreator = new VesselCreator();

        Fleet fleet1 = new AtlanticFleet("AtlanticLadies", vesselCreator);

       Vessel vessel1 = fleet1.includeVessel("bulker", "Hemus", "Maltese", 25000 );
       Vessel vessel2 = fleet1.includeVessel("bulker", "Danube Ocean", "Barbados", 23000 );

       fleet1.getContainer().add(vessel1);
       fleet1.getContainer().add(vessel2);


        Fleet fleet2 = new PacificFleet("PacificLadies", vesselCreator);

        Vessel vessel3 = fleet2.includeVessel("tanker", "Blue Space", "Panama", 80000 );
        Vessel vessel4 = fleet2.includeVessel("tanker", "St. Nicholas", "Panama", 85000 );
        Vessel vessel5 = fleet2.includeVessel("bulker", "Big Creator", "Turkey", 18000 );

        fleet2.getContainer().add(vessel3);
        fleet2.getContainer().add(vessel4);
        fleet2.getContainer().add(vessel5);

        Fleet fleet3 = new AtlanticFleet("ProjectLadies", vesselCreator);

        View.print(fleet1.getContainer().toString().toString());
        View.print(fleet2.getContainer().toString().toString());
        View.print(fleet3.getContainer().toString().toString());

        View.print("Total capacity: " + fleet1.getName());
        View.print(fleet1.calculateTotalCapacity());
        View.print("Total capacity: " + fleet2.getName());
        View.print(fleet2.calculateTotalCapacity());

        View.print("Total capacity: " + fleet3.getName());
        View.print(fleet3.calculateTotalCapacity());

    }
}
