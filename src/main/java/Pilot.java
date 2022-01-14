public class Pilot extends CabinCrewMember{

    private String licenceNo;

    public Pilot(String name, Rank _rank, String _licenceNo) {
        super(name, _rank);
        this.licenceNo = _licenceNo;
    }

    public String getLicenceNo(){
        return this.licenceNo;
    }

    public String flyPlane() {
        return "I believe I can fly...!";
    }

}
