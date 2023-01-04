package BubbleSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static <T> List<Comparable<T>> sort(List<Comparable<T>> input) throws RuntimeException {
        if (input == null) {
            throw new RuntimeException();
        }

        List<Comparable<T>> sortedList = new ArrayList<>(input);

        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < sortedList.size() - 1; i++) {
                if (sortedList.get(i) == null || sortedList.get(i + 1) == null) {
                    continue;
                }

                if (sortedList.get(i).compareTo((T) sortedList.get(i + 1)) > 0) {
                    sorted = false;

                    swap(sortedList, i, i + 1);
                }
            }
        }
        sortedList.removeAll(Collections.singleton(null));

        return sortedList;
    }

    private static <T> void swap(List<Comparable<T>> input, int index1, int index2) {
        Comparable<T> temp = input.get(index1);

        input.set(index1, input.get(index2));
        input.set(index2, temp);
    }
}
