import org.junit.Assert;
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
}