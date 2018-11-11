import org.junit.Assert;
import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class OysterCardTest {
    @Test
    public void initialValue() {
        OysterCard oysterCard = new OysterCard();
        assertEquals(0, oysterCard.getValue());
    }
}