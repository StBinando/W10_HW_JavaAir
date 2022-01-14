import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Pilot pilot1;
    CabinCrewMember hostess1;
    CabinCrewMember coPilot1;
    ArrayList<CabinCrewMember> cabinCrew;
    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;
    Passenger passenger9;

    Flight flight1;
    Date deptTime1;

    @Before
    public void before(){
        pilot1 = new Pilot("Sully",Rank.CAPTAIN,"AZX987");
        hostess1 = new CabinCrewMember("Aga", Rank.FLIGHT_ATTENDANT);
        coPilot1 = new CabinCrewMember("Bob", Rank.FIRST_OFFICER);
        cabinCrew = new ArrayList<>();
        cabinCrew.add(hostess1);
        cabinCrew.add(coPilot1);
        plane1 = Plane.CESSNA650;
        deptTime1 = new Date(2022, 2, 12, 6, 50 );

        flight1 = new Flight(pilot1,
                cabinCrew,
                plane1,
                "AZ666",
                "TRN",
                "EDI",
                deptTime1);

        passenger1 = new Passenger("Alice", 2);
        passenger2 = new Passenger("Carl", 1);
        passenger3 = new Passenger("Simon", 0);
        passenger4 = new Passenger("Dana", 1);
        passenger5 = new Passenger("Emma", 1);
        passenger6 = new Passenger("Frank", 1);
        passenger7 = new Passenger("George", 1);
        passenger8 = new Passenger("Harry", 1);
        passenger9 = new Passenger("Jenny", 1);
    }

    @Test
    public void flightHasCaptain(){
        assertEquals("Sully",flight1.getPilot().getName());
    }

    @Test
    public void flightHas2CCM(){
        assertEquals(2, flight1.getCabinCrew().size());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(Plane.CESSNA650, flight1.getPlane());
    }

    @Test
    public void flightHasNo(){
        assertEquals("AZ666", flight1.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("TRN", flight1.getDest());
    }

    @Test
    public void flightHasDeparture(){
        assertEquals("EDI", flight1.getDept());
    }

    @Test
    public void flightHasDeptTime(){
        assertEquals(deptTime1, flight1.getDeptTime());
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight1.getPassengersList().size());
    }

    @Test
    public void flightCanBookPassengers(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(3, flight1.getPassengersList().size());
    }

    @Test
    public void flightCanCheckRemainingSeats(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(5, flight1.getRemainingSeats());
    }

    @Test
    public void flightCanAddFlightToPassenger(){
        flight1.bookPassenger(passenger1);
        assertEquals(flight1, passenger1.getFlight());
    }

    @Test
    public void flightStartsWithAllEmptySeats(){
        assertEquals(8, flight1.getNoOfFreeSeats().size());
    }

    @Test
    public void flightCanAssignUniqueSeatToPassenger(){
        assertEquals(8, flight1.getNoOfFreeSeats().size());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger1);
        System.out.println("Passenger 1 "+passenger1.getName() +" - seat no: " + passenger1.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger2);
        System.out.println("Passenger 2 "+passenger2.getName() +" - seat no: " + passenger2.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger3);
        System.out.println("Passenger 3 "+passenger3.getName() +" - seat no: " + passenger3.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger4);
        System.out.println("Passenger 4 "+passenger4.getName() +" - seat no: " + passenger4.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger5);
        System.out.println("Passenger 5 "+passenger5.getName() +" - seat no: " + passenger5.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger6);
        System.out.println("Passenger 6 "+passenger6.getName() +" - seat no: " + passenger6.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger7);
        System.out.println("Passenger 7 "+passenger7.getName() +" - seat no: " + passenger7.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger8);
        System.out.println("Passenger 8 "+passenger8.getName() +" - seat no: " + passenger8.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
        flight1.bookPassenger(passenger9);
        System.out.println("Passenger 9 "+passenger9.getName() +" - seat no: " + passenger9.getSeatNo());
        System.out.println("free seats remaining: " + flight1.getNoOfFreeSeats().size());
        System.out.println("----------------------------------");
    }
}
