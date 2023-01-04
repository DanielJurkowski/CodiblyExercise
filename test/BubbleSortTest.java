import BubbleSort.BubbleSort;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
    @Test
    public void testBubbleSort() {

        List<Comparable<Integer>> input1 = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable<Integer>> result1 = Arrays.asList(1, 3, 4, 5, 6, 8, 8);

        List<Comparable<Double>> input2 = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Comparable<Double>> result2 = Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);

        List<Comparable<Integer>> input3 = List.of();
        List<Comparable<Integer>> result3 = List.of();

        List<Comparable<Double>> input4 = Arrays.asList(null, 5.0001);
        List<Comparable<Double>> result4 = Arrays.asList(5.0001);

        List<Comparable<Double>> input5 = null;

        assertEquals(result1, BubbleSort.sort(input1));
        assertEquals(result2, BubbleSort.sort(input2));
        assertEquals(result3, BubbleSort.sort(input3));
        assertEquals(result4, BubbleSort.sort(input4));

        try {
            BubbleSort.sort(input5);
        } catch (RuntimeException exception) {
            assertEquals(RuntimeException.class, exception.getClass());
        }
    }
}
