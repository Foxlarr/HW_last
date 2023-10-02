import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.example.ListAverageComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListAverageComparatorTest {

    private ListAverageComparator comparator;

    @BeforeEach
    public void setUp() {
        comparator = new ListAverageComparator();
    }

    @Test
    public void testCompareAverages_FirstListGreater() {
        List<Double> list1 = Arrays.asList(5.0, 6.0, 7.0);
        List<Double> list2 = Arrays.asList(3.0, 4.0, 5.0);

        String result = comparator.compareAverages(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverages_SecondListGreater() {
        List<Double> list1 = Arrays.asList(3.0, 4.0, 5.0);
        List<Double> list2 = Arrays.asList(5.0, 6.0, 7.0);

        String result = comparator.compareAverages(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverages_EqualAverages() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);

        String result = comparator.compareAverages(list1, list2);

        assertEquals("Средние значения равны", result);
    }
}
