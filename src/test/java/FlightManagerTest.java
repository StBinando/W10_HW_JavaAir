import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Pilot pilot1;
    CabinCrewMember hostess1;
    CabinCrewMember coPilot1;
    ArrayList<CabinCrewMember> cabinCrew;
    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Flight flight1;
    FlightManager FM;

    @Before
    public void before(){
        pilot1 = new Pilot("Sully",Rank.CAPTAIN,"AZX987");
        hostess1 = new CabinCrewMember("Aga", Rank.FLIGHT_ATTENDANT);
        coPilot1 = new CabinCrewMember("Bob", Rank.FIRST_OFFICER);
        cabinCrew = new ArrayList<>();
        cabinCrew.add(hostess1);
        cabinCrew.add(coPilot1);
        plane1 = Plane.CESSNA650;

        flight1 = new Flight(pilot1,
                cabinCrew,
                plane1,
                "AZ666",
                "TRN",
                "EDI",
                "0650");

        passenger1 = new Passenger("Alice", 2);
        passenger2 = new Passenger("Carl", 1);
        passenger3 = new Passenger("Simon", 0);

        FM = new FlightManager();
    }
    @Test
    public void FMCanGetWeightPerPassenger(){
        assertEquals(30, FM.getWeightForPassenger(flight1));
    }

    @Test
    public void FMcanGetTotalWeightBookedByPassengers(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(90, FM.getTotalWeightBags(flight1));
    }

    @Test
    public void FMcanGetRemainingWeight(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(1110, FM.getRemainingWeight(flight1));
    }
}
