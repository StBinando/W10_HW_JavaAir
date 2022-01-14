public class CabinCrewMember extends Person{

    private Rank rank;

    public CabinCrewMember(String name, Rank _rank) {
        super(name);
        this.rank = _rank;
    }

    public Rank getRank(){
        return this.rank;
    }

    public String relayMsg(){
        return "Brace for impact!";
    }
}
