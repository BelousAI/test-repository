import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        int expected = 14;
        int actual = new MainClass().getLocalNumber();

        Assert.assertTrue("Current number != 14", expected == actual);
    }
}
