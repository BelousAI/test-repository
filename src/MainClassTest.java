import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString() {
        String classStr = new MainClass().getClassString();

        Assert.assertTrue("The string doesn't contain \"Hello\" or \"hello\"",
                classStr.contains("Hello") || classStr.contains("hello"));
    }
}
