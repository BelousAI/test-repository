import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassNumber() {
        int classNum = new MainClass().getClassNumber();

        Assert.assertTrue("Class number <= 45", classNum > 45);
    }
}
