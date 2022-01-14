import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;

    @Before
    public void before(){
        pilot1 = new Pilot("Sully", Rank.CAPTAIN, "AZX987");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Sully", pilot1.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(Rank.CAPTAIN,pilot1.getRank());
    }

    @Test
    public void pilotHasLicence() {
        assertEquals("AZX987", pilot1.getLicenceNo());
    }

    @Test
    public void pilotCanSpeak(){
        assertEquals("Brace for impact!", pilot1.relayMsg());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("I believe I can fly...!", pilot1.flyPlane());
    }
}
