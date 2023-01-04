import BalancedWordsCounter.BalancedWordsCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {
    @Test
    public void testBalancedWordsCounter() {
        String input1 = "aabbabcccba";
        int result1 = 28;

        String input2 = "";
        int result2 = 0;

        String input3 = "abababa1";

        String input4 = null;

        assertEquals(result1, BalancedWordsCounter.count(input1));
        assertEquals(result2, BalancedWordsCounter.count(input2));

        try {
            BalancedWordsCounter.count(input3);
        } catch (RuntimeException exception) {
            assertEquals(RuntimeException.class, exception.getClass());
        }

        try {
            BalancedWordsCounter.count(input4);
            ;
        } catch (RuntimeException exception) {
            assertEquals(RuntimeException.class, exception.getClass());
        }
    }
}
