public class Passenger extends Person {

    private int numBags;

    public Passenger(String name, int _numBags) {
        super(name);
        this.numBags = _numBags;
    }

    public int getBags() {
        return this.numBags;
    }
}
