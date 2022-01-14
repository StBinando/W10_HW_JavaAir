import java.util.ArrayList;

public class FlightManager {
    private Plane plane;
    private ArrayList<Passenger> pl;
    private int total;


    public int getWeightForPassenger(Flight _flight) {
        plane = _flight.getPlane();
        return (plane.getWeight()/2)/plane.getCapacity();
    }

    public int getTotalWeightBags(Flight _flight) {
        plane = _flight.getPlane();
        pl = _flight.getPassengersList();
        total = 0;
        for (Passenger p: pl){
            total += (p.getBags()*this.getWeightForPassenger(_flight));
        }
        return  total;
    }

    public int getRemainingWeight(Flight _flight) {
        plane = _flight.getPlane();
        return plane.getWeight()-this.getTotalWeightBags(_flight);

    }
}
