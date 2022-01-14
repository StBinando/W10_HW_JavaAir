import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember hostess1;

    @Before
    public void before(){
        hostess1 = new CabinCrewMember("Aga",Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void CCMHasName(){
        assertEquals("Aga", hostess1.getName());
    }

    @Test
    public void CCMHasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, hostess1.getRank());
    }
}
