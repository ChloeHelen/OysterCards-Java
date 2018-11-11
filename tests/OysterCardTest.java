import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class OysterCardTest {
    @Test
    public void initialValue() {
        OysterCard oysterCard = new OysterCard();
        assertEquals(0, oysterCard.getValue());
    }

    @Test
    public void topUpTest() {
        OysterCard oysterCard = new OysterCard();
        oysterCard.topUp(10);
        oysterCard.topUp(20);
        assertEquals(30, oysterCard.getValue());
    }

    @Test (expected = IllegalArgumentException.class)
    public void maximumValueTest() {
        OysterCard oysterCard = new OysterCard();
        oysterCard.topUp(OysterCard.MAXIMUM_VALUE + 2);
    }

    @Test
    public void deductTest() {
        OysterCard oysterCard = new OysterCard();
        oysterCard.topUp(20);
        oysterCard.deduct(10);
        assertEquals(10, oysterCard.getValue());
    }

    @Test
    public void inJourneyTrueTest() {
        OysterCard oysterCard = new OysterCard();
        oysterCard.touchIn();
        assertEquals(true, oysterCard.isInJourney());
    }

    @Test
    public void inJourneyFalseTest() {
        OysterCard oysterCard = new OysterCard();
        oysterCard.touchIn();
        oysterCard.touchOut();
        assertEquals(false, oysterCard.isInJourney());
    }


}

