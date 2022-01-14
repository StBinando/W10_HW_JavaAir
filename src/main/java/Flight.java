import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> CabinCrew;
    private ArrayList<Passenger> PassengerList;
    private Plane plane;
    private String FlightNo;
    private String dest;
    private String dept;
    private String deptTime;

    public Flight(Pilot pilot,
                  ArrayList<CabinCrewMember> cabinCrew,
                  Plane plane,
                  String flightNo,
                  String dest,
                  String dept,
                  String deptTime) {

        this.pilot = pilot;
        this.CabinCrew = cabinCrew;
        this.plane = plane;
        this.FlightNo = flightNo;
        this.dest = dest;
        this.dept = dept;
        this.deptTime = deptTime;
        this.PassengerList = new ArrayList<>();
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

    public String getDeptTime() {
        return this.deptTime;
    }

    public ArrayList getPassengersList() {
        return this.PassengerList;
    }

    public void bookPassenger(Passenger _passenger) {
        this.PassengerList.add(_passenger);
    }

    public int getRemainingSeats() {
        return (this.plane.getCapacity()-this.getPassengersList().size());
    }
}
