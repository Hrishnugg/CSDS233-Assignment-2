import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    // Test for checking push method
    @Test
    public void testPush() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int expected = 3;
        int actual = stack.peek();

        // Asserts that two ints are equal.
        assertEquals(expected, actual);
    }

    // Test for checking pop method
    @Test
    public void testPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int expected = 3;
        int actual = stack.pop();

        // Asserts that two ints are equal.
        assertEquals(expected, actual);
    }

    // Test for checking peek method
    @Test
    public void testPeek() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int expected = 3;
        int actual = stack.peek();

        // Asserts that two ints are equal.
        assertEquals(expected, actual);
    }

    // Test for checking isEmpty method
    @Test
    public void testIsEmpty() {
        Stack<Integer> stack = new Stack<>();
        boolean expected = true;
        boolean actual = stack.isEmpty();

        // Asserts that two booleans are equal.
        assertEquals(expected, actual);
    }
}
