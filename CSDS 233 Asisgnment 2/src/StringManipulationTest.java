import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringManipulationTest {

    @Test
    public void testToPostfix() {
        String infix = "1 + 2 * 3";
        String expected = "1 2 3 * +";
        String result = StringManipulation.toPostfix(infix);
        assertEquals(expected, result);
    }

    @Test
    public void testResult() {
        String postfix = "1 2 3 * +";
        int expected = 7;
        int result = StringManipulation.result(postfix);
        assertEquals(expected, result);
    }

    @Test
    public void testSmallestNumber() {
        String number = "70004";
        int n = 1;
        String expected = "4";
        String result = StringManipulation.smallestNumber(number, n);
        assertEquals(expected, result);
    }

    @Test
    public void testUnbelievableString() {
        String s = "abDDdddE";
        String expected = "abdE";
        String result = StringManipulation.unbelievableString(s);
        assertEquals(expected, result);
    }
}
