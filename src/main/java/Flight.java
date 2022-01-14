import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> CabinCrew;
    private ArrayList<Passenger> PassengerList;
    private Plane plane;
    private String FlightNo;
    private String dest;
    private String dept;
    private Date deptTime;
    private ArrayList<Integer> freeSeats;
    private int randomIndex;

    public Flight(Pilot pilot,
                  ArrayList<CabinCrewMember> cabinCrew,
                  Plane plane,
                  String flightNo,
                  String dest,
                  String dept,
                  Date deptTime) {

        this.pilot = pilot;
        this.CabinCrew = cabinCrew;
        this.plane = plane;
        this.FlightNo = flightNo;
        this.dest = dest;
        this.dept = dept;
        this.deptTime = deptTime;
        this.PassengerList = new ArrayList<>();
        this.freeSeats = new ArrayList<>();
        for (int i = 0; i <= (plane.getCapacity()-1); i++) {
            this.freeSeats.add(i+1);
        }
    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public ArrayList getCabinCrew() {
        return this.CabinCrew;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.FlightNo;
    }

    public String getDest() {
        return this.dest;
    }

    public String getDept() {
        return this.dept;
    }

    public Date getDeptTime() {
        return this.deptTime;
    }

    public ArrayList getPassengersList() {
        return this.PassengerList;
    }

    public void bookPassenger(Passenger _passenger) {
        if (this.getNoOfFreeSeats().size()>0){
            this.PassengerList.add(_passenger);
            _passenger.addFlightToPassenger(this);
            randomIndex = (int)(Math.random()*this.getNoOfFreeSeats().size() +1);
            _passenger.assignSeat(this.freeSeats.remove(randomIndex-1));
        } else {
            System.out.println("Sorry " + _passenger.getName() + ", no seats on this flight");
        }

    }

    public int getRemainingSeats() {
        return (this.plane.getCapacity()-this.getPassengersList().size());
    }

    public ArrayList<Integer> getNoOfFreeSeats() {
        return this.freeSeats;
    }
}
