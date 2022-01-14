public enum Plane {
    BOING747(70,2800),
    CESSNA650(20,600)
    ;

    private final int capacity;
    private final int weight;

    Plane(int _capacity, int _weight) {
        this.capacity = _capacity;
        this.weight = _weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }
}
