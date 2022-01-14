public class Passenger extends Person {

    private int numBags;
    private Flight flight;
    private int seatNo;

    public Passenger(String name, int _numBags) {
        super(name);
        this.numBags = _numBags;
    }

    public int getBags() {
        return this.numBags;
    }

    public void addFlightToPassenger(Flight _flight){
        this.flight = _flight;
    }

    public Flight getFlight(){
        return this.flight;
    }

    public void assignSeat(Integer _seat) {
        this.seatNo = _seat;
    }

    public int getSeatNo() {
        return this.seatNo;
    }
}
